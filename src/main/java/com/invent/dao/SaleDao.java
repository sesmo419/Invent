package com.invent.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.invent.models.SaleModel;
@Repository
public interface SaleDao extends JpaRepository<SaleModel, Long> {
	@Query(value="SELECT * FROM sales WHERE sales.sale_date>=?1", nativeQuery=true)
	public List<SaleModel> findSaleBySaleDate(@Param ("date") Date sale_date);
//	@Query("UPDATE ItemsModel items SET items.quantity=(items.quantity-(SELECT sales.quantity FROM SaleModel sales WHERE sales.SALEID=")
//	public void makeSale(SaleModel sale);

}
