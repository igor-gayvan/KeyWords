/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.mycompany.keywords.entities;

/**
 *
 * @author Haivan.I
 */
public class WikiArticle extends PrintedText {

    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public WikiArticle(String link, String title, String text) {
        super(title, text);
        this.link = link;
    }
}
