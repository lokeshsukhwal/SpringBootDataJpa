package com.app.lokesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
//  [ select * from book where author = ? ]
//	List<Book> findBybookName(String bookName);

//  [select * from book where bookType = ? ]

//	List<Book> findBybookType(String bookType);
	
	List<Book> findBybookCostLessThan(Double bookCost);

}
