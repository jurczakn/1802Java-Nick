package com.soap.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.soap.client.SOAPConsumer;

public class SOAPTest {

	@Test
	public void test() {
		String str = new SOAPConsumer().callRespond("hay");
		System.out.println(str);
		assertNotNull(str);
	
	}

}
