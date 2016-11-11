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
public class Article extends PrintedText {

    private List<Author> listAuthors;

    private String journalName;
    private int year;
    private int numberArticle;

    public List<Author> getListAuthors() {
        return listAuthors;
    }

    public void setListAuthors(List<Author> listAuthors) {
        this.listAuthors = listAuthors;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberArticle() {
        return numberArticle;
    }

    public void setNumberArticle(int numberArticle) {
        this.numberArticle = numberArticle;
    }

    public Article(List<Author> listAuthors, String journalName, int year, int numberArticle, String title, String text) {
        super(title, text);
        this.listAuthors = listAuthors;
        this.journalName = journalName;
        this.year = year;
        this.numberArticle = numberArticle;
    }

}
