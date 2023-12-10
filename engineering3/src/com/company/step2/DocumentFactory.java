package com.company.step2;

import com.company.step5.BasicDocument;

public  class DocumentFactory implements BasicDocument{
    Document document;

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public String getTypeItem() {
        return null;
    }

    @Override
    public String toString() {
        return document.toString();
    }
}
