package com.jwald.bookmapping;

import com.jwald.bookmapping.domain.Book;
import com.jwald.bookmapping.repositories.BookRepository;
import com.jwald.bookmapping.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMappingApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository bookRepository, ReviewRepository reviewRepository) {
		return (args) -> {
			bookRepository.save(new Book("Atomic Habits", "James Clear"));
			bookRepository.save(new Book("Zero to One", "Peter Thiel"));
			bookRepository.save(new Book("The End of History", "Francis Fukuyama"));
		};
	}
}
