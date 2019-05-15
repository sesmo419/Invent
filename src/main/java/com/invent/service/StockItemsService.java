package com.invent.service;

import java.sql.Date;
import java.util.List;
import com.invent.models.StockItemsModel;

public interface StockItemsService {
	public List<StockItemsModel> getAllStockItems();
	public List<StockItemsModel> getAllStockItemsByVendorId(Long vendorId);
	public List<StockItemsModel> getAllStockItemsByVendorName(Long vendorName);
	public StockItemsModel getStockItemById(Long id);
	public void updateStockItem(Long id,String stockItemName,int quantity,Date dateReceived);
	public StockItemsModel addNewStockItem(StockItemsModel stockItem, Long vendorId);
	public int increaseStockItemQuantity(Long id,int quantity,Date dateReceived);
	public int decreaseStockItemQuantity(Long id,int quantity);
	public void deleteStockItemById(Long id);
}
