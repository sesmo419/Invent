package com.invent.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invent.models.SaleProductsModel;
import com.invent.service.SaleProductsService;

@RestController
@RequestMapping("/api/sale-products")
public class SaleProductsController {
	
	@Autowired
	private SaleProductsService saleProductsService;
	
	
//	@Autowired
//	private ProductsService productsService;
	
	
	@GetMapping("/{saleId}")
	public List<SaleProductsModel> getAllSaleProductsBySaleId(@PathVariable Long saleId) {
		
		return saleProductsService.getAllSaleProductsBySaleId(saleId);
	}

	@DeleteMapping("/{id}")
	public void deleteSaleProductById(@PathVariable Long id) {
		
		saleProductsService.deleteSaleProductById(id);;
	}
	
	@PostMapping("/{saleId}")
	public SaleProductsModel addSaleProduct(@RequestBody SaleProductsModel saleProducts, @PathVariable Long saleId) {
	
		
			return saleProductsService.addSaleProduct(saleProducts, saleId);
		
		
	}
	
	
}
