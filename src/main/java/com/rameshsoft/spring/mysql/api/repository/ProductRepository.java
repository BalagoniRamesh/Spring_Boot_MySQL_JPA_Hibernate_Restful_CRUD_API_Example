package com.rameshsoft.spring.mysql.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rameshsoft.spring.mysql.api.entity.Product;
//Entity of CorrespondingRepository

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{ //<ModelName, Specify data type of primary key>

	Product findByName(String name);  

}
