package com.rameshsoft.spring.mysql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rameshsoft.spring.mysql.api.entity.Product;
import com.rameshsoft.spring.mysql.api.service.ProductService;

@RestController
public class ProductController {  //this controller talk with service call, for that we inject service in controller class
	
	@Autowired
	private ProductService service;
	
	//post API
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {  //input JSON parse into Product object
		return service.saveProduct(product);		
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {  
		return service.saveProducts(products);
	}
	//GET API
	//Fetch by using object
	@GetMapping("/products")  //products is a url
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	//Fetch by using Id
	@GetMapping("/productById/{id}")
	public Product findAllProductById(@PathVariable int id) {
		return service.getProduct(id);
	}
	//Fetch by using name
	@GetMapping("/product/{name}")
	public Product findAllProductByName(@PathVariable String name) {  //Any input pass has a part of request url then go for this @PathVariable
		return service.getProductByName(name);
	}
	
	//PUT API
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {  
		return service.updateProduct(product);		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteproduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	
	

}
