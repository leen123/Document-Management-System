package com.company.step3;

public class AudioLibrary {
    String name;
    void play(){
        System.out.println("play audio : "+name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
