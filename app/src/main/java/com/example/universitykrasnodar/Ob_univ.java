package com.example.universitykrasnodar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.util.Linkify;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.universitykrasnodar.ViewModels.UniverViewModel;
import com.example.universitykrasnodar.data.Fackultet;
import com.example.universitykrasnodar.data.Link;
import com.example.universitykrasnodar.data.Univer;

import java.util.ArrayList;
import java.util.List;

import static com.example.universitykrasnodar.unitls.utils.INDEX;

public class Ob_univ extends Fragment{

    private LinearLayout llFaculties = null;
    private TextView tvUniversityName = null;
    private TextView tvUniversityDescription = null;
    private TextView tvUniversityDetails = null;
    private ImageView tvUniversityIcon = null;
    private ImageView tvUniversityPhoto = null;
    private ArrayList<LinearLayout> facultyLinearLayoutList = new ArrayList();
    private ArrayList<TextView> facultyDescriptionTextViewList = new ArrayList();
    private ArrayList<Button> facultyButtonList = new ArrayList();
    private ArrayList<Boolean> facultyVisibilityList = new ArrayList();
    private ArrayList<Button> networkButtonList = new ArrayList<>();
    private ArrayList<Button> mapButtonList = new ArrayList<>();
    private  int index;

    private Univer university;

        public Ob_univ() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ob_univ, container, false);
        initViews(view);
        if (getArguments() != null && getArguments().containsKey(INDEX)) {
            index = getArguments().getInt(INDEX);
        } else {
            throw new IllegalArgumentException("Must be created through newInstance(...)");
        }
        UniverViewModel viewModel=new ViewModelProvider(requireActivity()).get(UniverViewModel.class);
        viewModel.getUnivers();
        viewModel.univerLiveData.observe(getViewLifecycleOwner(), new Observer<Univer[]>() {
            @Override
            public void onChanged(Univer[] univers) {
                university = univers[index];
                if (university != null){
                setupUniversityInfo();
                for(int i = 0; i < university.getFacultyList().size(); i++) {
                    Fackultet faculty = university.getFacultyList().get(i);
                    LinearLayout facultyLinearLayout = createFacultyLinearLayout();
                    Button facultyButton = createFacultyButton(faculty.getName());
                    TextView facultyTextView = createFacultyTextView(faculty.getDescription());

                    facultyLinearLayout.addView(facultyButton);
                    facultyLinearLayout.addView(facultyTextView);
                    facultyLinearLayoutList.add(facultyLinearLayout);
                    facultyButtonList.add(facultyButton);
                    facultyDescriptionTextViewList.add(facultyTextView);
                    llFaculties.addView(facultyLinearLayout);
                    setClickListenerForButton(i);
                    facultyVisibilityList.add(false);
                }
                    for(int i = 0; i < university.getNetworks().size(); i++) {
                        Link network = university.getNetworks().get(i);
                        LinearLayout networkLinearLayout = createFacultyLinearLayout();
                        Button networkButton = createNetworkButton(network.getName(), network.getUri());
                        if(network.getName() == R.string.name_link_off){
                            Drawable icon1 = ContextCompat.getDrawable(getActivity(), R.drawable.chrome);
                            icon1.setBounds(0, 0, 65, 65);
                            networkButton.setCompoundDrawables(null, null, icon1, null);
                        }
                        if(network.getName() == R.string.name_link_vk){
                            Drawable icon1 = ContextCompat.getDrawable(getActivity(), R.drawable.vk);
                            icon1.setBounds(0, 0, 65, 65);
                            networkButton.setCompoundDrawables(null, null, icon1, null);
                        }
                        if(network.getName() == R.string.wiki){
                            Drawable icon1 = ContextCompat.getDrawable(getActivity(), R.drawable.wiki);
                            icon1.setBounds(0, 0, 65, 65);
                            networkButton.setCompoundDrawables(null, null, icon1, null);
                        }
                        if(network.getName() == R.string.geo){
                            Drawable icon1 = ContextCompat.getDrawable(getActivity(), R.drawable.map);
                            icon1.setBounds(0, 0, 65, 65);
                            networkButton.setCompoundDrawables(null, null, icon1, null);
                        }
                        networkButton.setAutoLinkMask(Linkify.ALL);
                        networkLinearLayout.addView(networkButton);
                        facultyLinearLayoutList.add(networkLinearLayout);
                        networkButtonList.add(networkButton);
                        llFaculties.addView(networkLinearLayout);
                        setClickListenerForButton_link(i, network.getUri());
                        facultyVisibilityList.add(false);
                    }

                    for(int i = 0; i < university.getMap().size(); i++) {
                        Map maps = university.getMap().get(i);
                        LinearLayout mapLinearLayout = createFacultyLinearLayout();
                        Button mapButton = createMapButton(maps.getName(), maps.getUri());
                        if(maps.getName() == R.string.geo){
                            Drawable icon1 = ContextCompat.getDrawable(getActivity(), R.drawable.map);
                            icon1.setBounds(0, 0, 65, 65);
                            mapButton.setCompoundDrawables(null, null, icon1, null);
                        }
                        mapButton.setAutoLinkMask(Linkify.ALL);
                        mapLinearLayout.addView(mapButton);
                        facultyLinearLayoutList.add(mapLinearLayout);
                        mapButtonList.add(mapButton);
                        llFaculties.addView(mapLinearLayout);
                        setClickListenerForButton_map(i, maps.getUri());
                        facultyVisibilityList.add(false);
                    }
                }

            }

        });


        return view;
    }

    public static Ob_univ newInstance() {
        return new Ob_univ();
    }

    private void initViews(View view) {
        llFaculties = view.findViewById(R.id.llFaculties);
        tvUniversityName = view.findViewById(R.id.tvUniversityName);
        tvUniversityDescription = view.findViewById(R.id.tvUniversityDescription);
        tvUniversityDetails = view.findViewById(R.id.tvUniversityDetails);
        tvUniversityIcon = view.findViewById(R.id.tvUniversityIcon);
        tvUniversityPhoto = view.findViewById(R.id.tvUniversityPhoto);

    }

    private void setupUniversityInfo() {
        tvUniversityName.setText(university.getName());
        tvUniversityDescription.setText(university.getDescription());
        tvUniversityDetails.setText(university.getDetails());
        tvUniversityIcon.setImageResource(university.getLogo());
        tvUniversityPhoto.setImageResource(university.getPhoto());
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

    private Button createFacultyButton(int facultyName) {
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
        button.setText(facultyName);
        button.setBackgroundResource(R.drawable.button_ob_univ);
        button.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        button.setLayoutParams(layoutParams);

        return button;
    }
    private Button createNetworkButton(int networkName, int networkUrl) {
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
        button.setPadding(0,0,10,0);
        button.setLinksClickable(true);
        button.setText(networkName);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        button.setTextColor(Color.parseColor(color));
        button.setBackgroundResource(R.drawable.button_ob_univ_link);
        button.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        button.setLayoutParams(layoutParams);
        return button;
    }

    private Button createMapButton(int networkName, int networkUrl) {
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
        button.setPadding(0,0,10,0);
        button.setLinksClickable(true);
        button.setText(networkName);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        button.setTextColor(Color.parseColor(color));
        button.setBackgroundResource(R.drawable.button_ob_univ_link);
        button.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        button.setLayoutParams(layoutParams);
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
        Button button = facultyButtonList.get(indexOfButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toggleFacultyDescription(indexOfButton);
            }
        });
    }
    private void setClickListenerForButton_link(int indexOfButton, int Uri) {
        Button button_link = networkButtonList.get(indexOfButton);
        button_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent brows = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse(getResources().getString(Uri)));
                startActivity(brows);
            }
        });
    }


    private void setClickListenerForButton_map(int indexOfButton, int Uri) {
        Button button_link = mapButtonList.get(indexOfButton);
        button_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent maps = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse(getResources().getString(Uri)));
                maps.setPackage("com.google.android.apps.maps");
                startActivity(maps);
            }
        });
    }

    private void toggleFacultyDescription(int indexOfFaculty) {
        Boolean isVisible = facultyVisibilityList.get(indexOfFaculty);
        facultyVisibilityList.set(indexOfFaculty, !isVisible);
        facultyDescriptionTextViewList.get(indexOfFaculty).setVisibility(!isVisible ? View.VISIBLE : View.GONE);
    }


}