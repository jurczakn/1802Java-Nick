package com.revature.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.revature.client.HotelClient;

public class HotelAPITest {

	@Test
	public void test() {
		HotelClient client = new HotelClient();
		System.out.println(client.findAll());
		assertTrue(client.findAll().size()>0);
		}

}
