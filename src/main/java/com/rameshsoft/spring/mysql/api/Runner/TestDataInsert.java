/*package com.rameshsoft.spring.mysql.api.Runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rameshsoft.spring.mysql.api.entity.Product;
import com.rameshsoft.spring.mysql.api.repository.ProductRepository;

@Component
public class TestDataInsert implements CommandLineRunner{
	
	@Autowired
	private ProductRepository prepo;

	@Override
	public void run(String... args) throws Exception {	
		Product p1  = new Product(1,"PRAV",12,152.1);
		Product p2  = new Product(2,"RAM",15,152.1);
		Product p3  = new Product(3,"RAMESH",18,152.1);		
		prepo.saveAll(Arrays.asList(p1,p2,p3));
		
	
		
	}

}
*/
