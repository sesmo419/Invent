package com.invent.dao;

import java.util.Date;
import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.invent.models.StockItemsModel;
@Repository
public interface StockItemsDao extends JpaRepository<StockItemsModel, Long> {
	public List<StockItemsModel> findStockItemsByVendorId(Long vendorId);
	public List<StockItemsModel> findStockItemsByStockItemName(String stockItemName);
	public List<StockItemsModel> findStockItemsByVendorVendorName(Long vendorName);
	@Transactional
	@Modifying(clearAutomatically=true)
	@Query("UPDATE StockItemsModel stock_items SET stock_items.quantity=stock_items.quantity+:quantity,stock_items.dateReceived=:dateReceived WHERE stock_items.id=:id")
	public int increaseStockItemQuantity(@Param("id")Long id,@Param("dateReceived")Date dateReceived,
								@Param("quantity")int quantity);
	@Transactional
	@Modifying(clearAutomatically=true)
	@Query("UPDATE StockItemsModel stock_items SET stock_items.quantity=stock_items.quantity-:quantity WHERE stock_items.id=:id")
	public int decreaseStockItemQuantity(@Param("id")Long id,
								@Param("quantity")int quantity);
//	@Transactional
//	@Modifying(clearAutomatically=true)
//	@Query("UPDATE StockItemsModel stock_items SET stock_items.dateReceived=stock_items.dateReceived WHERE stock_items.id=:id")
//	public void updateStockLastDateReceived(@Param("id")Long id,
//								@Param("dateReceived")Date dateReceived);

}
