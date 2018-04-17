package com.revature.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.revature.domain.Hotel;

public class HotelClient {
	
	public List<Hotel> findAll(){
		RestTemplate rest = new RestTemplate();
		ResponseEntity<Hotel[]> hotels = 
				rest.getForEntity("http://localhost/hotels", Hotel[].class);
		return Arrays.asList(hotels.getBody());
	}

}
