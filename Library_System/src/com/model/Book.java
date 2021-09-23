package com.model;

public class Book {
	int book_id;
	String book_name;
	int book_price;
	int author_id;
	int category_id;
	public Book () {
	}
	
	public Book(int book_id, String book_name, int book_price, int author_id, int category_id)
	{
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_price = book_price;
		this.author_id = author_id;
		this.category_id = category_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_price=" + book_price + ", author_id="
				+ author_id + ", category_id=" + category_id + "]";
	}

	public void deleteBook(int book_id1) {
		// TODO Auto-generated method stub
		
	}
	public void updateBook(int book_id2, int book_price1, int category_id1)
	{
	
	}
}
	