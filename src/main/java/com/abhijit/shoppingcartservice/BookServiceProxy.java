package com.abhijit.shoppingcartservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abhijit.shoppingcartservice.BookDto;

@FeignClient(name = "book-service", url = "localhost:8000")
public interface BookServiceProxy {

	@GetMapping(value = "/books/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public BookDto findById(@PathVariable String id);
	
}
