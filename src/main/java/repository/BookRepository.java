package repository;

import java.util.List;

import repository.JpaRepository;

import model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
  List<Book> findByPublished(boolean published);
  List<Book> findByTitleContaining(String title);
}