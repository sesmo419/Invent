package com.invent.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invent.models.SalePaymentModel;
@Repository
public interface SalePaymentDao extends JpaRepository<SalePaymentModel, Long> {
	public List<SalePaymentModel> findSaleBySaleId(Long saleId);

}
