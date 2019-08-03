package com.st.lms.controller;

import com.st.lms.dao.BookDao;

public class BookController {

	public static boolean retrieveBooksFromABookDatabase(int newBook) {
		return BookDao.retrieve(newBook);
	}
	
	public static void addBooksToBookDataBase(int bookId, String title, int authId, int pubId) {
		BookDao.add(bookId, title, authId, pubId);
	}
	
	public static void deleteBooksFromBookDatabase(int deleteBookId) {
		BookDao.remove(deleteBookId);
	}
	
	public static void updateBooksFromBookDatabase(int iD, String title, int authorId, int publisherId) {
		BookDao.update(iD, title, authorId, publisherId);
	}
	
	public static void displayBooksFromDatabase() {
		BookDao.display();
	}
}
