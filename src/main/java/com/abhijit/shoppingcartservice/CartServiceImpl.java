package com.abhijit.shoppingcartservice;

import java.util.ArrayList;
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
		List<BookDto> books = new ArrayList<>();
		for (String id : bookIds) {
			BookDto dto = bookServiceProxy.findById(String.valueOf(id));
			books.add(dto);
			total += dto.getPrice();
		}
		
		CartTotalResponse response = new CartTotalResponse();
		response.setTotal(total);
		response.setBooks(books);
		
		return response;
	}

}
