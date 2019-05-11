package com.invent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invent.dao.ProductsDao;
import com.invent.dao.SaleDao;
import com.invent.dao.SaleProductsDao;
import com.invent.exception.NotFoundException;
import com.invent.models.ProductsModel;
import com.invent.models.SaleProductsModel;

@Service
public class SaleProductsServiceImpl implements SaleProductsService {

	@Autowired
	private SaleProductsDao saleProductsDao;
	@Autowired
	private ProductsDao productDao;

	@Autowired
	private SaleDao saleDao;
	
	
	@Override
	public List<SaleProductsModel> getAllSaleProductsBySaleId(Long saleId) {
		
		return saleProductsDao.findSaleProductsBySaleId(saleId);
	}

	@Override
	public void deleteSaleProductById(Long id) {
		
		saleProductsDao.deleteById(id);
	}

	@Override
	public SaleProductsModel addSaleProduct(SaleProductsModel saleProducts, Long saleId) {
		ProductsModel productOnSale = productDao.findByProductNo(saleProducts.getProductNo());
		int newQuantity = productOnSale.getQuantity() - saleProducts.getQuantity();
		productOnSale.setQuantity(newQuantity);
		productDao.save(productOnSale);
		return saleDao.findById(saleId).map(sale->{
			saleProducts.setSale(sale);
			return saleProductsDao.save(saleProducts);
		}).orElseThrow(() -> new NotFoundException("Sale not found!"));		
	}

	

}
