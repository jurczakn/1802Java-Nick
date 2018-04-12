package com.revature;

import org.springframework.cloud.openfeign.FeignClient;

import feign.RequestLine;

@FeignClient("helloservice")
public interface HelloClient {
	
	@RequestLine("GET")
	public String getHelloMessage();

}
