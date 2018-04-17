package com.soap.endpoint;

import javax.jws.WebService;

@WebService(endpointInterface="com.soap.endpoint.Endpoint")
public class EndpointImpl implements Endpoint{

	@Override
	public String function(String text) {
		return "HELLO WE ARE IN OUR SOAP SERVICE METHOD PRINTING " + text;
	}

}
