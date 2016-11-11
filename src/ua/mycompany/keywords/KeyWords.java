/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.mycompany.keywords;

import java.io.PrintStream;
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
        List<Author> authors1 = new LinkedList<>();

        authors1.add(new Author("FirstName_Author1", "SurName_Author1"));
        authors1.add(new Author("FirstName_Author2", "SurName_Author2"));

        List<Author> authors2 = new LinkedList<>();
        authors2.add(new Author("FirstName_Author3", "SurName_Author3"));

        List<WikiArticle> wikiArticles = new LinkedList<>();

        wikiArticles.add(new WikiArticle("https://1", "title_WikiArticle_1", "text_WikiArticle_1"));
        wikiArticles.add(new WikiArticle("https://2", "title_WikiArticle_2", "text_WikiArticle_2"));

        List<BookDescription> bookDescriptions = new LinkedList<>();

        bookDescriptions.add(new BookDescription(authors1, "publisher1", "annotation1", "title1", "text1"));
        bookDescriptions.add(new BookDescription(authors2, "publisher2", "annotation2", "title2", "text2"));

        List<Article> articles = new LinkedList<>();
        articles.add(new Article(authors1, "journalName1", 1999, 1, "title4", "text4"));
        articles.add(new Article(authors2, "journalName1", 2016, 4, "title5", "text6"));
        articles.add(new Article(authors2, "journalName2", 2000, 2, "title6", "text7"));
        articles.add(new Article(authors2, "journalName2", 2000, 2, "title6", "keyword"));        

        Set<String> keyWords = new HashSet<>();
        keyWords.add("keyword");

        int cntObject = 0;

        for (Article article : articles) {
            if (containsKeyWord(keyWords, article.getText()) | containsKeyWord(keyWords, article.getTitle())) {
                cntObject++;
            }
        }

        for (BookDescription bookDescription : bookDescriptions) {
            if (containsKeyWord(keyWords, bookDescription.getText()) | containsKeyWord(keyWords, bookDescription.getTitle())) {
                cntObject++;
            }
        }

        for (WikiArticle wikiArticle : wikiArticles) {
            if (containsKeyWord(keyWords, wikiArticle.getText()) | containsKeyWord(keyWords, wikiArticle.getTitle())) {
                cntObject++;
            }
        }

        System.out.printf("%d objects contains given key words in titles and/or texts\n", cntObject);
    }

    private static boolean containsKeyWord(Set<String> keyWords, String sentence) {
        for (String keyWord : keyWords) {
            if (sentence.contains(keyWord)) {
                return true;
            }
        }

        return false;
    }
}
