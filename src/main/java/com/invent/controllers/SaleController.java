package com.invent.controllers;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.invent.models.SaleModel;
import com.invent.service.SaleService;

@RestController
@RequestMapping("/api/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@GetMapping("/")
	public List<SaleModel> getAllSales() {
		
		return saleService.getAllSales();
	}

	@GetMapping("/date")
	public List<SaleModel> getAllSalesByDate( @RequestParam("date")  @DateTimeFormat(pattern="dd-MM-yyyy") Date saleDate) {
		
		return saleService.getAllSalesByDate(saleDate);
	}
	
	@PostMapping("/new-sale")
	public void makeSale(@RequestBody SaleModel sale) {
		
		saleService.makeSale(sale);;
	}

	@GetMapping("/{id}")
	public SaleModel getSaleById(@PathVariable("id") Long id) {
		
		return saleService.getSaleById(id);
	}


}
