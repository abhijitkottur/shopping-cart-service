package com.abhijit.shoppingcartservice;

import java.util.List;

public class CartTotalResponse {
	
	private int total;

	private List<BookDto> books;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<BookDto> getBooks() {
		return books;
	}

	public void setBooks(List<BookDto> books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + total;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartTotalResponse other = (CartTotalResponse) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (total != other.total)
			return false;
		return true;
	}
	
}
