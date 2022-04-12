package de.awacademy.begruessung;

import javax.validation.constraints.NotEmpty;

public class Greeting {

    @NotEmpty
    private String name;
    @NotEmpty
    private String content;
    @NotEmpty
    private String title;

    private int id;

    public Greeting() {
    }

    public Greeting(int id, String name, String title, String content) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
