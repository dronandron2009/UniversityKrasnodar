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

public class Test_potemkina extends Fragment {
    private String[] vopros = {"Сам процесс выполняемой работы увлекает Вас больше, чем этап ее завершения?", "Для достижения цели Вы обычно не жалеете сил?", "Вам часто говорят, что Вы больше думаете о других, чем о себе?", "Вы обычно много времени уделяете своей особе?", "Вы обычно долго не решаетесь начать делать то, что Вам неинтересно, даже  если это необходимо?", "Вы уверены, что настойчивости в Вас больше, чем способностей?", "Вам легче просить за других, чем за себя?", "Вы считаете, что человек сначала должен думать о себе, а потом уже о других?", "Заканчивая интересное дело, Вы часто сожалеете о том, что интересная работа  уже завершена, а с ней жаль расставаться?","Вам больше нравятся деятельные люди, способные достигать результата, чем просто добрые и отзывчивые?", "Вам трудно отказать людям, когда они Вас о чем-либо просят?", "Для себя Вы делаете что-либо с большим удовольствием, чем для других?", "Вы испытываете удовольствие от игры, в которой не нужно думать о выигрыше?", "Вы считаете, что успехов в Вашей жизни больше, чем неудач?", "Вы часто стараетесь оказать людям услугу, если у них случилась беда или  неприятности?", "Вы убеждены, что не нужно для кого-либо сильно напрягаться?", "Вы более всего уважаете людей, способных увлечься делом по-настоящему?", "Вы часто завершаете работу вопреки неблагоприятной обстановке, нехватке  времени, помехам со стороны?", "Для себя у Вас обычно не хватает ни времени, ни сил?", "Вам трудно заставить себя сделать что-то для других?", "Вы часто начинаете одновременно много дел и не успеваете закончить их до  конца?", "Вы считаете, что имеете достаточно сил, чтобы рассчитывать на успех в жизни?", "Вы стремитесь как можно больше сделать для других людей?", "Вы убеждены, что забота о других часто идет в ущерб себе?", "Можете ли Вы увлечься делом настолько, что забываете о времени и о себе?", "Вам часто удается довести начатое дело до конца?", "Вы убеждены, что самая большая ценность в жизни – жить интересами других  людей?", "Вы можете назвать себя эгоистом?", "Бывает, что Вы, увлекаясь деталями, углубляясь в них, не можете закончить  начатое дело?", "Вы избегаете встреч с людьми, не обладающими деловыми качествами?", "Ваша отличительная черта – бескорыстие?", "Свободное время Вы используете для своих увлечений?", "Вы часто загружаете свой отпуск или выходные дни работой из-за того, что кому- то обещали что-либо сделать?", "Вы осуждаете людей, которые не умеют позаботиться о себе?", "Вам трудно решиться использовать усилия человека в своих интересах?", "Вы часто просите людей сделать что-либо из корыстных побуждений?", "Соглашаясь на какое-либо дело, Вы больше думаете о том, насколько оно Вам  интересно?", "Стремление к результату в любом деле – Ваша отличительная черта?"," Ваша отличительная черта – умение помочь другим людям?"," Вы способны прилагать максимальные усилия лишь за хорошее вознаграждение?"};

    private String[] process = {"Сам процесс выполняемой работы увлекает Вас больше, чем этап ее завершения?", "Вы обычно долго не решаетесь начать делать то, что Вам неинтересно, даже  если это необходимо?", "Заканчивая интересное дело, Вы часто сожалеете о том, что интересная работа  уже завершена, а с ней жаль расставаться?", "Вы испытываете удовольствие от игры, в которой не нужно думать о выигрыше?", "Вы более всего уважаете людей, способных увлечься делом по-настоящему?", "Вы часто начинаете одновременно много дел и не успеваете закончить их до  конца?", "Можете ли Вы увлечься делом настолько, что забываете о времени и о себе?", "Бывает, что Вы, увлекаясь деталями, углубляясь в них, не можете закончить  начатое дело?", "Вы часто загружаете свой отпуск или выходные дни работой из-за того, что кому- то обещали что-либо сделать?", "Соглашаясь на какое-либо дело, Вы больше думаете о том, насколько оно Вам  интересно?"};
    private String[] resultat = {"Для достижения цели Вы обычно не жалеете сил?", "Вы уверены, что настойчивости в Вас больше, чем способностей?", "Вам больше нравятся деятельные люди, способные достигать результата, чем  просто добрые и отзывчивые?", "Вы считаете, что успехов в Вашей жизни больше, чем неудач?", "Вы часто завершаете работу вопреки неблагоприятной обстановке, нехватке  времени, помехам со стороны?", "Вы считаете, что имеете достаточно сил, чтобы рассчитывать на успех в жизни?", "Вам часто удается довести начатое дело до конца?", "Вы избегаете встреч с людьми, не обладающими деловыми качествами?", "Вы осуждаете людей, которые не умеют позаботиться о себе?", "Стремление к результату в любом деле – Ваша отличительная черта?"};
    private String[] altruism = {"Вам часто говорят, что Вы больше думаете о других, чем о себе?", "Вам легче просить за других, чем за себя?", "Вам трудно отказать людям, когда они Вас о чем-либо просят?", "Вы часто стараетесь оказать людям услугу, если у них случилась беда или  неприятности?", "Для себя у Вас обычно не хватает ни времени, ни сил?", "Вы стремитесь как можно больше сделать для других людей?", "Вы убеждены, что самая большая ценность в жизни – жить интересами других  людей?", "Ваша отличительная черта – бескорыстие?", "Вам трудно решиться использовать усилия человека в своих интересах?", "Ваша отличительная черта – умение помочь другим людям?"};
    private String[] egoism = {"Вы обычно много времени уделяете своей особе?", "Вы считаете, что человек сначала должен думать о себе, а потом уже о других?", "Для себя Вы делаете что-либо с большим удовольствием, чем для других?", "Вы убеждены, что не нужно для кого-либо сильно напрягаться?", "Вам трудно заставить себя сделать что-то для других?", "Вы убеждены, что забота о других часто идет в ущерб себе?", "Вы можете назвать себя эгоистом?", "Свободное время Вы используете для своих увлечений?", "Вы часто просите людей сделать что-либо из корыстных побуждений?", "Вы способны прилагать максимальные усилия лишь за хорошее вознаграждение?"};
    private String[] otvet = new String[vopros.length];
    private ArrayList<RadioGroup> Radiobutton_button = new ArrayList();
    private LinearLayout llgoland_test = null;
    private int k = 1;



    public int process_con;
    public int resultat_con;
    public int altruism_con;
    public int egoism_con;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test_potemkina, container, false);

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
        llgoland_test = view.findViewById(R.id.llpotemkina);
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
                if (button_a.isChecked() == true) {
                    otvet[indexOfButton] = vopros[indexOfButton];
                }
                if (button_b.isChecked() == true) {

                }
            }


        });
    }
    public void otvet_test(){
        for (int i = 0; i < process.length; i++){
            for (int j = 0; j < otvet.length; j++){
                if(process[i] == otvet[j]) {
                    process_con++;
                }
            }
        }
        for (int i = 0; i < resultat.length; i++){
            for (int j = 0; j < otvet.length; j++){
                if(resultat[i] == otvet[j]) {
                    resultat_con++;
                }
            }
        }
        for (int i = 0; i < altruism.length; i++){
            for (int j = 0; j < otvet.length; j++){
                if(altruism[i] == otvet[j]) {
                    altruism_con++;
                }
            }
        }
        for (int i = 0; i < egoism.length; i++){
            for (int j = 0; j < otvet.length; j++){
                if(egoism[i] == otvet[j]) {
                    egoism_con++;
                }
            }
        }

    }
    public void zaver(View view) {
        Button but_zav = view.findViewById(R.id.konez_potemkina);

        but_zav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvet_test();
                Bundle bundle = new Bundle();
                bundle.putInt("result_of_test", process_con);
                bundle.putInt("intel_of_test", resultat_con);
                bundle.putInt("soc_of_test", altruism_con);
                bundle.putInt("kon_of_test", egoism_con);
                Navigation.findNavController(v).navigate(R.id.action_test_potemkina_to_resultat_potemkina, bundle);
            }
        });


    }
}