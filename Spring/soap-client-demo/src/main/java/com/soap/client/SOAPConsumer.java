package com.soap.client;

import com.soap.endpoint.End;
import com.soap.endpoint.EndImplService;

public class SOAPConsumer {
	
	public String callRespond(String str) {
		End end = new EndImplService().getEndImplPort(); //get port from wsdl
		return end.respond(str);
		
	}

	

}
