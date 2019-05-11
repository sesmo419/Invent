package com.invent.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invent.dao.SaleDao;
import com.invent.models.SaleModel;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleDao saleDao;
	
	@Override
	public List<SaleModel> getAllSales() {
		
		return saleDao.findAll();
	}

	@Override
	public List<SaleModel> getAllSalesByDate(Date sale_date) {
		
		return saleDao.findSaleBySaleDate(sale_date);
	}

	@Override
	public SaleModel getSaleById(Long id) {
		
		return saleDao.getOne(id);
	}

	@Override
	public void makeSale(SaleModel sale) {
		
		saleDao.save(sale);
	}

}
