package com.service;

import java.util.List;

import com.model.Book;

public interface BookService {
	List<Book> getAllBooks();
	int addBook(Book book);
    int deleteBook(int book_id1);
	int updateBook(int book_id2, int book_price1, int category_id1);
//	public int dateDiff(int member_id);
}