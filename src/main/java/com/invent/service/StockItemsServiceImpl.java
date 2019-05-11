package com.invent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invent.dao.StockItemsDao;
import com.invent.models.StockItemsModel;

@Service
public class StockItemsServiceImpl implements StockItemsService {

	@Autowired
	private StockItemsDao stockItemsDao;
	
	@Override
	public List<StockItemsModel> getAllStockItems() {
		
		return stockItemsDao.findAll();
	}

	@Override
	public List<StockItemsModel> getAllStockItemsByVendorId(Long vendorId) {
		
		return stockItemsDao.findStockItemsByVendorId(vendorId);
	}

	@Override
	public StockItemsModel addNewStockItem(StockItemsModel stockItem, Long vendorId) {
		
		return stockItemsDao.save(stockItem);
	}

	@Override
	public int increaseStockItemQuantity(Long id, int quantity) {
		
		return stockItemsDao.increaseStockItemQuantity(id, quantity);
	}

	@Override
	public int decreaseStockItemQuantity(Long id, int quantity) {
		
		return stockItemsDao.decreaseStockItemQuantity(id, quantity);
	}
	
	@Override
	public void deleteStockItemById(Long id) {
		
		stockItemsDao.deleteById(id);
	}

	@Override
	public List<StockItemsModel> getAllStockItemsByVendorName(Long vendorName) {
		
		return stockItemsDao.findStockItemsByVendorVendorName(vendorName);
	}

	

	
	
	

}
  