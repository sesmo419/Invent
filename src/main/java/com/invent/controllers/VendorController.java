package com.invent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.invent.models.VendorModel;
import com.invent.service.VendorService;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {

	@Autowired
	private VendorService vendorService;
	
	@GetMapping("/")
	public List<VendorModel> getAllVendorsRecords() {
		
		return vendorService.getAllVendorsRecords();
	}

	@GetMapping("/name")
	public List<VendorModel> getVendorRecordByVendorName(@RequestParam("name") String vendorName) {
		
		return vendorService.getVendorRecordByVendorName(vendorName);
	}

	@GetMapping("/company")
	public List<VendorModel> getVendorRecordByVendorCompany(@RequestParam("company") String companyName) {
	
		return vendorService.getVendorRecordByVendorCompany(companyName);
	}

	@PostMapping("/save")
	public void addVendorRecord(@RequestBody VendorModel vendor) {
	
		vendorService.addVendorRecord(vendor);;
	}

	@DeleteMapping("/{id}")
	public void deleteVendorRecordById(@PathVariable Long id) {
		
		vendorService.deleteVendorRecordById(id);;
	}

	@PutMapping("/update")
	public void updateVendorRecord(@RequestBody VendorModel vendor) {
		
		vendorService.updateVendorRecord(vendor);
	}

}
