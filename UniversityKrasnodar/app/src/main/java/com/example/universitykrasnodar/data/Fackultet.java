package com.example.universitykrasnodar.data;

public class Fackultet {
    private int id;
    private int name;
    private int description;
    private String constant;



    public Fackultet(int id, int name, int description, String constant) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.constant = constant;
    }

    public int getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public String getConstant(){return constant;}

}
