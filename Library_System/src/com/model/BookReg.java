package com.model;

public class BookReg {
	int book_id;
	String book_name;
	int issue_date;
	int due_date;
	String book_returned;
	
	public BookReg()
	{
	
	}

	public BookReg(int book_id, String book_name, int issue_date, int due_date, String book_returned) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.issue_date = issue_date;
		this.due_date = due_date;
		this.book_returned = book_returned;
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

	public int getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(int issue_date) {
		this.issue_date = issue_date;
	}

	public int getDue_date() {
		return due_date;
	}

	public void setDue_date(int due_date) {
		this.due_date = due_date;
	}

	public String getBook_returned() {
		return book_returned;
	}

	public void setBook_returned(String book_returned) {
		this.book_returned = book_returned;
	}

	@Override
	public String toString() {
		return "BookReg [book_id=" + book_id + ", book_name=" + book_name + ", issue_date=" + issue_date + ", due_date="
				+ due_date + ", book_returned=" + book_returned + "]";
	}
}