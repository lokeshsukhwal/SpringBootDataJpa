package com.app.lokesh.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Book;
import com.app.lokesh.repository.BookRepository;

@Component
public class BookRunner implements CommandLineRunner {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		bookRepository.saveAll(
				List.of(
						new Book(10,"SBMS","LOKESH",600.0,"backend"),
						new Book(11,"CORE","DURGA",500.0,"backend"),
						new Book(12,"UI","LOKESH",700.0,"fronend"),
						new Book(13,"REACT","RAGHU",500.0,"fronend"),
						new Book(14,"AWS","NATRAJ",400.0,"backend"),
						new Book(15,"ADVJAVA","DURGA",800.0,"backend")
						)
				);
//		bookRepository.getByBookAuthor("LOKESH")
//	    bookRepository.getByBookAuthorAndCost("LOKESH",500.0)
		bookRepository.getBookByIds(Arrays.asList(10,12,14,11))
	    .forEach(System.out::println);
	}

}
