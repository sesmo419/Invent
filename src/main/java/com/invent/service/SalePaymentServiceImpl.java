package com.invent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invent.dao.SalePaymentDao;
import com.invent.models.SalePaymentModel;

@Service
public class SalePaymentServiceImpl implements SalePaymentService{

	@Autowired
	private SalePaymentDao salePaymentDao;
	
	@Override
	public List<SalePaymentModel> getAllPaymentMethods() {
		
		return salePaymentDao.findAll();
	}

	@Override
	public SalePaymentModel makeSalePayment(SalePaymentModel salePayment, Long saleId) {
		
		return salePaymentDao.save(salePayment);
	}

	
	
}
