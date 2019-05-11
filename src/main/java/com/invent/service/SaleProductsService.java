package com.invent.service;

import java.util.List;

import com.invent.models.SaleProductsModel;

public interface SaleProductsService {
	
	public List<SaleProductsModel> getAllSaleProductsBySaleId(Long saleId);
	public void deleteSaleProductById(Long id);
	public SaleProductsModel addSaleProduct(SaleProductsModel saleProducts, Long saleId);

}
