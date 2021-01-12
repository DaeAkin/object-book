package dev.donghyeon.example.libarary;

public class Library {

    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepositoryImpl(new CommaPersistStrategy());
        BookService bookService = new BookService(bookRepository);
        bookService.open();
    }
}
