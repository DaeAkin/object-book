package dev.donghyeon.example.libarary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {

    public static Optional<Books> findAllBooks() {
        return Optional.of(readTxtFile());
    }

    public static void saveAll(Books books) {
//        try (BufferedReader in = new BufferedReader(new FileReader("/Users/donghyeonmin/object-book/src/main/java/dev/donghyeon/example/libarary/books.txt"))) {
//            while((line = bufferedReader.readLine()) != null)
//            {
//                sb.append(line); //append the lines to the string
//                sb.append('\n'); //append new line
//            } //end while
//
//        }
    }

    private static Books readTxtFile() {
        List<Book> books = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader("/Users/donghyeonmin/object-book/src/main/java/dev/donghyeon/example/libarary/books.txt"))) {
            String str;
            while ((str = in.readLine()) != null) {
                String[] split = str.split(",");
                Long bookNumber = Long.parseLong(split[0]);
                String title = split[1];
                String author = split[2];

                Book book = new Book(bookNumber, title, author);
                books.add(book);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 실패");
        }

        return Books.from(books);
    }

}
