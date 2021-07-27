package com.example.universitykrasnodar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;

import com.example.universitykrasnodar.ViewModels.UniverViewModel;

public class MainActivity extends AppCompatActivity {
    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Repository repository=Repository.getInstance();
        repository.createData();

        UniverViewModel viewModel=new ViewModelProvider(this).get(UniverViewModel.class);
        viewModel.init(repository);
    }
}