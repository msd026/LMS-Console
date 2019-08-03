package com.st.lms.controller;

public class UIFunctions {
	
	static AuthorController AuthorControl = new AuthorController();
	static BorrowerController BorrowerControl = new BorrowerController();
	static BranchController BranchControl = new BranchController();
	static BookController BookControl = new BookController();
	static BookLoansController BookLoansControl = new BookLoansController();
	static PublisherController Publishers = new PublisherController();
	static BookCopiesController BookCopiesControl = new BookCopiesController();
	//static PrintFunctions Print= new PrintFunctions();
	
	public boolean libraryInputCheck(String inputString) {
		if (inputString.equals("Q")) {
			return false;
		} else if (!Library.isNumeric(inputString) || inputString == null) {
			System.out.println("Enter the right branch ID ");
			return false;
		}

		
		if (!BranchControl.retrievebranchIDFromLibraryDatabase(Integer.parseInt(inputString))) {
			System.out.println("Enter the right branch ID ");
			return false;
		}
		return true;
	}
	
	public boolean adminInputcheck(String selectTable) {
		if (selectTable.equals("Q")) {
			return false;
		}
		if (!Library.isNumeric(selectTable)) {
			System.out.println("Enter one of the options");
			return false;
		}
		return true;
	}
	
	public boolean newBookInputCheck(String bookIdInput) {
		if (!Library.isNumeric(bookIdInput)) {
			System.out.println("Enter a String in the title field");
			return false;
		}
		int bookId = Integer.parseInt(bookIdInput);
		if (BookController.retrieveBooksFromABookDatabase(bookId)) {
			System.out.println("This Book ID already exists");
			return false;
		}
		return true;
	}

	

}
