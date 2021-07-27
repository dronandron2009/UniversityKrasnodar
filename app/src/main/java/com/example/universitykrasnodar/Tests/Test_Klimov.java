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

public class Test_Klimov extends Fragment {
    private String[] A = {
            "Ухаживать за животными", "Помогать больным людям, лечить их.", "Следить за качеством книжных иллюстраций, плакатов, художественных открыток, грампластинок.", "Обрабатывать материалы (дерево, ткань, пластмассу и т.д.).",
            "Обсуждать научно-популярные книги, статьи.", "Выращивать молодняк животных какой-либо породы.", "Копировать рисунки, изображения, настраивать музыкальные инструменты.",
            "Сообщать, разъяснять людям нужные для них сведения в справочном бюро, во время экскурсии и т.д.", "Ремонтировать изделия, вещи (одежду, технику), жилище.", "Лечить животных.", "Выводить новые сорта растений.",
            "Разбирать споры, ссоры между людьми, убеждать, разъяснять, поощрять, наказывать.", "Наблюдать, изучать работу кружков художественной самодеятельности.", "Обслуживать, налаживать медицинские приборы и аппараты.", "Составлять точные описания, отчёты о наблюдаемых явлениях, событиях, измеряемых объектах и др.", "Делать лабораторные анализы в больнице.", "Красить или расписывать стены помещений, поверхность изделий.", "Организовывать культ походы людей в театры, музеи, на экскурсии, в туристические путешествия и т.п.",
            "Изготовлять по чертежам детали, изделия (машины, одежду), строить здания.", "Вести борьбу с болезнями растений, с вредителями леса, сада."
};
    private String[] B = {"Обслуживать машины, приборы (следить, регулировать)", "Составлять таблицы, схемы, программы вычислительных машин.", "Следить за состоянием, развитием растений.", "Доводить товары до потребителя (рекламировать, продавать).", "Обсуждать художественные книги.", "Тренировать сверстников (или младших) в выполнении каких-либо действий (трудовых, учебных, спортивных).", "Управлять каким-либо грузовым, подъёмным, транс портным средством (подъёмным краном, машиной и т.п.).", "Художественно оформлять выставки, витрины, участвовать в подготовке концертов, пьес и т.п.", "Искать и исправлять ошибки в текстах, таблицах, рисунках.",
    "Выполнять расчёты, вычисления.", "Конструировать новые виды промышленных изделий (машины, одежду, дома и т.д.).", "Разбираться в чертежах, схемах, таблицах (проверять, уточнять, приводить в порядок).", "Наблюдать, изучать жизнь микробов.", "Оказывать людям медицинскую помощь при ранениях, ушибах, ожогах и т.п.", "Художественно описывать, изображать события наблюдаемые или представляемые.", "Принимать, осматривать больных, беседовать с ними, назначать лечение.", "Осуществлять монтаж здания или сборку машин, приборов.", "Играть на сцене, принимать участие в концертах.", "Заниматься черчением, копировать карты, чертежи.", "Работать на машинах (пишущая машина, компьютер, телетайп, телефакс)."};
    private String[] chel_prir = {"Ухаживать за животными", "Следить за состоянием, развитием растений.", "Выращивать молодняк животных какой-либо породы.", "Лечить животных.", "Выводить новые сорта растений.", "Наблюдать, изучать жизнь микробов.",
    "Делать лабораторные анализы в больнице.", "Вести борьбу с болезнями растений, с вредителями леса, сада."};
    private String[] chel_tech = {"Обслуживать машины, приборы (следить, регулировать)", "Обрабатывать материалы (дерево, ткань, пластмассу и т.д.).", "Управлять каким-либо грузовым, подъёмным, транс портным средством (подъёмным краном, машиной и т.п.).", "Управлять каким-либо грузовым, подъёмным, транс портным средством (подъёмным краном, машиной и т.п.).",
    "Конструировать новые виды промышленных изделий (машины, одежду, дома и т.д.).", "Обслуживать, налаживать медицинские приборы и аппараты.", "Осуществлять монтаж здания или сборку машин, приборов.", "Изготовлять по чертежам детали, изделия (машины, одежду), строить здания."};
    private String[] chel_chel = {"Помогать больным людям, лечить их.", "Доводить товары до потребителя (рекламировать, продавать).", "Тренировать сверстников (или младших) в выполнении каких-либо действий (трудовых, учебных, спортивных).", "Сообщать, разъяснять людям нужные для них сведения в справочном бюро, во время экскурсии и т.д.",
    "Разбирать споры, ссоры между людьми, убеждать, разъяснять, поощрять, наказывать.", "Оказывать людям медицинскую помощь при ранениях, ушибах, ожогах и т.п.", "Принимать, осматривать больных, беседовать с ними, назначать лечение.", "Организовывать культ походы людей в театры, музеи, на экскурсии, в туристические путешествия и т.п."};
    private String[] chel_sys = {"Составлять таблицы, схемы, программы вычислительных машин.", "Обсуждать научно-популярные книги, статьи.", "Искать и исправлять ошибки в текстах, таблицах, рисунках.", "Выполнять расчёты, вычисления.", "Разбираться в чертежах, схемах, таблицах (проверять, уточнять, приводить в порядок).",
    "Составлять точные описания, отчёты о наблюдаемых явлениях, событиях, измеряемых объектах и др.", "Заниматься черчением, копировать карты, чертежи.", "Работать на машинах (пишущая машина, компьютер, телетайп, телефакс)."};
    private String[] chel_hud = {"Следить за качеством книжных иллюстраций, плакатов, художественных открыток, грампластинок.", "Обсуждать художественные книги.", "Копировать рисунки, изображения, настраивать музыкальные инструменты.", "Художественно оформлять выставки, витрины, участвовать в подготовке концертов, пьес и т.п.",
    "Наблюдать, изучать работу кружков художественной самодеятельности.", "Художественно описывать, изображать события наблюдаемые или представляемые.", "Красить или расписывать стены помещений, поверхность изделий.", "Играть на сцене, принимать участие в концертах."};
    private String[] otvet = new String[A.length];
    private ArrayList<RadioGroup> Radiobutton_button = new ArrayList();
    private LinearLayout llgoland_test = null;
    private int k;



    public int prir;
    public int tech;
    public int chel;
    public int sys;
    public int hud;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test_iovashi, container, false);

        initViews(view);
        for (int i = 0; i < A.length; i++) {
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
        llgoland_test = view.findViewById(R.id.lliovashi);
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
        textView.setText(R.string.text_klimov);
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
        for (int i = 0; i < chel_prir.length; i++){
            for (int j = 0; j < otvet.length; j++){
                if(chel_prir[i] == otvet[j]){
                    prir++;
                }
            }
        }
        for (int i = 0; i < chel_tech.length; i++){
            for (int j = 0; j < otvet.length; j++){
                if(chel_tech[i] == otvet[j]){
                    tech++;
                }
            }
        }
        for (int i = 0; i < chel_chel.length; i++){
            for (int j = 0; j < otvet.length; j++){
                if(chel_chel[i] == otvet[j]){
                    chel++;
                }
            }
        }
        for (int i = 0; i < chel_hud.length; i++){
            for (int j = 0; j < otvet.length; j++){
                if(chel_hud[i] == otvet[j]){
                    hud++;
                }
            }
        }
        for (int i = 0; i < chel_sys.length; i++){
            for (int j = 0; j < otvet.length; j++){
                if(chel_sys[i] == otvet[j]){
                    sys++;
                }
            }
        }
        for (int i = 0; i < otvet.length; i++){
            if(otvet[i] == null){
                k++;
            }
        }
    }
    public void zaver(View view) {
        Button but_zav = view.findViewById(R.id.konez_iovashi);

        but_zav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvet_test();
                if(k == 0) {
                    Bundle bundle=new Bundle();
                    bundle.putInt("result_of_test", chel);
                    bundle.putInt("intel_of_test", sys);
                    bundle.putInt("soc_of_test", tech);
                    bundle.putInt("kon_of_test", hud);
                    bundle.putInt("pred_of_test", prir);
                    Navigation.findNavController(v).navigate(R.id.action_test_Klimov_to_resultat_klimov,bundle);
                }else{
                    Toast toast = Toast.makeText(getContext(),
                            "Вы ответили не на все вопросы", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


    }
}
