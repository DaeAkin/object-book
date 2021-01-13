package dev.donghyeon.example.libarary;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Books {

    private final List<Book> books;

    private Books(List<Book> books) {
        this.books = books;
    }

    public List<Book> getList() {
        return Collections.unmodifiableList(books);
    }

    public static Books from(List<Book> books) {
        return new Books(books);
    }

    private Long findMaxId() {
        return books.stream()
                .map(Book::getId)
                .max(Long::compareTo).orElse(0L);

    }

    public Books add(BookAddRequest request) {
        List<Book> list = new ArrayList<>(books);
        list.add(new Book(
                findMaxId() + 1
                ,request.getTitle()
                ,request.getAuthor())
        );
        return new Books(list);
    }

    public Books remove(Long bookId) {
        List<Book> result = books.stream().
                filter(book -> !book.getId().equals(bookId)).
                collect(Collectors.toList());
        return new Books(result);
    }

    public Optional<Book> find(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst();
    }

    public Stream<Book> stream() {
        return books.stream();
    }

}
