package com.example.universitykrasnodar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class Home extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button list_univer = view.findViewById(R.id.button_to_list_university);
        Button test = view.findViewById(R.id.button_to_test_vocational_guidance);
        list_univer.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_home2_to_list_univer));
        test.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_home2_to_list_test));
        return view;
    }
}