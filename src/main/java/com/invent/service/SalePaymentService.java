package com.invent.service;

import java.util.List;

import com.invent.models.SalePaymentModel;

public interface SalePaymentService {
	public List<SalePaymentModel> getAllPaymentMethods();
	public SalePaymentModel makeSalePayment(SalePaymentModel salePayment, Long saleId);

}
