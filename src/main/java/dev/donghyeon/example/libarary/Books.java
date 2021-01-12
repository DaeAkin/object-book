package dev.donghyeon.example.libarary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Books {

    private List<Book> books;

    private Books(Book... book) {
        books = Arrays.asList(book);
    }

    private Books(List<Book> books) {
        this.books = books;
    }

    public static Books from(Book... book) {
        return new Books(book);
    }

    public static Books from(List<Book> books) {
        return new Books(books);
    }

    //TODO
    public Books reserve(Books reserveBooks) {
        for (Book reserveBook : reserveBooks.books) {
            books.remove(reserveBook);
        }
        return new Books(this.books);
    }

    private boolean contains(Book book) {
        return books.contains(book);
    }

    public Books add(Book book) {
        books.add(book);
        return new Books(books);
    }

    public Books remove(Long bookId) {
        List<Book> result = books.stream().
                filter(book -> !book.getId().equals(bookId)).
                collect(Collectors.toList());
        return new Books(result);
    }

    public Books remove(Book book) {
        books.remove(book);
        return new Books(books);
    }

    public Book find(Long bookId) {
        return books.stream()
                .filter(book -> book.getId().equals(bookId))
                .findFirst()
                .orElse(new Book());
    }

    public Stream<Book> stream() {
        return books.stream();
    }

}
