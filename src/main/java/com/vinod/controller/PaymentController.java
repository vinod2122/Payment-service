package com.vinod.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/payment-provider")
@RestController
public class PaymentController {
	@GetMapping("/payNow/{price}")
	public String payNow(@PathVariable int price)
	{
		return "payment with Rs. "+price+" is successfull";
	}

}
