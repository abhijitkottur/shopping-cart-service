package com.abhijit.shoppingcartservice;

public class CartTotalResponse {
	
	private int total;

	public CartTotalResponse(int total) {
		super();
		this.total = total;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (total != other.total)
			return false;
		return true;
	}
	
}
