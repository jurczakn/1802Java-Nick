package com.ex.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex.domain.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Integer>{
		
	public List<Home> findBySellPriceGreaterThan(Double price);

}
