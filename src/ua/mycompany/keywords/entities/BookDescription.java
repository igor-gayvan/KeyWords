/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.mycompany.keywords.entity;

import java.util.List;

/**
 *
 * @author Haivan.I
 */
public class BookDescription extends PrintedText {

    private List<Author> listAuthors;

    private String publisher;
    private String annotation;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public List<Author> getListAuthors() {
        return listAuthors;
    }

    public void setListAuthors(List<Author> listAuthors) {
        this.listAuthors = listAuthors;
    }

    public BookDescription(List<Author> listAuthors, String publisher, String annotation, String title, String text) {
        super(title, text);
        this.listAuthors = listAuthors;
        this.publisher = publisher;
        this.annotation = annotation;
    }
}
