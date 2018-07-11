package com.abhijit.shoppingcartservice;

import java.util.List;

public interface CartService {
	
	CartTotalResponse calculateCartTotal(List<String> bookIds);
}
