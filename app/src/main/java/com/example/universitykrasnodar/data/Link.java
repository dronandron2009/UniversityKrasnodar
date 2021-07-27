package com.example.universitykrasnodar.data;

public class Link {
    int id;
    private int name;
    private int uri;

    public Link(int id, int name, int uri){
        this.id = id;
        this.name = name;
        this.uri = uri;
    }

    public int getId(){
        return id;
    }

    public int getName(){
        return name;
    }

    public int getUri(){
        return uri;
    }
}
