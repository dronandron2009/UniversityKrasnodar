package com.example.universitykrasnodar.ViewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.universitykrasnodar.Repository;
import com.example.universitykrasnodar.data.Univer;

public class UniverViewModel extends ViewModel {
    private Repository repository;
    public MutableLiveData<Univer[]> univerLiveData=new MutableLiveData<>();
    public void init(Repository repository){
        this.repository=repository;
    }

    public void getUnivers(){
        Univer[] univers=repository.allUnivers;
        univerLiveData.setValue(univers);
    }
}
