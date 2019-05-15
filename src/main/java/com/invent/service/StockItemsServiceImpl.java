package com.invent.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

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
	public int increaseStockItemQuantity(Long id, int quantity,Date dateReceived) {
		
		return stockItemsDao.increaseStockItemQuantity(id, dateReceived,quantity);
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

	@Override
	public void updateStockItem(Long id,String stockItemName,int quantity,Date dateReceived) {
		
		stockItemsDao.updateStockItem(id,stockItemName, dateReceived, quantity);
	}

	@Override
	public StockItemsModel getStockItemById(Long id) {
		
		return stockItemsDao.getOne(id);
	}


	
	

}
  