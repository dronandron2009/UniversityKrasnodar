package com.example.universitykrasnodar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.util.Linkify;
import android.util.AtomicFile;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.universitykrasnodar.ViewModels.UniverViewModel;
import com.example.universitykrasnodar.data.Fackultet;
import com.example.universitykrasnodar.data.Link;
import com.example.universitykrasnodar.data.Univer;
import com.google.android.material.tabs.TabLayout;

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


public class Result_aizek extends Fragment {
    private TextView resultat = null;
    private TextView resultat2 = null;
    private TextView resultat3 = null;
    private LinearLayout llFaculties = null;
    private int result_of_test;
    private int intel_of_test;
    private int soc_of_test;
    private String ectr, nr, loz;
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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result_aizek, container, false);
        if (getArguments() != null && getArguments().containsKey("result_of_test")) {
            result_of_test = getArguments().getInt("result_of_test");
            intel_of_test = getArguments().getInt("intel_of_test");
            soc_of_test = getArguments().getInt("soc_of_test");
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

    private void initViews(View view) {
        resultat = view.findViewById(R.id.aizek);
        resultat2 = view.findViewById(R.id.aizek2);
        resultat3 = view.findViewById(R.id.aizek3);
        llFaculties = view.findViewById(R.id.test_fack);

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

    private void recfak(){
        if(result_of_test > 16 && intel_of_test > 16){
            prof.add(TECH);
            prof.add(TOCH);
        }
        if(result_of_test > 16 && intel_of_test < 8){
            prof.add(GUM);
            prof.add(UPRAV);
            prof.add(MEN);
            prof.add(UR);
        }
        if(result_of_test > 16 && intel_of_test > 8 && intel_of_test < 16){
            prof.add(TECH);
            prof.add(GUM);
            prof.add(ISSC);
        }
        if(result_of_test < 8 && intel_of_test < 8){
            prof.add(TECH);
            prof.add(TOCH);
            prof.add(UPRAV);
        }
        if(result_of_test < 8 && intel_of_test > 16){
            prof.add(DIS);
            prof.add(MEDIA);
            prof.add(SPHERA);
            prof.add(GUM);
        }
        if(result_of_test < 8 && intel_of_test > 8 && intel_of_test < 16){
            prof.add(TECH);
            prof.add(GUM);
        }
        if(result_of_test > 8 && result_of_test < 16 && intel_of_test > 16){
            prof.add(GUM);
            prof.add(MEDIA);
            prof.add(MED);
        }
        if(result_of_test > 8 && result_of_test < 16 && intel_of_test < 8){
            prof.add(MVD);
            prof.add(MED);
            prof.add(GUM);
        }
        if(result_of_test > 8 && result_of_test < 16 && intel_of_test > 8 && intel_of_test < 16){
            prof.add(TECH);
            prof.add(INFOR);
            prof.add(TOCH);
            prof.add(GUM);
        }

    }
    @SuppressLint("SetTextI18n")
    private void setupUniversityInfo() {
        if (result_of_test >= 19){
            ectr = "яркий экстраверт";
        }
        if (result_of_test > 15 && result_of_test < 19){
            ectr = "экстраверт";
        }
        if (result_of_test > 12 && result_of_test <=15){
            ectr = "склонность к экстроверсии";
        }
        if (result_of_test > 9 && result_of_test <= 12){
            ectr = "склонность к интроверсии";
        }
        if (result_of_test > 5 && result_of_test <= 9){
            ectr = "интроверт";
        }
        if (result_of_test <= 5){
            ectr = "глубокий интроверт";
        }

        if (intel_of_test >= 19){
            nr = "очень высокий уровень нейротизма";
        }
        if (intel_of_test >= 13 && intel_of_test < 19){
            nr = "высокий уровень нейротизма";
        }
        if (intel_of_test >= 9 && intel_of_test < 13){
            nr = "среднее значение";
        }
        if (intel_of_test < 9){
            nr = "низкий уровень нейротизма";

        }

        if (soc_of_test >= 4){
            loz = "неискренность в ответах, свидетельствующая также о некоторой демонстративности поведения и ориентированности испытуемого на социальное одобрение";
        }
        if (soc_of_test < 4){
            loz = "нормальный уровень";
        }
        System.out.println(result_of_test);


        resultat.setText("Экстраверсия - интроверсия: " + ectr);
        resultat2.setText("Нейротизм: " + nr);
        resultat3.setText("Ложь: " + loz);
    }

}