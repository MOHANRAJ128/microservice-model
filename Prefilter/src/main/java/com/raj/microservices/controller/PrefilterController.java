package com.raj.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.raj.microservices.model.PreMessage;
import com.raj.microservices.proxy.PaymentEngineProxy;

@RestController
public class PrefilterController {

	@Autowired
	private PaymentEngineProxy proxy;
	
	@GetMapping("/getMessage")
	public PreMessage retriveMessage()
	{
		ResponseEntity<PreMessage> entityObj= new RestTemplate().getForEntity("http://localhost:9000/getMessageDetails", PreMessage.class); 
//		return new PreMessage(100L,"Hi Mohan","");
		
		PreMessage preMessage = entityObj.getBody();
		preMessage.setEnvironment(preMessage.getEnvironment()+" from rest template");;
		return preMessage;
	}
	
	@GetMapping("/feign/getMessage")
	public PreMessage retriveMessageByProxy()
	{
		PreMessage preMessage = proxy.retreivePayMessage();
		preMessage.setEnvironment(preMessage.getEnvironment()+" from feign proxy");
		return preMessage;
	}
}
