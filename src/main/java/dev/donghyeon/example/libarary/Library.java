package dev.donghyeon.example.libarary;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1L,"a","b"));
        Books books1 = Books.from(bookList);
        Books books2 = Books.from(bookList);

        books2 = books2.add(new BookAddRequest("bb","cc"));

        BookPrinter.printBooks(books1);BookPrinter.printBooks(books2);


//        BookRepository bookRepository = new BookRepositoryImpl(new CommaPersistStrategy());
//        BookService bookService = new BookService(bookRepository);
//        bookService.open();
    }
}
