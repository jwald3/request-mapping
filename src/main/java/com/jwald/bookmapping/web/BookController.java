package com.jwald.bookmapping.web;

import com.jwald.bookmapping.domain.Book;
import com.jwald.bookmapping.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
@CrossOrigin
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return new ResponseEntity<Book>(bookService.saveOrUpdateABook(book), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Book> getAllBooks() {
        return bookService.findAll();
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookingById(@PathVariable Long bookId) {
        return new ResponseEntity<Book>(bookService.findBookById(bookId), HttpStatus.OK);
    }
}
