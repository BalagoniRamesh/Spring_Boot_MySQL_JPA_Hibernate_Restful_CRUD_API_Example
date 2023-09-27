package com.rameshsoft.spring.mysql.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rameshsoft.spring.mysql.api.entity.Product;
import com.rameshsoft.spring.mysql.api.repository.ProductRepository;

@Service
public class ProductService {  //ProductService talk to Repository
	
	
	@Autowired
	private ProductRepository repository;  //object
	
	//post method only single object 
	public Product saveProduct(Product product) { //this method will take has product object has argument and save it
		return	repository.save(product);
	}
	//post method only list of objects 
	public List<Product> saveProducts(List<Product> products) { //this method will take has product list of objects has argument and save it
		return	repository.saveAll(products);
	}
	//Get Product objects from database
	public List<Product> getProducts(){
		return repository.findAll();
	}
	//Get Product single object by using "id" from database
	public Product getProduct(int id){
		return repository.findById(id).orElse(null);  //return single object
	}
	//Get Product single object by using "name" from database
	public Product getProductByName(String name){
		return repository.findByName(name);  //findByName() this method created manually in repository 
	}
	//Delete Product
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product Removed !! "+id;		
	}
	//Update Product
	public Product updateProduct(Product product) {  //Product product called product object
		Product existingProduct = repository.findById(product.getId()).orElse(null);  //Here added lombok jar file,//get/Fetch Id from DB
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity()); //UPDATE
		return repository.save(existingProduct); //Save in Product object
	}
	


}
