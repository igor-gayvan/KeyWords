/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.mycompany.keywords;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ua.mycompany.keywords.entities.Article;
import ua.mycompany.keywords.entities.Author;
import ua.mycompany.keywords.entities.BookDescription;
import ua.mycompany.keywords.entities.PrintedText;
import ua.mycompany.keywords.entities.WikiArticle;

/**
 *
 * @author Haivan.I
 */
public class KeyWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Author> authors1 = new ArrayList<>();

        authors1.add(new Author("FirstName_Author1", "SurName_Author1"));
        authors1.add(new Author("FirstName_Author2", "SurName_Author2"));

        List<Author> authors2 = new ArrayList<>();
        authors2.add(new Author("FirstName_Author3", "SurName_Author3"));

        List<PrintedText> printedTexts = new ArrayList<>();

        printedTexts.add(new WikiArticle("https://1", "title_WikiArticle_1", "text_WikiArticle_1"));
        printedTexts.add(new WikiArticle("https://2", "title_WikiArticle_2", "text_WikiArticle_2"));

        printedTexts.add(new BookDescription(authors1, "publisher1", "annotation1", "title1", "text1"));
        printedTexts.add(new BookDescription(authors2, "publisher2", "annotation2", "title2", "text2"));

        printedTexts.add(new Article(authors1, "journalName1", 1999, 1, "title4", "text4"));
        printedTexts.add(new Article(authors2, "journalName1", 2016, 4, "title5", "text6"));
        printedTexts.add(new Article(authors2, "journalName2", 2000, 2, "title6", "text7"));
        printedTexts.add(new Article(authors2, "journalName2", 2000, 2, "title6", "key"));
        printedTexts.add(new Article(authors2, "journalName2", 2000, 2, "title6", "word"));

        Set<String> keyWords = new HashSet<>();
        keyWords.add("key");
        keyWords.add("word");

        int cntObject = 0;

        for (PrintedText printedText : printedTexts) {
            if (containsKeyWord(keyWords, printedText.getText()) | containsKeyWord(keyWords, printedText.getTitle())) {
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
