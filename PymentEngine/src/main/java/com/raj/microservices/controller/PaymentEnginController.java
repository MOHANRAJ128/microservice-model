package com.raj.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.microservices.model.PayMessage;

@RestController
public class PaymentEnginController {

	@Autowired
	private Environment env;
	
	
	@GetMapping("/getMessageDetails")
	public PayMessage retreivePayMessage()
	{
		return new PayMessage(100L,"Hi Mohan",env.getProperty("local.server.port"));
	}
}
