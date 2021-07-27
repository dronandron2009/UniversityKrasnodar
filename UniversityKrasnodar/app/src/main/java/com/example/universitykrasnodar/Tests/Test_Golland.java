package com.example.universitykrasnodar.Tests;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.universitykrasnodar.R;

import java.util.ArrayList;

public class Test_Golland extends Fragment {
    private String[] A = {"инженер техник", "вязальщик", "повар", "фотограф", "чертежник", "философ", "ученый-химик", "редактор научного журнала", "лингвист", "педиатр", "организатор воспитательной работы", "спортивный врач", "нотариус",
            "перфоратор", "политический деятель", "садовник", "водитель", "инженер-электрик", "маляр", "биолог", "телеоператор", "гидролог", "зоолог", "математик", "работник ИДН", "учитель", "воспитатель", "экономист", "корректор", "завхоз", "радиоинженер",
            "водопроводчик", "агроном", "закройщик-модельер", "археолог", "работник музея", "ученый", "логопед", "врач", "главный бухгалтер", "поэт", "архивариус"};
    private String[] B = {"инженер-контролер", "санитарный врач", "наборщик", "зав. магазином", "дизайнер", "психиатр", "бухгалтер", "адвокат", "переводчик художественной литературы", "статистик", "председатель профсоюза", "фельетонист",
            "снабженец", "карикатурист", "писатель", "метеоролог", "медсестра", "секретарь-машинистка", "художник по металлу", "главный врач", "режиссер", "ревизор", "зоотехник", "архитектор", "счетовод", "милиционер", "художник по керамике", "заведующий отделом",
            "критик", "директор", "специалист по ядерной физике", "наборщик", "председатель сельхозкооператива", "декоратор", "эксперт", "консультант", "актер", "стенографист", "дипломат", "директор", "психолог", "скульптор",};
    private String[] Real_tip = {"инженер техник", "вязальщик", "повар", "фотограф", "чертежник", "садовник","водитель", "инженер-электрик", "маляр", "телеоператор", "радиоинженер", "водопроводчик", "агроном", "закройщик-модельер"};
    private String[] Intel_tip = {"инженер-контролер", "философ", "ученый-химик", "редактор научного журнала", "лингвист", "метеоролог", "биолог", "гидролог", "зоолог", "математик", "специалист по ядерной физике", "археолог", "работник музея", "ученый"};
    private String[] Soc_tip = {"санитарный врач", "психиатр", "педиатр", "организатор воспитательной работы", "спортивный врач", "медсестра", "критик", "работник ИДН", "учитель", "воспитатель", "консультант", "логопед", "врач", "психолог"};
    private String[] Kon_tip = {"наборщик", "бухгалтер", "статистик", "нотариус", "перфоратор", "секретарь-машинистка", "ревизор", "счетовод", "экономист", "корректор", "наборщик", "стенографист", "главный бухгалтер", "архивариус"};
    private String[] Predpinimatel_tip = {"зав. магазином", "адвокат", "председатель профсоюза", "снабженец", "политический деятель", "зоотехник", "заведующий отделом", "завхоз", "специалист по ядерной физике", "эксперт", "актер", "дипломат", "директор"};
    private String[] Artist_tip = {"дизайнер", "переводчик художественной литературы", "фельетонист", "карикатурист", "писатель", "художник по металлу", "режиссер", "математик", "художник по керамике", "критик", "директор", "декоратор", "поэт", "скульптор"};
    private String[] otvet = new String[42];
    private ArrayList<RadioGroup> Radiobutton_button = new ArrayList();
    private LinearLayout llgoland_test = null;
    private int k = 1;
    public int real;
    public int intel;
    public int soc;
    public int kon;
    public int pred;
    public int artist;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test__golland, container, false);

        initViews(view);
        for (int i = 0; i <= 41; i++) {
            LinearLayout llgolland = createFacultyLinearLayout();
            RadioGroup radioGroup = createGollandRadioGroup();
            RadioButton radioButton = otvet_a(i);
            RadioButton radioButton2 = otvet_b(i);
            TextView text_golland = text();
            radioGroup.addView(radioButton);
            radioGroup.addView(radioButton2);
            Radiobutton_button.add(radioGroup);
            llgolland.addView(text_golland);
            llgolland.addView(radioGroup);
            setClickListenerForRadio_Group(i, radioButton, radioButton2);
            llgoland_test.addView(llgolland);
        }
        zaver(view);
        return view;
    }





    private void initViews(View view) {
        llgoland_test = view.findViewById(R.id.llgolland);
    }

    private LinearLayout createFacultyLinearLayout() {
        Context context = getContext();
        int id = View.generateViewId();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(7, 10, 7, 10);
        if (context == null) return null;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundResource(R.drawable.style_main_shape);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(id);

        return linearLayout;
    }

    private TextView text() {
        Context context = getContext();
        int id = View.generateViewId();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        TextView textView = new TextView(context);
        textView.setId(id);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(50, 50, 50, 50);
        textView.setText(R.string.text_golland);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        textView.setTextColor(Color.parseColor(color));
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 19);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private RadioGroup createGollandRadioGroup() {
        Context context = getContext();
        int id = View.generateViewId();
        RadioGroup radioButton = new RadioGroup(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        radioButton.setId(id);
        return radioButton;
    }

    private RadioButton otvet_a(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 50, 50, 50);
        radioButton.setText(A[i]);
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }

    private RadioButton otvet_b(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 50, 50, 50);
        radioButton.setText(B[i]);
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }

    private void setClickListenerForRadio_Group(int indexOfButton, RadioButton button_a, RadioButton button_b) {
        RadioGroup radioGroups = Radiobutton_button.get(indexOfButton);
        radioGroups.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                otvet[indexOfButton] = "";
                if (button_a.isChecked() == true) {
                    otvet[indexOfButton] = A[indexOfButton];
                }
                if (button_b.isChecked() == true) {
                    otvet[indexOfButton] = B[indexOfButton];
                }
            }
        });
    }
    public void otvet_test(){
        k = 0;
        for(int i = 0; i < Real_tip.length; i++ ){
            for(int j = 0; j < otvet.length; j++){
            if(Real_tip[i] == otvet[j]) {
                real++;
                }
            }
        }
        for(int i = 0; i < Intel_tip.length; i++ ){
            for(int j = 0; j < otvet.length; j++){
                if(Intel_tip[i] == otvet[j]) {
                    intel++;
                }
            }
        }
        for(int i = 0; i < Soc_tip.length; i++ ){
            for(int j = 0; j < otvet.length; j++){
                if(Soc_tip[i] == otvet[j]) {
                    soc++;
                }
            }
        }
        for(int i = 0; i < Kon_tip.length; i++ ){
            for(int j = 0; j < otvet.length; j++){
                if(Kon_tip[i] == otvet[j]) {
                    kon++;
                }
            }
        }
        for(int i = 0; i < Predpinimatel_tip.length; i++ ){
            for(int j = 0; j < otvet.length; j++){
                if(Predpinimatel_tip[i] == otvet[j]) {
                    pred++;
                }
            }
        }
        for(int i = 0; i < Artist_tip.length; i++ ){
            for(int j = 0; j < otvet.length; j++){
                if(Artist_tip[i] == otvet[j]) {
                    artist++;
                }
            }
        }
        for(int i = 0; i < otvet.length; i++){
            if(otvet[i] == null){
                k++;
            }
        }

    }
    public void zaver(View view) {
        Button but_zav = view.findViewById(R.id.konez_golland);

        but_zav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvet_test();
                if(k == 0) {
                    Bundle bundle=new Bundle();
                    bundle.putInt("result_of_test", real);
                    bundle.putInt("intel_of_test", intel);
                    bundle.putInt("soc_of_test", soc);
                    bundle.putInt("kon_of_test", kon);
                    bundle.putInt("pred_of_test", pred);
                    bundle.putInt("artist_of_test", artist);
                    Navigation.findNavController(v).navigate(R.id.action_test_Golland_to_resultat,bundle);
                }else{
                    Toast toast = Toast.makeText(getContext(),
                            "Вы ответили не на все вопросы", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


    }
}
