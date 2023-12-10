package com.company.step1;

import java.util.ArrayList;
import java.util.List;

public class Category implements Item {
    String name;
    List<Item> itemList=new ArrayList<>();

    @Override
    public String getTypeItem() {
        return "Category";
    }

    @Override
    public String toString() {
        return name+" : "+itemList;
    }
    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public String getName() {
        return name;
    }
}
