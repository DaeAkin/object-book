package dev.donghyeon.example.libarary;

public interface BookRepository {

    Books findAllBooks();

    Books saveAll(Books books);

}
