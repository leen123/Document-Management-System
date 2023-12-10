package com.company.step5;

import com.company.step2.Document;
import com.company.step2.DocumentFactory;


public class ProxyDocument implements BasicDocument{

    DocumentFactory documentFactory=new DocumentFactory();
    String typeUser=TypeUser.user.name();

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    @Override
    public Document getDocument() {
        if(typeUser.equals(TypeUser.admin.name()))
        return documentFactory.getDocument();
        else return null;
    }

    @Override
    public void setDocument(Document document) {
        documentFactory.setDocument(document);
    }

    @Override
    public String getTypeItem() {
        return null;
    }

    @Override
    public String toString() {
        if(typeUser.equals(TypeUser.admin.name()))
            return documentFactory.toString();
        else return "";
    }
}
