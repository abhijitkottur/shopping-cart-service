package com.abhijit.shoppingcartservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abhijit.shoppingcartservice.BookDto;

@RibbonClient(name = "book-service")
@FeignClient(name = "zuul-api-gateway")
public interface BookServiceProxy {

	@GetMapping(value = "/book-service/books/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public BookDto findById(@PathVariable String id);
	
}
