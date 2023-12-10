package com.company.step2;

import com.company.step6.Chapter;

import java.util.ArrayList;
import java.util.List;

public class Book implements Document{
    String name;
    List<Chapter> chapterList=new ArrayList<>();
    @Override
    public String getTypeDocument() {
        return "Book";
    }

    @Override
    public String toString() {
        return getTypeDocument()+":"+name+chapterList;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public List<Chapter> getChapterList() {
        return chapterList;
    }
}
