package com.company.step2;

public class Video implements Document{
    String name;
    int rate;
    int size;
    @Override
    public String getTypeDocument() {
        return "Video";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return getTypeDocument()+":"+name;
    }
}
