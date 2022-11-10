package com.app.lokesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.lokesh.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
	//[select * from book where author like = ? ]
	//@Query("SELECT b FROM Book b WHERE b.bookAuthor = ?1 ") 
	  /*
	   * @Query("SELECT b FROM Book b WHERE b.bookAuthor = :bookAuthor ") List<Book>
	   * getByBookAuthor(String bookAuthor);
	   */
	 
	
	 //[select * from book where author like ? or bookCost > ?] 
	 //@Query("SELECT b FROM Book b WHERE b.bookAuthor like ?1 OR b.bookCost > ?2")
		/*
		 * @Query("select b from book where b.bookAuthor like :bookAuthor OR > :bookCost"
		 * ) List<Book> getByBookAuthorAndCost(String bookAuthor,Double bookCost);
		 */

	
	 //[select * from book where bookId in (?,?,?)] 
	 // @Query("SELECT b FROM Book b WHERE b.bookId in (?1)")
	 @Query("SELECT b FROM Book b WHERE b.bookId in (:bookId)")
	  List<Book> getBookByIds(List<Integer> bookId);
	 
}
