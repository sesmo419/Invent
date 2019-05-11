package com.invent.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.invent.models.VendorModel;
@Repository
public interface VendorDao extends JpaRepository<VendorModel, Long> {
	@Query(value="SELECT * FROM vendors WHERE vendors.vendor_name>=?1 AND vendors.vendor_name<=?1",nativeQuery=true)
	public List<VendorModel> findVendorByVendorName(@Param("name") String name);
	@Query(value="SELECT * FROM vendors WHERE vendors.vendor_company>=?1 AND vendors.vendor_company<=?1",nativeQuery=true)
	public List<VendorModel> findVendorByVendorCompany(@Param("company") String company);

}
