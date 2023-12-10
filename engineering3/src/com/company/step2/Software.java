package com.company.step2;

public class Software implements Document{
    String name;
    int rate;
    @Override
    public String getTypeDocument() {
        return "Software";
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
