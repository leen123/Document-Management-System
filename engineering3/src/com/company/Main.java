package com.company;

import com.company.step1.Category;
import com.company.step1.Item;
import com.company.step2.*;
import com.company.step3.AudioAdapter;
import com.company.step4.AudioAdapterSingltone;
import com.company.step5.BasicDocument;
import com.company.step5.ProxyDocument;
import com.company.step5.TypeUser;
import com.company.step6.Chapter;
import com.company.step6.Page;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//
//        Document doc1=new Document();
//        Document doc2=new Document();
//        Document doc3=new Document();
//        doc1.setName("doc1");
//        doc2.setName("doc2");
//        doc3.setName("doc3");
//
//        Category category1= new Category();
//        category1.setName("cat1");
//        category1.getItemList().add(doc1);
//
//        Category category2= new Category();
//        category2.setName("cat2");
//        category2.getItemList().add(category1);
//        category2.getItemList().add(doc2);
//        category2.getItemList().add(doc3);
//
//        Item item = category2;
//        System.out.println(item.toString());
//	// write your code here


//        DocumentFactory documentFactory=new DocumentFactory();
//        documentFactory.setDocument(new Book());
//        System.out.println(documentFactory.getDocument().getTypeDocument());
//        documentFactory.setDocument(new AudioFile());
//        System.out.println(documentFactory.getDocument().getTypeDocument());
//        documentFactory.setDocument(new Video());
//        System.out.println(documentFactory.getDocument().getTypeDocument());


//        AudioFile audioFile=new AudioFile();
//        audioFile.setName("audio1");
//        AudioAdapter audioAdapter=new AudioAdapter();
//        audioAdapter.play(audioFile);


//        AudioFile audioFile=new AudioFile();
//        audioFile.setName("audio1");
//       AudioAdapterSingltone.getInstance().play(audioFile);
//


        Category category1= new Category();
        category1.setName("cat1");
        BasicDocument basicDocument1=new DocumentFactory();
        ProxyDocument proxyDocument=new ProxyDocument();
        proxyDocument.setTypeUser(TypeUser.user.name());
        BasicDocument basicDocument2=proxyDocument;
        basicDocument1.setDocument(new AudioFile());
        basicDocument2.setDocument(new Video());
        category1.getItemList().add(basicDocument1);
        category1.getItemList().add(basicDocument2);
        Item item = category1;
        System.out.println(item.toString());


//
//        DocumentFactory documentFactory=new DocumentFactory();
//        Book book=new Book();
//        book.setName("book1");
//
//        Chapter chapter=new Chapter();
//        chapter.setName("chapter1");
//
//        chapter.getPageList().add(new Page());
//        chapter.getPageList().add(new Page());
//        book.getChapterList().add(chapter);
//
//        Chapter chapter2=new Chapter();
//        chapter2.setName("chapter2");
//
//        chapter2.getPageList().add(new Page());
//        chapter2.getPageList().add(new Page());
//        chapter2.getPageList().add(new Page());
//        chapter2.getPageList().add(new Page());
//        book.getChapterList().add(chapter2);
//
//        documentFactory.setDocument(book);
//        System.out.println(documentFactory.getDocument());

    }
}
