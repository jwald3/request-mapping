package com.jwald.bookmapping.repositories;

import com.jwald.bookmapping.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book getByBookId(Long bookId);
}
