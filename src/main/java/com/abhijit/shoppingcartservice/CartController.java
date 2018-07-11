package com.abhijit.shoppingcartservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

	@Autowired
	private CartService cartService;
	
	@GetMapping(value = "/cart/total", produces = MediaType.APPLICATION_JSON_VALUE)
	public CartTotalResponse calculateCartTotal(@RequestParam List<String> bookIds) {
		return cartService.calculateCartTotal(bookIds);
	}
	
}
