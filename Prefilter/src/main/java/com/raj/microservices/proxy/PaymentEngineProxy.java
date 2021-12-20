package com.raj.microservices.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.raj.microservices.model.PreMessage;

@FeignClient(name="payment-engine")
public interface PaymentEngineProxy {

	@GetMapping("/getMessageDetails")
	public PreMessage retreivePayMessage();
}
