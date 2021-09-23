package com.service;
import com.dao.BookDaoImplementation;

import java.util.List;

import com.dao.BooKDao;
import com.model.Book;

public  class BookServiceImplementation implements BookService {
	
 BooKDao booKDao;
 
 public BookServiceImplementation() {
	// TODO Auto-generated constructor stub
	 booKDao = new BookDaoImplementation();
 }
	public BookServiceImplementation(BooKDao booKDao) {
	this.booKDao = booKDao;
}
	

	public BooKDao getBooKDao() {
		return booKDao;
	}


	public void setBooKDao(BooKDao booKDao) {
		this.booKDao = booKDao;
	}


	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return booKDao.getAllBooks();
	}
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		return booKDao.addBook(book);
		
	}
	@Override
	public int deleteBook(int book_id1) {
		// TODO Auto-generated method stub
		return booKDao.deleteBook(book_id1);
	}
	public int updateBook(int book_id2,int book_price1,int category_id1) {
		// TODO Auto-generated method stub
		return booKDao.updateBook( book_id2, book_price1, category_id1);
		
	}
//	public int dateDiff(int member_id) {
		// TODO Auto-generated method stub
	//	return booKDao.dateDiff(member_id);
//	}
	
	}
