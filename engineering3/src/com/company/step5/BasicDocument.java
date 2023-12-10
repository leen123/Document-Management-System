package com.company.step5;

import com.company.step1.Item;
import com.company.step2.Document;

public interface BasicDocument extends Item {
    public Document getDocument();
    public void setDocument(Document document);

    @Override
    String getTypeItem();
}
