package com.example.universitykrasnodar.Tests;

import android.annotation.SuppressLint;
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

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.universitykrasnodar.R;

import java.util.ArrayList;

public class Test_sheina extends Fragment {
    private String[] Vopros = {"Строить свою карьеру в пределах конкретной научной или технической сферы", "Осуществлять наблюдение и контроль над людьми, влиять на них на всех уровнях", "Иметь возможность делать все по-своему и не быть стесненным правилами какой-либо организации", "Иметь постоянное место работы с гарантированным окладом и социальной защищенностью", "Употреблять свое умение общаться на пользу людям, помогать другим", "Работать над проблемами, которые представляются почти неразрешимыми", "Вести такой образ жизни, чтобы интересы семьи и карьеры взаимно уравновешивали друг друга", "Создать и построить нечто, что будет всецело моим произведением или идеей", "Продолжать работу по своей специальности, чем получить более высокую должность, не связанную с моей специальностью", "Быть первым руководителем в организации", "Иметь работу, не связанную с режимом или другими организационными ограничениями", "Работать в организации, которая обеспечит мне стабильность на длительный период времени", "Употребить свои умения и способности на то, чтобы сделать мир лучше", "Соревноваться с другими и побеждать", "Строить карьеру, которая позволит мне не изменять своему образу жизни", "Создать новое коммерческое предприятие", "Посвятить всю жизнь избранной профессии", "Занять высокую руководящую должность", "Иметь работу, которая представляет максимум свободы и автономии в выборе характера занятий, времени выполнения и т.д.", "Оставаться на одном месте жительства, чем переехать в связи с повышением", "Иметь возможность использовать свои умения и таланты для служения важной цели", "Единственная действительная цель моей карьеры – находить и решать трудные проблемы, независимо от того, в какой области они возникли", "Я всегда стремлюсь уделять одинаковое внимание моей семье и моей карьере", "Я всегда нахожусь в поиске идей, которые дадут мне возможность начать и построить свое собственное дело", "Я соглашусь на руководящую должность только в том случае, если она находится в сфере моей профессиональной компетенции", "Я хотел бы достичь такого положения в организации, которое давало бы возможность наблюдать за работой других и интегрировать их деятельность", "В моей профессиональной деятельности я более всего заботился о своей свободе и автономии", "Для меня важнее остаться на нынешнем месте жительства, чем получить повышение или новую работу в другой деятельности", "Я всегда искал работу, на которой мог бы приносить пользу другим", "Соревнование и выигрыш – это наиболее важные и волнующие стороны моей карьеры", "Карьера имеет смысл только в том случае, если она позволяет вести жизнь, которая мне нравится", "Предпринимательская деятельность составляет центральную часть моей карьеры", "Я бы скорее ушел из организации, чем стал заниматься работой, не связанной с моей профессией", "Я буду считать, что достиг успеха в карьере только тогда, когда стану руководителем высокого уровня в солидной организации", "Я не хочу, чтобы меня стесняла какая-нибудь организация или мир бизнеса", "Я бы предпочел работать в организации, которая обеспечивает длительный контракт", "Я бы хотел посвятить свою карьеру достижению важной и полезной цели", "Я чувствую себя преуспевающим только тогда, когда я постоянно вовлечен в решение трудных проблем или в ситуацию соревнования", "Выбрать и поддерживать определенный образ жизни важнее, чем добиваться успеха в карьере", "Я всегда хотел основать и построить свой собственный бизнес", "Я предпочитаю работу, которая не связана с командировками"};
    private int[] prof = {1, 9, 17, 25, 33};
    private int[] men = {2, 10, 18, 26, 34};
    private int[] avt = {3,11, 19, 27, 35};
    private int[] stab = {4, 12, 36};
    private int[] stab_mesto = {20, 28, 41};
    private int[] sluzh = {5, 13, 21, 29, 37};
    private int[] vizov = {6, 14, 22, 30, 38};
    private int[] integr = {7, 15, 23, 31, 39};
    private int[] predprin = {8, 16, 24, 32, 40};
    private ArrayList<RadioGroup> Radiobutton_button = new ArrayList();
    private LinearLayout llgoland_test = null;
    private int k;



    public int prof_con;
    public int men_con;
    public int avt_con;
    public int stab_con;
    public int stab_mesto_con;
    public int sluzh_con;
    public int vizov_con;
    public int integr_con;
    public int pred_con;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test_sheina, container, false);

        initViews(view);
        for (int i = 0; i <= 19; i++) {
            LinearLayout llgolland = createFacultyLinearLayout();
            RadioGroup radioGroup = createGollandRadioGroup();
            RadioButton radioButton = one(i);
            RadioButton radioButton2 = two(i);
            RadioButton radioButton3 = free(i);
            RadioButton radioButton4 = four(i);
            RadioButton radioButton5 = five(i);
            RadioButton radioButton6 = six(i);
            RadioButton radioButton7 = seven(i);
            RadioButton radioButton8 = eight(i);
            RadioButton radioButton9 = nine(i);
            RadioButton radioButton10 = ten(i);
            TextView text_golland = text(i);
            radioGroup.addView(radioButton);
            radioGroup.addView(radioButton2);
            radioGroup.addView(radioButton3);
            radioGroup.addView(radioButton4);
            radioGroup.addView(radioButton5);
            radioGroup.addView(radioButton6);
            radioGroup.addView(radioButton7);
            radioGroup.addView(radioButton8);
            radioGroup.addView(radioButton9);
            radioGroup.addView(radioButton10);
            Radiobutton_button.add(radioGroup);
            llgolland.addView(text_golland);
            llgolland.addView(radioGroup);
            setClickListenerForRadio_Group(i, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8,radioButton9,radioButton10);
            llgoland_test.addView(llgolland);
        }
        zaver(view);
        return view;
    }





    private void initViews(View view) {
        llgoland_test = view.findViewById(R.id.llsheina);
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
        textView.setText(Vopros[i]);
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

    private RadioButton one(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 5, 50, 5);
        radioButton.setText("1");
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }

    private RadioButton two(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 5, 50, 5);
        radioButton.setText("2");
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }
    private RadioButton free(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 5, 50, 5);
        radioButton.setText("3");
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }
    private RadioButton four(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 5, 50, 5);
        radioButton.setText("4");
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }
    private RadioButton five(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 5, 50, 5);
        radioButton.setText("5");
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }
    private RadioButton six(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 5, 50, 5);
        radioButton.setText("6");
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }
    private RadioButton seven(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 5, 50, 5);
        radioButton.setText("7");
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }
    private RadioButton eight(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 5, 50, 5);
        radioButton.setText("8");
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }
    private RadioButton nine(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 5, 50, 5);
        radioButton.setText("9");
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }
    @SuppressLint("SetTextI18n")
    private RadioButton ten(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 5, 50, 5);
        radioButton.setText("10");
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }


    private void setClickListenerForRadio_Group(int indexOfButton, RadioButton one, RadioButton two, RadioButton three, RadioButton four, RadioButton five, RadioButton six, RadioButton seven, RadioButton eight, RadioButton nine, RadioButton ten) {
        RadioGroup radioGroups = Radiobutton_button.get(indexOfButton);
        radioGroups.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int t = indexOfButton + 1;
                if (one.isChecked() == true) {
                    for (int j = 0; j < 3; j++){
                        if(t == stab[j]){
                            stab_con +=1;
                        }
                        if(t == stab_mesto[j]){
                            stab_mesto_con +=1;

                        }
                    }
                    for (int i = 0; i < 5; i++){
                        if(t == prof[i]){
                            prof_con +=1;
                        }
                        if(t == men[i]){
                            men_con +=1;
                        }
                        if(t == avt[i]){
                            avt_con +=1;
                        }
                        if(t == sluzh[i]){
                            sluzh_con +=1;
                        }
                        if(t == vizov[i]){
                            vizov_con +=1;
                        }
                        if(t == integr[i]){
                            integr_con +=1;
                        }
                        if(t == predprin[i]){
                            pred_con +=1;
                        }
                    }
                    System.out.println(t);
                }
                if (two.isChecked() == true) {
                    for (int i = 0; i < 5; i++){
                        if(t == prof[i]){
                            prof_con +=2;
                        }
                        if(t == men[i]){
                            men_con +=2;
                        }
                        if(t == avt[i]){
                            avt_con +=2;
                        }
                        if(t == sluzh[i]){
                            sluzh_con +=2;
                        }
                        if(t == vizov[i]){
                            vizov_con +=2;
                        }
                        if(t == integr[i]){
                            integr_con +=2;
                        }
                        if(t == predprin[i]){
                            pred_con +=2;
                        }
                    }
                    for (int j = 0; j < 3; j++){

                        if(t == stab[j]){
                            stab_con +=2;
                        }
                        if(t == stab_mesto[j]){
                            stab_mesto_con +=2;
                        }
                    }
                }
                if (three.isChecked() == true) {
                    for (int i = 0; i < 5; i++){
                        if(t == prof[i]){
                            prof_con +=3;
                        }
                        if(t == men[i]){
                            men_con +=3;
                        }
                        if(t == avt[i]){
                            avt_con +=3;
                        }
                        if(t == sluzh[i]){
                            sluzh_con +=3;
                        }
                        if(t == vizov[i]){
                            vizov_con +=3;
                        }
                        if(t == integr[i]){
                            integr_con +=3;
                        }
                        if(t == predprin[i]){
                            pred_con +=3;
                        }
                    }
                    for (int j = 0; j < 3; j++){

                        if(t == stab[j]){
                            stab_con +=3;
                        }
                        if(t == stab_mesto[j]){
                            stab_mesto_con +=3;
                        }
                    }
                }
                if (four.isChecked() == true) {
                    for (int i = 0; i < 5; i++){
                        if(t == prof[i]){
                            prof_con +=4;
                        }
                        if(t == men[i]){
                            men_con +=4;
                        }
                        if(t == avt[i]){
                            avt_con +=4;
                        }
                        if(t == sluzh[i]){
                            sluzh_con +=4;
                        }
                        if(t == vizov[i]){
                            vizov_con +=4;
                        }
                        if(t == integr[i]){
                            integr_con +=4;
                        }
                        if(t == predprin[i]){
                            pred_con +=4;
                        }
                    }
                    for (int j = 0; j < 3; j++){

                        if(t == stab[j]){
                            stab_con +=4;
                        }
                        if(t == stab_mesto[j]){
                            stab_mesto_con +=4;
                        }
                    }
                }
                if (five.isChecked() == true) {
                    for (int i = 0; i < 5; i++){
                        if(t == prof[i]){
                            prof_con +=5;
                        }
                        if(t == men[i]){
                            men_con +=5;
                        }
                        if(t == avt[i]){
                            avt_con +=5;
                        }
                        if(t == sluzh[i]){
                            sluzh_con +=5;
                        }
                        if(t == vizov[i]){
                            vizov_con +=5;
                        }
                        if(t == integr[i]){
                            integr_con +=5;
                        }
                        if(t == predprin[i]){
                            pred_con +=5;
                        }
                    }
                    for (int j = 0; j < 3; j++){

                        if(t == stab[j]){
                            stab_con +=5;
                        }
                        if(t == stab_mesto[j]){
                            stab_mesto_con +=5;
                        }
                    }
                }
                if (six.isChecked() == true) {
                    for (int i = 0; i < 5; i++){
                        if(t == prof[i]){
                            prof_con +=6;
                        }
                        if(t == men[i]){
                            men_con +=6;
                        }
                        if(t == avt[i]){
                            avt_con +=6;
                        }
                        if(t == sluzh[i]){
                            sluzh_con +=6;
                        }
                        if(t == vizov[i]){
                            vizov_con +=6;
                        }
                        if(t == integr[i]){
                            integr_con +=6;
                        }
                        if(t == predprin[i]){
                            pred_con +=6;
                        }
                    }
                    for (int j = 0; j < 3; j++){

                        if(t == stab[j]){
                            stab_con +=6;
                        }
                        if(t == stab_mesto[j]){
                            stab_mesto_con +=6;
                        }
                    }
                }
                if (seven.isChecked() == true) {
                    for (int i = 0; i < 5; i++){
                        if(t == prof[i]){
                            prof_con +=7;
                        }
                        if(t == men[i]){
                            men_con +=7;
                        }
                        if(t == avt[i]){
                            avt_con +=7;
                        }
                        if(t == sluzh[i]){
                            sluzh_con +=7;
                        }
                        if(t == vizov[i]){
                            vizov_con +=7;
                        }
                        if(t == integr[i]){
                            integr_con +=7;
                        }
                        if(t == predprin[i]){
                            pred_con +=7;
                        }
                    }
                    for (int j = 0; j < 3; j++){

                        if(t == stab[j]){
                            stab_con +=7;
                        }
                        if(t == stab_mesto[j]){
                            stab_mesto_con +=7;
                        }
                    }
                }if (eight.isChecked() == true) {
                    for (int i = 0; i < 5; i++){
                        if(t == prof[i]){
                            prof_con +=8;
                        }
                        if(t == men[i]){
                            men_con +=8;
                        }
                        if(t == avt[i]){
                            avt_con +=8;
                        }
                        if(t == sluzh[i]){
                            sluzh_con +=8;
                        }
                        if(t == vizov[i]){
                            vizov_con +=8;
                        }
                        if(t == integr[i]){
                            integr_con +=8;
                        }
                        if(t == predprin[i]){
                            pred_con +=8;
                        }
                    }
                    for (int j = 0; j < 3; j++){

                        if(t == stab[j]){
                            stab_con +=8;
                        }
                        if(t == stab_mesto[j]){
                            stab_mesto_con +=8;
                        }
                    }
                }
                if (nine.isChecked() == true) {
                    for (int i = 0; i < 5; i++){
                        if(t == prof[i]){
                            prof_con +=9;
                        }
                        if(t == men[i]){
                            men_con +=9;
                        }
                        if(t == avt[i]){
                            avt_con +=9;
                        }
                        if(t == sluzh[i]){
                            sluzh_con +=9;
                        }
                        if(t == vizov[i]){
                            vizov_con +=9;
                        }
                        if(t == integr[i]){
                            integr_con +=9;
                        }
                        if(t == predprin[i]){
                            pred_con +=9;
                        }
                    }
                    for (int j = 0; j < 3; j++){

                        if(t == stab[j]){
                            stab_con +=9;
                        }
                        if(t == stab_mesto[j]){
                            stab_mesto_con +=9;
                        }
                    }
                }
                if (ten.isChecked() == true) {
                    for (int i = 0; i < 5; i++){
                        if(t == prof[i]){
                            prof_con +=10;
                        }
                        if(t == men[i]){
                            men_con +=10;
                        }
                        if(t == avt[i]){
                            avt_con +=10;
                        }
                        if(t == sluzh[i]){
                            sluzh_con +=10;
                        }
                        if(t == vizov[i]){
                            vizov_con +=10;
                        }
                        if(t == integr[i]){
                            integr_con +=10;
                        }
                        if(t == predprin[i]){
                            pred_con +=10;
                        }
                    }
                    for (int j = 0; j < 3; j++){

                        if(t == stab[j]){
                            stab_con +=10;
                        }
                        if(t == stab_mesto[j]){
                            stab_mesto_con +=10;
                        }
                    }
                }

            }


        });
    }

    public void zaver(View view) {
        Button but_zav = view.findViewById(R.id.konez_sheina);

        but_zav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(prof_con);
                    prof_con = prof_con / 5;
                    if(prof_con < 1) prof_con = 1;
                    men_con = men_con / 5;
                    if(men_con < 1) men_con = 1;
                    avt_con = avt_con / 5;
                    if(avt_con < 1) avt_con = 1;
                    stab_con = stab_con / 3;
                    if(stab_con < 1) stab_con = 1;
                    stab_mesto_con = stab_mesto_con / 3;
                     if(stab_mesto_con < 1) stab_mesto_con = 1;
                    sluzh_con = sluzh_con / 5;
                    if(sluzh_con < 1) sluzh_con = 1;
                    vizov_con = vizov_con / 5;
                    if(vizov_con < 1) vizov_con = 1;
                    integr_con = integr_con / 5;
                    if(integr_con < 1) integr_con = 1;
                    pred_con = pred_con / 5;
                    if(pred_con < 1) pred_con = 1;
                    System.out.println(prof_con);
                    Bundle bundle=new Bundle();
                    bundle.putInt("prof_con_of_test", prof_con);
                    bundle.putInt("men_con_of_test", men_con);
                    bundle.putInt("avt_con_of_test", avt_con);
                    bundle.putInt("stab_con_of_test", stab_con);
                    bundle.putInt("stab_mesto_con_of_test", stab_mesto_con);
                    bundle.putInt("sluzh_con_of_test", sluzh_con);
                    bundle.putInt("men_con_of_test", men_con);
                    bundle.putInt("vizov_con_of_test", vizov_con);
                    bundle.putInt("integr_con_of_test", integr_con);
                    bundle.putInt("pred_con_of_test", pred_con);
                    Navigation.findNavController(v).navigate(R.id.action_test_sheina_to_resultat_sheina,bundle);

            }
        });


    }
}
