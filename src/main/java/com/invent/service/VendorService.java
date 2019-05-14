package com.invent.service;

import java.util.List;
import java.util.Optional;

import com.invent.models.VendorModel;

public interface VendorService {
	
	public List<VendorModel> getAllVendorsRecords();
	public List<VendorModel> getVendorRecordByVendorName(String vendorName);
	public List<VendorModel> getVendorRecordByVendorCompany(String companyName);
	public Optional<VendorModel> getVendorRecordById(Long id);
	public void addVendorRecord(VendorModel vendor);
	public void deleteVendorRecordById(Long id);
	public void updateVendorRecord(VendorModel vendor,Long id);

}
