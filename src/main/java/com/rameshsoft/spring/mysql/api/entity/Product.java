package com.rameshsoft.spring.mysql.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "PRODUCT_TBL") //PRODUCT_TBL, if you not give this JPA give Product has table name
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TABLE")


public class Product {  //Product is model/entity class
	@Id //Primary
//	@GeneratedValue  //given by HiberNet(i will get random number)
	@GeneratedValue(strategy = GenerationType.AUTO)//(sequence order)
	private Integer id;
	private String name;
	private int quantity;
	private double price;
	
}
