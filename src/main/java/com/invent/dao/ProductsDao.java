package com.invent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.invent.models.ProductsModel;

@Repository
public interface ProductsDao extends JpaRepository<ProductsModel, Long> {
	
	@Transactional
	@Modifying(clearAutomatically=true)
	@Query("UPDATE ProductsModel products SET products.quantity=products.quantity+:quantity WHERE products.id=:id")
	public int increaseProductQuantity(@Param("id")Long id,
								@Param("quantity")int quantity);
	public ProductsModel findByProductNo(String productNo);



}
