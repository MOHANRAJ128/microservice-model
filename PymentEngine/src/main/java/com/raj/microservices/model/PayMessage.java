package com.raj.microservices.model;

public class PayMessage {

	private Long id;
	private String msg;
	private String environment;
	
	
	public PayMessage() {
		super();
	}

	public PayMessage(Long id, String msg, String environment) {
		super();
		this.id = id;
		this.msg = msg;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
}
