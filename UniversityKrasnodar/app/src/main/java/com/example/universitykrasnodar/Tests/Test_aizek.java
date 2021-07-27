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

public class Test_aizek extends Fragment {
    private String[] vopros = {"Нравится ли вам оживление и суета вокруг Вас?", "Часто ли у вас бывает беспокойное чувство, что вам что-нибудь хочется, а вы не знаете что?", "Вы из тех людей, которые не лезут за словом в карман?", "Чувствуете ли вы себя иногда счастливым, а иногда печальным без какой-либо причины?", " Держитесь ли вы обычно в тени на вечеринках или в компании?", "Всегда ли в детстве вы делали немедленно и безропотно то, что вам приказывали?", "Бывает ли у вас иногда дурное настроение?", "Когда вас втягивают в ссору, предпочитаете ли вы отмолчаться, надеясь, что все обойдется?", " Легко ли вы поддаетесь переменам настроения?", " Нравится ли вам находиться среди людей?", " Часто ли вы теряли сон из-за своих тревог?", "Упрямитесь ли вы иногда?", "Могли бы вы назвать себя бесчестным?", "Часто ли вам приходят хорошие мысли слишком поздно?", "Предпочитаете ли вы работать в одиночестве?", "Часто ли вы чувствуете себя апатичным и усталым без серьезной причины?", "Вы по натуре живой человек?", "Смеетесь ли вы иногда над неприличными шутками?", "Часто ли вам что-то так надоедает, что вы чувствуете себя «сытым по горло»?", "Чувствуете ли вы себя неловко в какой-либо одежде, кроме повседневной?", "Часто ли ваши мысли отвлекаются, когда вы пытаетесь сосредоточиться на чем-то?", "Можете ли вы быстро выразить ваши мысли словами? Часто ли вы бываете погружены в свои мысли? Полностью ли вы свободны от всяких предрассудков? Нравятся ли вам первоапрельские шутки? Часто ли вы думаете о своей работе? Очень ли вы любите вкусно поесть?", "Нуждаетесь ли вы в дружески расположенном человеке, чтобы выговориться, когда вы раздражены?", "Очень ли вам неприятно брать взаймы или продавать что-нибудь, когда вы нуждаетесь в деньгах?", "Хвастаетесь ли вы иногда?", "Очень ли вы чувствительны к некоторым вещам?", "Предпочли бы вы остаться в одиночестве дома, чем пойти на скучную вечеринку?", "Бываете ли вы иногда беспокойными настолько, что не можете долго усидеть на месте?", "Склонны ли вы планировать свои дела тщательно и раньше чем следовало бы?", "Бывают ли у вас головокружения?", "Всегда ли вы отвечаете на письма сразу после прочтения?", "Справляетесь ли вы с делом лучше, обдумав его самостоятельно, а не обсуждая с другими?", "Бывает ли у вас когда-либо одышка, даже если вы не делали никакой тяжелой работы?", "Можно ли сказать, что вы человек, которого не волнует, чтобы все было именно так, как нужно?", "Беспокоят ли вас ваши нервы?", "Предпочитаете ли вы больше строить планы, чем действовать?", "Откладываете ли вы иногда на завтра то, что должны сделать сегодня?", "Нервничаете ли вы в местах, подобных лифту, метро, туннелю?", "При знакомстве вы обычно первыми проявляете инициативу?", "Бывают ли у вас сильные головные боли?", "Считаете ли вы обычно, что все само собой уладится и придет в норму?", "Трудно ли вам заснуть ночью?", "Лгали ли вы когда-нибудь в своей жизни?", "Говорите ли вы иногда первое, что придет в голову?", "Долго ли вы переживаете после случившегося конфуза?", "Замкнуты ли вы обычно со всеми, кроме близких друзей?", "Часто ли с вами случаются неприятности?", "Любите ли вы рассказывать истории друзьям?", "Предпочитаете ли вы больше выигрывать, чем проигрывать?", "Часто ли вы чувствуете себя неловко в обществе людей выше вас по положению?", "Когда обстоятельства против вас, обычно вы думаете тем не менее, что стоит еще что-либо предпринять?", "Часто ли у вас сосет под ложечкой перед важным делом?"};
    private int[] a =  new int[vopros.length];
    private int[] ecstr_yes = {1, 3, 8, 10, 13, 17, 22, 25, 27, 39, 44, 46, 49, 53, 56};
    private int[] ecstr_no = {5, 15, 20, 29, 32, 34, 37, 41, 51};
    private int[] neiro = {2, 4, 7, 9, 11, 14, 16, 19, 21, 23, 26, 28, 31, 33, 35, 38, 40, 43, 45, 47, 50, 52, 55, 57};
    private int[] lzhi_yes = {6, 24, 36};
    private int[] lzhi_no = {12, 18, 30, 42, 48, 54};
    private ArrayList<RadioGroup> Radiobutton_button = new ArrayList();
    private LinearLayout llgoland_test = null;
    public int ecstr;
    public int neiro_con;
    public int lzhi;
    public int k = 1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test_aizek, container, false);

        initViews(view);
        for (int i = 0; i < vopros.length; i++) {
            LinearLayout llgolland = createFacultyLinearLayout();
            RadioGroup radioGroup = createGollandRadioGroup();
            RadioButton radioButton = otvet_a(i);
            RadioButton radioButton2 = otvet_b(i);
            TextView text_golland = text(i);
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
        llgoland_test = view.findViewById(R.id.llaizek);
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

    private TextView text(int i) {
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
        textView.setText(vopros[i]);
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
        radioButton.setText("Да");
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
        radioButton.setText("Нет");
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
                if (button_a.isChecked()) {
                    a[indexOfButton] = indexOfButton + 1;
                }
                if (button_b.isChecked()) {
                    a[indexOfButton] = 0;
                }
            }
        });
    }


    public void otvet(){
        k = 0;
        for (int i = 0; i < ecstr_yes.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == ecstr_yes[i]) {
                    ecstr++;
                }
            }
        }
        for (int i = 0; i < neiro.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == neiro[i]) {
                    neiro_con++;
                }
            }
        }
        for (int i = 0; i < lzhi_yes.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == lzhi_yes[i]) {
                    lzhi++;
                }
            }
        }

        for (int i = 0; i < ecstr_no.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == ecstr_no[i]) {
                    ecstr++;
                }
            }
        }
        for (int i = 0; i < lzhi_no.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == lzhi_no[i]) {
                    lzhi++;
                }
            }
        }

        if(a.length < vopros.length){
            k++;
        }

    }

    public void zaver(View view) {
        Button but_zav = view.findViewById(R.id.konez_aizek);
        but_zav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvet();
                if (k > 0){
                    Toast toast = Toast.makeText(getContext(),
                            "Вы ответили не на все вопросы", Toast.LENGTH_SHORT);
                    toast.show();
                }
                if(k == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("result_of_test", ecstr);
                    bundle.putInt("intel_of_test", neiro_con);
                    bundle.putInt("soc_of_test", lzhi);
                    Navigation.findNavController(v).navigate(R.id.action_test_aizek_to_result_aizek, bundle);
                }
            }
        });
    }
}