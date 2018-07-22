package com.abhijit.shoppingcartservice;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

	private static final Logger log = LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	private CartService cartService;
	
	@GetMapping(value = "/cart/total", produces = MediaType.APPLICATION_JSON_VALUE)
	public CartTotalResponse calculateCartTotal(@RequestParam List<String> bookIds) {
		log.info("Cart requested with books {}", StringUtils.join(bookIds, ","));
		return cartService.calculateCartTotal(bookIds);
	}
	
}
