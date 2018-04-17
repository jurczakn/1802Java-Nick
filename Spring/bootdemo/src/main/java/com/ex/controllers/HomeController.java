package com.ex.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.domain.Home;
import com.ex.repositories.HomeRepository;

@RestController
public class HomeController {
	
	@Autowired
	HomeRepository homeRepository;
	
	@RequestMapping("/")
	public String hello() {
		return "App Works!";
	}
	
	@PostMapping("/homes")
	public ResponseEntity<Home> addHome(@Valid @RequestBody Home home){
		home = homeRepository.save(home);
		return new ResponseEntity<Home>(home, HttpStatus.CREATED);
	}
	
	@GetMapping("/homes/{price}")
	public ResponseEntity<List<Home>> getHomesByPrice(@PathVariable Double price){
		List<Home> homes = homeRepository.findBySellPriceGreaterThan(price);
		return new ResponseEntity<List<Home>>(homes, HttpStatus.OK);
	}

}
