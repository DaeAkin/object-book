package dev.donghyeon.example.libarary;

public class BookAddRequest {

    private String title;
    private String author;

    public BookAddRequest(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public BookAddRequest() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
