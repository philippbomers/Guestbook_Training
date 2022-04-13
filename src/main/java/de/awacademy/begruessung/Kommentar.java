package de.awacademy.begruessung;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Kommentar {

    @Id
    @GeneratedValue
    private int id;

    private String text;

    @ManyToOne
    private Beitrag beitrag;

    public Kommentar() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Beitrag getBeitrag() {
        return beitrag;
    }

    public void setBeitrag(Beitrag beitrag) {
        this.beitrag = beitrag;
    }
}
