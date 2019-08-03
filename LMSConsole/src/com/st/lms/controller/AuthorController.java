package com.st.lms.controller;

import com.st.lms.dao.AuthorDao;

public class AuthorController {
	
	AuthorDao authordao = new AuthorDao();
	
	public boolean retrieveAuthorsFromAuthorDatabase(int author) {
		return this.authordao.retrieve(author);
	}
	
	public void addAuthorToAuthorDatabase(int authorId, String authorName) {
		authordao.add(authorId, authorName);
	}
	
	public  void deleteAuthorFromAuthorDatabase(int deleteAuthorId) {
		authordao.remove(deleteAuthorId);
	}
	
	public void UpdateAuthorFromAuthorDatabase(int authID, String authorName) {
		authordao.update(authID, authorName);
	}
	public void displayAuthorsFromDatabase() {
		authordao.display();
	}
}
