package com.invent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invent.dao.ProductsDao;
import com.invent.models.ProductsModel;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDao productsDao;
	
	@Override
	public List<ProductsModel> getAllProductsRecords() {
	
		return productsDao.findAll();
	}

	@Override
	public Optional<ProductsModel> getProductRecordById(Long id) {
		
		return productsDao.findById(id);
	}

	@Override
	public void deleteProductRecordById(Long id) {
		
		productsDao.deleteById(id);
	}

	@Override
	public void saveProductRecord(ProductsModel products) {
		
		productsDao.save(products);
	}

	@Override
	public int updateProductQuantity(Long id,int quantity) {
		
		return productsDao.increaseProductQuantity(id, quantity);
	}

}
