package com.app.lokesh.runner;

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
						new Book(10,"SBMS","lokesh",600.0,"backend"),
						new Book(11,"CORE","durga",500.0,"backend"),
						new Book(12,"UI","ashok",700.0,"fronend"),
						new Book(13,"REACT","raghu",500.0,"fronend"),
						new Book(14,"AWS","natraj",400.0,"backend"),
						new Book(15,"ADVJAVA","durga",800.0,"backend")
						)
				);
				
//      bookRepository.findBybookName("SBMS") 				 
//		bookRepository.findBybookType("backend")
		bookRepository.findBybookCostLessThan(600.0)
		       .forEach(System.out::println);
	}

}
