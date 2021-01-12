package dev.donghyeon.example.libarary;

public class CommaPersistStrategy implements PersistStrategy{
    private static final String COMMA = ",";

    @Override
    public String getCombinatedBook(Book book) {
        StringBuilder sb = new StringBuilder();
        sb.append(book.getId());
        sb.append(getSeparator());
        sb.append(book.getTitle());
        sb.append(getSeparator());
        sb.append(book.getAuthor());

        return sb.toString();
    }

    @Override
    public String getSeparator() {
        return COMMA;
    }
}
