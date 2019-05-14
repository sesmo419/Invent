package com.invent.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.invent.models.StockItemsModel;

public interface StockItemsService {
	public List<StockItemsModel> getAllStockItems();
	public List<StockItemsModel> getAllStockItemsByVendorId(Long vendorId);
	public List<StockItemsModel> getAllStockItemsByVendorName(Long vendorName);
	public StockItemsModel addNewStockItem(StockItemsModel stockItem, Long vendorId);
	public int increaseStockItemQuantity(Long id,int quantity,Date dateReceived);
	public int decreaseStockItemQuantity(Long id,int quantity);
	public void deleteStockItemById(Long id);
}
