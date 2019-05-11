package com.invent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invent.models.CompanyProfileModel;
import com.invent.service.CompanyProfileService;

@RestController
@RequestMapping("/api/company-profile")
public class CompanyProfileController {
	
	@Autowired
	private CompanyProfileService companyProfileService;
	
	@GetMapping
	public List<CompanyProfileModel> getAllCompanyDetails() {

		return companyProfileService.getAllCompanyDetails();
	}

	@PostMapping
	public void saveCompanyDetails(@RequestBody CompanyProfileModel companyProfile) {
		
		companyProfileService.saveCompanyDetails(companyProfile);
	}

	

}
