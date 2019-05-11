package com.invent.service;

import java.util.Date;
import java.util.List;
import com.invent.models.SaleModel;

public interface SaleService {
	
	public List<SaleModel> getAllSales();
	public List<SaleModel> getAllSalesByDate(Date sale_date);
	public void makeSale(SaleModel sale);
	public SaleModel getSaleById(Long id);

}
