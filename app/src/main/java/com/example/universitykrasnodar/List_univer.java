package com.example.universitykrasnodar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import static com.example.universitykrasnodar.unitls.utils.INDEX;

public class List_univer extends Fragment {
    public int id_univer;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_univer, container, false);
        LinearLayout uzniy_univer_click= view.findViewById(R.id.uzniy_univer_click);
        uzniy_univer_click.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 0;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ,bundle);
            }

        });
        LinearLayout kub_univer_click= view.findViewById(R.id.kub_univer_click);
        kub_univer_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 1;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ, bundle);

            }
        });
        LinearLayout kub_univer_tech_click= view.findViewById(R.id.kub_univer_tech_click);
        kub_univer_tech_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 2;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ, bundle);

            }
        });
        LinearLayout krasnodar_gos_universitet_click= view.findViewById(R.id.krasnodar_gos_universitet_click);
        krasnodar_gos_universitet_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 3;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ, bundle);
            }
        });
        LinearLayout academiya_marketinga_click= view.findViewById(R.id.academiya_marketinga_click);
        academiya_marketinga_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 4;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ, bundle);
            }
        });
        LinearLayout finance_univer_click= view.findViewById(R.id.finance_univer_click);
        finance_univer_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 5;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ, bundle);
            }
        });
        LinearLayout kub_gos_med_univer_click= view.findViewById(R.id.kub_gos_med_univer_click);
        kub_gos_med_univer_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 6;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ, bundle);
            }
        });
        LinearLayout kub_gos_univer_fizika_click= view.findViewById(R.id.kub_gos_univer_fizika_click);
        kub_gos_univer_fizika_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 7;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ, bundle);
            }
        });
        LinearLayout rf_econom_click= view.findViewById(R.id.rf_econom_click);
        rf_econom_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 8;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ, bundle);
            }
        });
        LinearLayout krasnodar_mvd_click= view.findViewById(R.id.krasnodar_mvd_click);
        krasnodar_mvd_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 9;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ, bundle);
            }
        });
        LinearLayout kub_gos_univer_click= view.findViewById(R.id.kub_gos_univer_click);
        kub_gos_univer_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle=new Bundle();
                id_univer = 10;
                bundle.putInt(INDEX,id_univer );
                Navigation.findNavController(v).navigate(R.id.action_list_univer_to_ob_univ, bundle);
            }
        });



        return view;
    }
}