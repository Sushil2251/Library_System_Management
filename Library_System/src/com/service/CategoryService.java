package com.service;

import java.util.List;

import com.model.BookReg;

public interface CategoryService {
	List<CategoryService> getAllCategorys();
	int addBook(BookReg category);

}