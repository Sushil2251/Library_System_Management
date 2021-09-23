package com.dao;

import java.util.List;

import com.model.Book;

public interface BooKDao {
	List<Book> getAllBooks();
    int addBook(Book book);
    int deleteBook(int book_id1);
	int updateBook(int book_id2, int book_price1, int categoryint_id1);
  
}
