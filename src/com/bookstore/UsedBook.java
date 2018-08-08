package com.bookstore;

public class UsedBook extends Book {

	private String condition;

	/**
	 * @param condition
	 */
	public UsedBook(String isbn, String author, String title, double price, String condition) {
		super(isbn, author, title, price);
		this.condition = condition;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Condition: " + condition;
	}

}
