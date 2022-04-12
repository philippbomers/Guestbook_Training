package de.awacademy.begruessung;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beitrag {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String nachricht;
    private String title;

    public Beitrag() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
