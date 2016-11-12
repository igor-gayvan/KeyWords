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
public class Author {
    private int id;
    private String FirstName;
    private String SurName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String SurName) {
        this.SurName = SurName;
    }

    public Author(String FirstName, String SurName) {
        this.FirstName = FirstName;
        this.SurName = SurName;
    }
}
