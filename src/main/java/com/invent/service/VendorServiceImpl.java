package com.invent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invent.dao.VendorDao;
import com.invent.models.VendorModel;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDao vendorDao;
	
	@Override
	public List<VendorModel> getAllVendorsRecords() {
		
		return vendorDao.findAll();
	}

	@Override
	public List<VendorModel> getVendorRecordByVendorName(String vendorName) {
		
		return vendorDao.findVendorByVendorName(vendorName);
	}

	@Override
	public List<VendorModel> getVendorRecordByVendorCompany(String companyName) {
	
		return vendorDao.findVendorByVendorCompany(companyName);
	}

	@Override
	public void addVendorRecord(VendorModel vendor) {
	
		vendorDao.save(vendor);
	}

	@Override
	public void deleteVendorRecordById(Long id) {
		
		vendorDao.deleteById(id);
	}

	@Override
	public void updateVendorRecord(VendorModel vendor) {
		
		vendorDao.save(vendor);
	}

}
