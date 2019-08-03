package com.st.lms.controller;

import com.st.lms.dao.BorrowerDao;

public class BorrowerController {
	BorrowerDao borrower = new BorrowerDao();
	public boolean borrowerIdExistInBorrowerDatabase(int deleteBorrowerId) {
		return borrower.borrowerIdExistInBorrowerTable(deleteBorrowerId);
	}
	
	public boolean retrieveCardNumberExistInDataBase(int cardNumber) {
		return borrower.retrieve(cardNumber);
	}
	
	public void addBorrowerInBorrowerDataBase(int cardNumber, String borrowerName, String borrowerAddress,
			String borrowerPhone) {
		borrower.add(cardNumber, borrowerName, borrowerAddress, borrowerPhone);
	}
	
	public void deleteBorrowersFromBorrowerDatabase(int cardNumber) {
		borrower.remove(cardNumber);
	}
	
	public void UpdateBorrowerInBorrowerDataBase(int cardNumber, String borrowerName, String borrowerAddress,
			String borrowerPhone) {
		borrower.update(cardNumber, borrowerName, borrowerAddress, borrowerPhone);

	}
}
