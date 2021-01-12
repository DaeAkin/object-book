package dev.donghyeon.example.libarary;

import java.util.stream.Collectors;

public class BookPrinter {
    private static final String COMMA = ",";
    private static final String FIND_ALL_BOOK_MESSAGE = "모든 책의 목록 입니다.";
    private static final String INSERTED_BOOK_MESSAGE = "추가할 책 이름과 저자를 입력하세요. ex) 해리포터,민동현";
    private static final String SEARCH_BOOK_MESSAGE = "찾고 싶은 책 이름을 입력하세요.";
    private static final String DELETE_BOOK_MESSAGE = "삭제 하고 싶은 책 ID를 입력하세요.";
    private static final String GUIDE_MESSAGE = "1.책 추가 2.책 삭제 3.책 검색 (X 입력 시 프로그램 종료)";


    private BookPrinter() {}

    public static void printBooks(Books books) {
        String allBooks =
                books.stream()
                        .map(Book::toString)
                        .collect(Collectors.joining(COMMA));
        System.out.println(FIND_ALL_BOOK_MESSAGE);
        System.out.println(allBooks);
    }

    public static void printBook(Book book) {
        System.out.println("책 번호 : " + book.getId() +
                "책 이름 : " + book.getTitle() +
                "책 저자 : " + book.getAuthor());
    }

    public static void printInsertedBook() {
        System.out.println(INSERTED_BOOK_MESSAGE);
    }

    public static void printDeleteMessage(){System.out.println(DELETE_BOOK_MESSAGE);}

    public static void printFindBook() {
        System.out.println(SEARCH_BOOK_MESSAGE);
    }

    public static void printGuideMessage() {
        System.out.println(GUIDE_MESSAGE);
    }


}
