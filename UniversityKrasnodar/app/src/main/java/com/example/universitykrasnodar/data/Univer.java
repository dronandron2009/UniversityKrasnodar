package com.example.universitykrasnodar.data;

import com.example.universitykrasnodar.Map;

import java.util.ArrayList;
public class Univer{
    private final int id;
    private final int logo;
    private final int photo;
    private final int name;
    private final int description;
    private final int details;
    private final ArrayList<Fackultet> facultyList;
    private final ArrayList<Link> networks;
    private final ArrayList<Map> map;

    public Univer(int id, int name, int logo, int description, int photo,  int details, ArrayList<Fackultet> facultyList, ArrayList<Link> networks, ArrayList<Map> map) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.description = description;
        this.photo = photo;
        this.details = details;
        this.facultyList = facultyList;
        this.networks = networks;
        this.map = map;
    }

    public int getId() {
        return id;
    }

    public int getLogo() {
        return logo;
    }

    public int getPhoto() {
        return photo;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public int getDetails() {
        return details;
    }

    public ArrayList<Fackultet> getFacultyList() {
        return facultyList;
    }

    public ArrayList<Link> getNetworks(){
        return networks;
    }
    public ArrayList<Map> getMap(){
        return map;
    }
}

