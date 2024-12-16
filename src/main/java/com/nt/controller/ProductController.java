package com.nt.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController 
public class ProductController {

	@GetMapping   
	public ResponseEntity<List<Product>> getAll(){
	return ResponseEntity.ok(List.of(new Product(1, "doll", 100),
			new Product(1, "saop", 200),
			new Product(1, "condom", 500)
			))	;
	}
	

	   
	static  class  Product{
	   private Integer id;
	   private String productName;
	   private Integer price;
	public Product(Integer id, String productName, Integer price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}
	   
	   
	}
}

