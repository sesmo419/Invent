package com.invent.service;

import java.util.List;
import java.util.Optional;

import com.invent.models.ProductsModel;

public interface ProductsService {
	
	public List<ProductsModel> getAllProductsRecords();
	public Optional<ProductsModel> getProductRecordById(Long id);
	public void deleteProductRecordById(Long id);
	public void saveProductRecord(ProductsModel products);
	public void updateProductRecord(ProductsModel products);
	public int updateProductQuantity(Long id,int quantity);



}
