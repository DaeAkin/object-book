package dev.donghyeon.example.libarary;

import java.util.Optional;
import java.util.Scanner;

public class BookService {
    private static final String BOOK_INSERT = "1";
    private static final String BOOK_REMOVE = "2";
    private static final String BOOK_FIND = "3";
    private static final String END_PROGRAM = "X";


    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public void open() {
        Books books = bookRepository.findAllBooks();
        String command;
        while (true) {
            BookPrinter.printBooks(books);
            BookPrinter.printGuideMessage();
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();

            switch (command) {
                case BOOK_INSERT:
                    books = insertBook(scanner, books);
                    break;
                case BOOK_REMOVE:
                    books = removeBook(scanner, books);
                    break;
                case BOOK_FIND:
                    findBook(scanner, books);
                    break;
                case END_PROGRAM:
                    return;

            }
        }


    }

    private void findBook(Scanner scanner, Books books) {
        BookPrinter.printFindBook();
        String bookString = scanner.nextLine();

        final Optional<Book> book = books.find(bookString);
        book.ifPresent(BookPrinter::printBook);
    }

    private Books removeBook(Scanner scanner, Books books) {
        BookPrinter.printDeleteMessage();
        String bookString = scanner.nextLine();

        Long bookId = Long.parseLong(bookString);
        Books removedBooks = books.remove(bookId);
        return bookRepository.saveAll(removedBooks);
    }

    private Books insertBook(Scanner scanner, Books books) {
        BookPrinter.printInsertedBook();
        String bookString = scanner.nextLine();
        String[] bookSplit = bookString.split(",");

        Books insertedBooks = books.add(new BookAddRequest(
                bookSplit[0],
                bookSplit[1])
        );
        return bookRepository.saveAll(insertedBooks);
    }
}
