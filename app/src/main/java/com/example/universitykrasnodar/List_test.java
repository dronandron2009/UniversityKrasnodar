package com.example.universitykrasnodar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class List_test extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_test, container, false);
        LinearLayout gol= view.findViewById(R.id.golland);
        LinearLayout klim= view.findViewById(R.id.llklimov);
        LinearLayout iow= view.findViewById(R.id.lliowashi);
        LinearLayout pot= view.findViewById(R.id.potemkina_test);
        LinearLayout shein= view.findViewById(R.id.llshein);
        LinearLayout aizek= view.findViewById(R.id.aizek_test);

        gol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Navigation.findNavController(v).navigate(R.id.action_list_test_to_test_Golland);
            }
        });

        klim.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Navigation.findNavController(v).navigate(R.id.action_list_test_to_test_Klimov);
            }
        });
        iow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Navigation.findNavController(v).navigate(R.id.action_list_test_to_test_iovashi);
            }
        });
        shein.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Navigation.findNavController(v).navigate(R.id.action_list_test_to_test_sheina);
            }
        });
        pot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Navigation.findNavController(v).navigate(R.id.action_list_test_to_test_potemkina);
            }
        });
        aizek.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Navigation.findNavController(v).navigate(R.id.action_list_test_to_test_aizek);
            }
        });
        return view;
        }
    }

