package com.revature.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.data.HotelRepository;
import com.revature.domain.Hotel;

@RestController
public class HotelController {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@PostMapping("/hotels")
	public Hotel create(@Valid @RequestBody Hotel hotel) {
		return hotelRepository.save(hotel);
	}
	
	@GetMapping("/hotels")
	public Iterable<Hotel> findAll(){
		return hotelRepository.findAll();
	}
	
}
