package dev.donghyeon.example.libarary;

public class Book {
    private static final String COMMA = ",";

    private Long id;
    private String title;
    private String author;

    public Book() {
    }

    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toPersist() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.id);
        sb.append(COMMA);
        sb.append(this.title);
        sb.append(COMMA);
        sb.append(this.author);

        return sb.toString();
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
