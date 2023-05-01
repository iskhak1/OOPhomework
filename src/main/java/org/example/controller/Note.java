package org.example.controller;

public class Note {

    private int Id;
    private String title;
    private String content;

    public Note(int id,String title, String content) {
        this.Id = id;
        this.title = title;
        this.content = content;
    }
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Id=" + Id + ", title='" + title + '\'' + ", content='" + content + '\'' +"\n";
    }
}
