/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.mycompany.keywords;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ua.mycompany.keywords.entity.Article;
import ua.mycompany.keywords.entity.Author;
import ua.mycompany.keywords.entity.BookDescription;
import ua.mycompany.keywords.entity.WikiArticle;

/**
 *
 * @author Haivan.I
 */
public class KeyWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Author> listAuthors1 = new LinkedList<>();

        listAuthors1.add(new Author("FirstName_Author1", "SurName_Author1"));
        listAuthors1.add(new Author("FirstName_Author2", "SurName_Author2"));

        List<Author> listAuthors2 = new LinkedList<>();
        listAuthors2.add(new Author("FirstName_Author3", "SurName_Author3"));

        List<WikiArticle> listWikiArticles = new LinkedList<>();

        listWikiArticles.add(new WikiArticle("https://1", "title_WikiArticle_1", "text_WikiArticle_1"));
        listWikiArticles.add(new WikiArticle("https://2", "title_WikiArticle_2", "text_WikiArticle_2"));

        List<BookDescription> listBookDescriptions = new LinkedList<>();

        listBookDescriptions.add(new BookDescription(listAuthors1, "publisher1", "annotation1", "title1", "text1"));
        listBookDescriptions.add(new BookDescription(listAuthors2, "publisher2", "annotation2", "title2", "text2"));

        List<Article> listArticles = new LinkedList<>();
        listArticles.add(new Article(listAuthors1, "journalName1", 1999, 1, "title4", "text4"));
        listArticles.add(new Article(listAuthors2, "journalName1", 2016, 4, "title5", "text6"));
        listArticles.add(new Article(listAuthors2, "journalName2", 2000, 2, "title6", "text7"));

        Set<String> setKeyWords = new HashSet<>();
        
        
    }
}
