package dev.donghyeon.example.libarary;

import java.util.Scanner;

public class BookClient {
    private static final String BOOK_INSERT = "1";
    private static final String BOOK_REMOVE = "2";

    public static void main(String[] args) {
        Books books = BookRepository.findAllBooks().orElseThrow(() -> new RuntimeException("쿠쿠"));


        while (true) {
            BookPrinter.printBooks(books);
            BookPrinter.printGuideMessage();
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            switch (command) {
                case BOOK_INSERT:
                    books = insertBook(scanner,books);
                    break;
                case BOOK_REMOVE:
                    books = removeBook(scanner,books);
            }
        }


    }

    private static Books removeBook(Scanner scanner, Books books) {
        BookPrinter.printDeleteMessage();
        String bookString = scanner.nextLine();

        Long bookId = Long.parseLong(bookString);
        return books.remove(bookId);
    }

    private static Books insertBook(Scanner scanner, Books books) {
        BookPrinter.printInsertedBook();
        String bookString = scanner.nextLine();
        String[] bookSplit = bookString.split(",");

       return  books.add(new Book(
                Long.parseLong(bookSplit[0]),
                bookSplit[1],
                bookSplit[2])
        );
    }
}
