package com.invent.service;

import java.util.List;

import com.invent.models.CompanyProfileModel;

public interface CompanyProfileService {
	public List<CompanyProfileModel> getAllCompanyDetails();
	public void saveCompanyDetails(CompanyProfileModel companyProfile);



}
