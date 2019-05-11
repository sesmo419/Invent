package com.invent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.invent.dao.StockItemsDao;
import com.invent.dao.VendorDao;
import com.invent.exception.NotFoundException;
import com.invent.models.StockItemsModel;
import com.invent.service.StockItemsService;

@RestController
@RequestMapping("/api/stock-items")
public class StockItemsController {

	@Autowired
	private StockItemsService stockItemsService;
	
	@Autowired
	private StockItemsDao stockItemsDao;
	
	@Autowired
	private VendorDao vendorDao;
	
	@GetMapping("/")
	public List<StockItemsModel> getAllStockItems() {
		
		return stockItemsService.getAllStockItems();
	}

	@GetMapping("/{vendorId}")
	public List<StockItemsModel> getAllStockItemsByVendorId(@PathVariable Long vendorId) {
		
		return stockItemsService.getAllStockItemsByVendorId(vendorId);
	}
	
	@GetMapping("/vendor-name")
	public List<StockItemsModel> getAllStockItemsByVendorName(@RequestParam Long vendorName) {
		
		return stockItemsService.getAllStockItemsByVendorName(vendorName);
	}
	
	@PostMapping("/{vendorId}")
	public StockItemsModel addNewStockItem(@RequestBody StockItemsModel stockItem, @PathVariable Long vendorId) {

		return vendorDao.findById(vendorId).map(vendor->{
			stockItem.setVendor(vendor);
			return stockItemsDao.save(stockItem);
		}).orElseThrow(() -> new NotFoundException("Vendor not found!"));
		
	}

	@PutMapping("/{id}/stock-in")
	public int increaseStockItemQuantity(@PathVariable Long id, @Param("quantity") int quantity) {
			
			return stockItemsDao.increaseStockItemQuantity(id, quantity);
	}
	@PutMapping("/{id}/stock-out")
	public int decreaseStockItemQuantity(@PathVariable Long id, @Param("quantity") int quantity) {
			
			return stockItemsDao.decreaseStockItemQuantity(id, quantity);
		}
	@DeleteMapping("/{id}")
	public void deleteStockItemById(@PathVariable Long id) {
		
		stockItemsService.deleteStockItemById(id);
	}
	
}
