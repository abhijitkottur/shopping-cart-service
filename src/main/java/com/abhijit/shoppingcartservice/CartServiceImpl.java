package com.abhijit.shoppingcartservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private BookServiceProxy bookServiceProxy;
	
	@Override
	public CartTotalResponse calculateCartTotal(List<String> bookIds) {
		
		int total = 0;
		for (String id : bookIds) {
			total += bookServiceProxy.findById(String.valueOf(id)).getPrice();
		}
		
		return new CartTotalResponse(total);
	}

}
