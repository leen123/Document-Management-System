package com.company.step6;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    String name;
    List<Page> pageList=new ArrayList<>();
    @Override
    public String toString() {
        return "Chapter"+":"+name+":"+pageList.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Page> getPageList() {
        return pageList;
    }
}
