package com.invent.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invent.models.ProductsModel;
import com.invent.service.ProductsService;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	@Autowired
	private ProductsService productsService;
	
	@GetMapping("")
	public List<ProductsModel> getAllProductsRecords() {
	
		return productsService.getAllProductsRecords();
	}

	@GetMapping("/{id}")
	public Optional<ProductsModel> getProductRecordById(@PathVariable Long id) {
		
		return productsService.getProductRecordById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteProductRecordById(@PathVariable Long id) {
		
		productsService.deleteProductRecordById(id);;
	}

	@PostMapping("/save")
	public void saveProductRecord(@RequestBody ProductsModel products) {
		
		productsService.saveProductRecord(products);;
	}
	
	@PutMapping("/{id}")
	public void updateProductRecord(ProductsModel products) {
			
		productsService.updateProductRecord(products);;	
		}
	
	@PutMapping("/{id}/quantity")
	public void updateProductQuantity(@PathVariable Long id,@Param("quantity")int quantity) {
		
		productsService.updateProductQuantity(id, quantity);
	}
}
