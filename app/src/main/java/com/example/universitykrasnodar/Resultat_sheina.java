package com.example.universitykrasnodar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.universitykrasnodar.ViewModels.UniverViewModel;
import com.example.universitykrasnodar.data.Fackultet;
import com.example.universitykrasnodar.data.Univer;

import java.util.ArrayList;
import java.util.List;
import static com.example.universitykrasnodar.unitls.utils.UPRAV;
import static com.example.universitykrasnodar.unitls.utils.TECH;
import static com.example.universitykrasnodar.unitls.utils.INFOR;
import static com.example.universitykrasnodar.unitls.utils.MEDZDRAV;
import static com.example.universitykrasnodar.unitls.utils.TOCH;
import static com.example.universitykrasnodar.unitls.utils.GUM;
import static com.example.universitykrasnodar.unitls.utils.BEZ;
import static com.example.universitykrasnodar.unitls.utils.ISSC;
import static com.example.universitykrasnodar.unitls.utils.MEDIA;
import static com.example.universitykrasnodar.unitls.utils.DIS;
import static com.example.universitykrasnodar.unitls.utils.SPHERA;
import static com.example.universitykrasnodar.unitls.utils.MEN;
import static com.example.universitykrasnodar.unitls.utils.BISINFOR;
import static com.example.universitykrasnodar.unitls.utils.UR;
import static com.example.universitykrasnodar.unitls.utils.MED;
import static com.example.universitykrasnodar.unitls.utils.MVD;
public class Resultat_sheina extends Fragment {
    private TextView resultat = null;
    private TextView resultat2 = null;
    private TextView resultat3 = null;
    private TextView resultat4 = null;
    private TextView resultat5 = null;
    private TextView resultat6 = null;
    private TextView resultat7= null;
    private TextView resultat8 = null;
    private TextView resultat9 = null;

    private LinearLayout llFaculties = null;
    private ArrayList<LinearLayout> facultyLinearLayoutList = new ArrayList();
    private ArrayList<LinearLayout> univerLinearLayoutList = new ArrayList();
    private ArrayList<TextView> facultyDescriptionTextViewList = new ArrayList();
    private List<List<Button>> universButtonList = new ArrayList();
    private List<Button> fakButtonList = new ArrayList();
    private ArrayList<Boolean> facultyVisibilityList = new ArrayList();
    private ArrayList<Boolean> UniverVisibilityList = new ArrayList();
    private Univer university;
    private List<String> prof = new ArrayList();
    private static final String TAG="KSD";

    private int prof_con;
    private int men_con;
    private int avt_con;
    private int stab_con;
    private int stab_mesto_con;
    private int sluzh_con;
    private int vizov_con;
    private int integr_con;
    private int pred_con;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultat_sheina, container, false);
        if (getArguments() != null && getArguments().containsKey("prof_con_of_test")) {
            prof_con = getArguments().getInt("prof_con_of_test");
            men_con = getArguments().getInt("men_con_of_test");
            avt_con = getArguments().getInt("avt_con_of_test");
            stab_con = getArguments().getInt("stab_con_of_test");
            stab_mesto_con = getArguments().getInt("stab_mesto_con_of_test");
            sluzh_con = getArguments().getInt("sluzh_con_of_test");
            vizov_con = getArguments().getInt("vizov_con_of_test");
            integr_con = getArguments().getInt("integr_con_of_test");
            pred_con = getArguments().getInt("pred_con_of_test");
        } else {
            throw new IllegalArgumentException("Must be created through newInstance(...)");
        }
        initViews(view);
        setupUniversityInfo();
        recfak();

        UniverViewModel viewModel=new ViewModelProvider(requireActivity()).get(UniverViewModel.class);
        viewModel.getUnivers();
        viewModel.univerLiveData.observe(getViewLifecycleOwner(), new Observer<Univer[]>() {
            @Override
            public void onChanged(Univer[] univers) {
                for (int i=0; i<univers.length;i++){
                    List<Fackultet> result= new ArrayList<>();
                    List<Button> facultyButtonList = new ArrayList();
                    Univer univer=univers[i];
                    List<Fackultet> fackultetList= univer.getFacultyList();
                    for (Fackultet one:fackultetList){
                        for (int j = 0; j < prof.size(); j++) {
                            if (one.getConstant().equals(prof.get(j))) {
                                result.add(one);

                            }
                        }
                    }
                    if (result.size() != 0) {
                        System.out.println(facultyButtonList);
                        LinearLayout univerLinearLayout = createUniverLinearLayout();
                        TextView nameUniver = createNameUniver(univer.getName());
                        ImageView logoUniver = createLogoUniver(univer.getLogo());
                        univerLinearLayout.addView(nameUniver);
                        univerLinearLayout.addView(logoUniver);
                        univerLinearLayoutList.add(univerLinearLayout);
                        llFaculties.addView(univerLinearLayout);
                        universButtonList.add(facultyButtonList);
                        setClickListenerForUniver((univerLinearLayoutList.size() - 1));
                        UniverVisibilityList.add(false);
                        System.out.println("universButtonList "+universButtonList);
                        for (int k = 0; k < result.size(); k++) {
                            LinearLayout facultyLinearLayout = createFacultyLinearLayout();
                            Button facultyButton = createFacultyButton(result.get(k).getName());
                            TextView facultyTextView = createFacultyTextView(result.get(k).getDescription());
                            facultyLinearLayout.addView(facultyButton);
                            facultyLinearLayout.addView(facultyTextView);
                            facultyLinearLayoutList.add(facultyLinearLayout);
                            fakButtonList.add(facultyButton);
                            facultyButtonList.add(facultyButton);
                            facultyDescriptionTextViewList.add(facultyTextView);
                            llFaculties.addView(facultyLinearLayout);
                            setClickListenerForButton((fakButtonList.size() - 1));
                            System.out.println(facultyButtonList);
                            facultyVisibilityList.add(false);
                        }

                    }


                }

            }

        });

        return view;
    }

    private LinearLayout createFacultyLinearLayout() {
        Context context = getContext();
        int id = View.generateViewId();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        if (context == null) return null;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setId(id);

        return linearLayout;
    }
    private LinearLayout createUniverLinearLayout() {
        Context context = getContext();
        int id = View.generateViewId();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        if (context == null) return null;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setBackgroundResource(R.drawable.style_main_shape);
        layoutParams.setMargins(7, 10,7,5);
        layoutParams.weight = 2;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(id);

        return linearLayout;
    }

    private TextView createNameUniver(int nameUniver) {
        Context context = getContext();
        int id = View.generateViewId();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        if (context == null) return null;
        TextView textView = new TextView(context);
        textView.setId(id);
        textView.setText(nameUniver);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        textView.setTextColor(Color.parseColor(color));
        layoutParams.width = (int)(textView.getResources().getDisplayMetrics().density*298);
        layoutParams.setMargins(10,10,0,10);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 23);
        textView.setGravity(Gravity.CENTER);
        layoutParams.weight = 2;
        textView.setLayoutParams(layoutParams);

        return textView;
    }

    private ImageView createLogoUniver(int logoUniver) {
        Context context = getContext();
        int id = View.generateViewId();
        Resources res = getResources();
        Drawable drawable = ResourcesCompat.getDrawable(res, logoUniver, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        if (context == null) return null;
        ImageView logoView = new ImageView(context);
        logoView.setId(id);
        logoView.setImageDrawable(drawable);
        layoutParams.setMargins(0,7,7,7);
        layoutParams.width = (int)(logoView.getResources().getDisplayMetrics().density*150);
        layoutParams.height = (int)(logoView.getResources().getDisplayMetrics().density*130);
        layoutParams.weight = 1;
        logoView.setLayoutParams(layoutParams);
        return logoView;
    }


    private void setClickListenerForUniver(int indexOfButton) {
        LinearLayout button = univerLinearLayoutList.get(indexOfButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                toggleUniverDescription(indexOfButton);
            }
        });
    }
    private void toggleUniverDescription(int indexOfFaculty) {
        Boolean isVisible = UniverVisibilityList.get(indexOfFaculty);
        UniverVisibilityList.set(indexOfFaculty, !isVisible);
        List<Button> buttonList=universButtonList.get(indexOfFaculty);
        System.out.println(universButtonList.get(indexOfFaculty));
        Button[] button = new Button[buttonList.size()];
        for (int i = 0; i < buttonList.size(); i++){
            button[i] = buttonList.get(i);
            button[i].setVisibility(!isVisible ? View.VISIBLE : View.GONE);
        }
    }



    private Button createFacultyButton(int faculty) {
        Context context = getContext();
        int id = View.generateViewId();

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(10, 10, 10, 10);
        if (context == null) return null;
        Button button = new Button(context);
        button.setId(id);
        button.setText(faculty);
        button.setBackgroundResource(R.drawable.button_ob_univ);
        button.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        button.setLayoutParams(layoutParams);
        button.setVisibility(View.GONE);

        return button;
    }

    private TextView createFacultyTextView(int facultyDescription) {
        Context context = getContext();
        int id = View.generateViewId();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        if (context == null) return null;
        TextView textView = new TextView(context);
        textView.setId(id);
        textView.setText(facultyDescription);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        textView.setTextColor(Color.parseColor(color));
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 19);
        textView.setLayoutParams(layoutParams);
        textView.setVisibility(View.GONE);
        return textView;
    }

    private void setClickListenerForButton(int indexOfButton) {
        Button button = fakButtonList.get(indexOfButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(indexOfButton);
                toggleFacultyDescription(indexOfButton);
            }
        });
    }
    private void toggleFacultyDescription(int indexOfFaculty) {
        Boolean isVisible = facultyVisibilityList.get(indexOfFaculty);
        facultyVisibilityList.set(indexOfFaculty, !isVisible);
        facultyDescriptionTextViewList.get(indexOfFaculty).setVisibility(!isVisible ? View.VISIBLE : View.GONE);
    }


    private void initViews(View view) {
        resultat = view.findViewById(R.id.shein1);
        resultat2 = view.findViewById(R.id.shein2);
        resultat3 = view.findViewById(R.id.shein3);
        resultat4 = view.findViewById(R.id.shein4);
        resultat5 = view.findViewById(R.id.shein5);
        resultat6 = view.findViewById(R.id.shein6);
        resultat7 = view.findViewById(R.id.shein7);
        resultat8 = view.findViewById(R.id.shein8);
        resultat9 = view.findViewById(R.id.shein9);
        llFaculties = view.findViewById(R.id.test_fack);
    }
    private void recfak() {
        if (prof_con >= men_con && prof_con >= avt_con && prof_con >= stab_con && prof_con >= stab_mesto_con && prof_con >= sluzh_con && prof_con >= vizov_con && prof_con >= integr_con && prof_con >= pred_con) {
            prof.add(TECH);
            prof.add(TOCH);
            prof.add(INFOR);
            prof.add(BISINFOR);
            prof.add(MEN);
        }
        if (men_con >= prof_con && men_con >= avt_con && men_con >= sluzh_con && men_con >= vizov_con && men_con >= integr_con && men_con >= pred_con) {
            prof.add(UPRAV);
            prof.add(MEN);
            prof.add(SPHERA);
            prof.add(BISINFOR);
        }
        if (avt_con >= men_con && avt_con >= prof_con && avt_con >= sluzh_con && avt_con >= vizov_con && avt_con >= integr_con && avt_con >= pred_con) {
            prof.add(ISSC);
            prof.add(MEDIA);
            prof.add(DIS);
        }if (sluzh_con >= men_con && sluzh_con >= avt_con && sluzh_con >= prof_con && sluzh_con >= vizov_con && sluzh_con >= integr_con && sluzh_con >= pred_con) {
            prof.add(MED);
            prof.add(BEZ);
            prof.add(MVD);
            prof.add(MEDZDRAV);
        }
        if (vizov_con >= men_con && vizov_con >= avt_con && vizov_con >= sluzh_con && vizov_con >= prof_con && vizov_con >= integr_con && vizov_con >= pred_con) {
            prof.add(TECH);
            prof.add(TOCH);
            prof.add(UR);
            prof.add(INFOR);
        }
        if (integr_con >= men_con && integr_con >= avt_con &&integr_con >= sluzh_con && integr_con >= vizov_con && integr_con >= prof_con && integr_con >= pred_con) {
            prof.add(GUM);
            prof.add(ISSC);
            prof.add(MEDIA);
        }
        if (pred_con >= men_con && pred_con >= avt_con && pred_con >= sluzh_con && pred_con >= vizov_con && pred_con >= integr_con && pred_con >= prof_con) {
            prof.add(UPRAV);
            prof.add(MEN);
            prof.add(TOCH);
            prof.add(BISINFOR);
            prof.add(SPHERA);
        }

    }
    @SuppressLint("SetTextI18n")
    private void setupUniversityInfo() {
        resultat.setText("Профессиональная компетентность: " + prof_con + "\n" + "Человеку нравится быть профессионалом в чём-либо. Испытания принимаются с радостью как возможность доказать себе и окружающим возможность сделать работу лучше других.");
        resultat2.setText("Менеджмент: " + men_con + "\n" + "Людям нравится управлять и налаживать рабочие процессы, решать проблемы и общаться с другими людьми. Обожают лежащую на них ответственность за успех.");
        resultat3.setText("Автономия: " + avt_con + "\n" + "Предпочитают работать без жёстких указов сверху в своём темпе и по своим правилам. Предпочитают работать одни.");
        resultat4.setText("Стабильность работы: " + stab_con + "\n" + "Такие сотрудники воспринимают стабильность и уверенность в завтрашнем дне как основную потребность в профессиональной деятельности. Стараются избегать рискованных действий.");
        resultat5.setText("Стабильность места жительства: " + stab_mesto_con + "\n" + "Ориентирован на стабильность места жительства, связывает себя с географическим регионом, «пуская корни» в определенном месте, вкладывая сбережения в свой дом, и меняет работу или организацию только тогда, когда это может предотвратить его «срывание с места».");
        resultat6.setText("Служение: " + sluzh_con + "\n" + "Направленные на служение люди в основном предпочитают помогать окружающим, чем использовать свои собственные таланты. Могут работать в социальных службах или отделах кадров.");
        resultat7.setText("Вызов: " + vizov_con + "\n" + "Такие люди постоянно находятся в поиске сложных проблем для решения. Могут часто менять работу, когда на текущем месте станет тихо и спокойно.");
        resultat8.setText("Интеграция стилей жизни: " + integr_con + "\n" + "Максимально стараются избежать доминирования любой из сторон жизни: работы, семьи, саморазвития и т.д. Старается все аспекты держать в сбалансированном виде.");
        resultat9.setText("Предпринимательство: " + pred_con + "\n" + "Любят изобретать, действовать нестандартно и креативно, управлять собственным бизнесом. В отличии от предпочитающих автономность людей позитивно воспринимают распределение обязанностей. Могут легко заскучать без активных действий. Показателем успеха для подобных людей может выступать богатство.");
    }}