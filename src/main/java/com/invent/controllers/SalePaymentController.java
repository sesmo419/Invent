package com.invent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invent.dao.SaleDao;
import com.invent.dao.SalePaymentDao;
import com.invent.exception.NotFoundException;
import com.invent.models.SalePaymentModel;
import com.invent.service.SalePaymentService;

@RestController
@RequestMapping("/api/sale-payments")
public class SalePaymentController {
	
	@Autowired
	private SalePaymentService salePaymentService;
	
	@Autowired
	private SalePaymentDao salePaymentDao;
	
	@Autowired
	private SaleDao saleDao;
	
	@GetMapping("/")
	public List<SalePaymentModel> getAllPaymentMethods() {
		
		return salePaymentService.getAllPaymentMethods();
	}
	
	@PostMapping("/{saleId}")
	public SalePaymentModel makeSalePayment(@RequestBody SalePaymentModel salePayment, @PathVariable Long saleId) {
		
		return saleDao.findById(saleId).map(sale->{
			salePayment.setSale(sale);
			return salePaymentDao.save(salePayment);
		}).orElseThrow(() -> new NotFoundException("Sale not found!"));
	}


}
