package com.revature.data;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{

}
