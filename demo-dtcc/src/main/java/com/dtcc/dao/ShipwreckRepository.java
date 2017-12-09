package com.dtcc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dtcc.model.Shipwreck;

@Repository
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{
	
}
