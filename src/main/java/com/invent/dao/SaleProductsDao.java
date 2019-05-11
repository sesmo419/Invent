package com.invent.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invent.models.SaleProductsModel;
@Repository
public interface SaleProductsDao extends JpaRepository<SaleProductsModel, Long> {

	public List<SaleProductsModel> findSaleProductsBySaleId(long saleId);
	public List<SaleProductsModel> findProductsByProductNo(long productNo);
	public List<SaleProductsModel> findSaleProductsByProductNo(String productNo);

}
