package com.example.SpringOnetoOneUni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringOnetoOneUni.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{
	
	

}
