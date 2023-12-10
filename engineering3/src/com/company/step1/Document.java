package com.company.step1;

public class Document implements Item {
    String name;

    @Override
    public String getTypeItem() {
        return "Document";
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
