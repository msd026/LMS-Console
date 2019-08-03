package com.st.lms.controller;

public class PrintFunctions {

	static AuthorController AuthorControl = new AuthorController();
	static BorrowerController BorrowerControl = new BorrowerController();
	static BranchController BranchControl = new BranchController();
	static BookController BookControl = new BookController();
	static BookLoansController BookLoansControl = new BookLoansController();
	static PublisherController Publishers = new PublisherController();
	static BookCopiesController BookCopiesControl = new BookCopiesController();
	static PrintFunctions Print= new PrintFunctions();
	
	public void userCategorySelection() {
		System.out.println("Welcome to GCIT Library Management System. Which category of user are you?");
		System.out.println("1) Librarian");
		System.out.println("2) Administrator");
		System.out.println("3) Borrower");
	}
	
	public void libraryList() {
		System.out.println("Select one of these libraries");
		System.out.println("Q) to previous");
		BranchControl.displayLibraryBranchesFromDatabase();
	}
	
	public void printLibraryOptions() {
		System.out.println("1) Update details of the library");
		System.out.println("2) Add copies of book in the branch ");
		System.out.println("Q) Quit to previous");
	}
	
	public void printAUDQ() {
		System.out.println("Choose of of the following functions");
		System.out.println("1) Add");
		System.out.println("2) Update");
		System.out.println("3) Delete");
		System.out.println("Q) to previous");
	}
	
	public void adminSelections() {
		System.out.println("Choose one of the followings table");
		System.out.println("1) Book");
		System.out.println("2) Author");
		System.out.println("3) publisher");
		System.out.println("4) Library Branch");
		System.out.println("5) Borrower");
		System.out.println("6) due date");
		System.out.println("Q) to previous");

	}
	
	public void borrowerOptions() {
		System.out.println("Choose one of these options");
		System.out.println("1) Check out a book");
		System.out.println("2) return a book");
		System.out.println("3) return to previous");
	}
}
