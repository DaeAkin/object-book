package dev.donghyeon.example.libarary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository{
    private static final String BOOKS_TXT = "books.txt";

    @Override
    public Books findAllBooks() {
        return readTxtFile();
    }

    @Override
    public Books saveAll(Books books) {
        writeTxtFile(books);
        return books;
    }

    private void writeTxtFile(Books books) {
        File file = new File(BOOKS_TXT);
        final List<Book> bookList = books.toList();

        try(FileWriter writer = new FileWriter(file.getAbsolutePath(), false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (Book book: bookList) {
                bufferedWriter.write(book.toPersist());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Books readTxtFile() {
        List<Book> books = new ArrayList<>();
        File file = new File(BOOKS_TXT);

        try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
            String str;
            while ((str = in.readLine()) != null) {
                Book book = getBook(str);
                books.add(book);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 실패 file Path : " + file.getAbsolutePath());
        }

        return Books.from(books);
    }

    private Book getBook(String str) {
        String[] split = str.split(",");
        Long bookNumber = Long.parseLong(split[0]);
        String title = split[1];
        String author = split[2];
        return new Book(bookNumber, title, author);
    }

}
