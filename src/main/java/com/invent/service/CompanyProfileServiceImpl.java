package com.invent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invent.dao.CompanyProfileDao;
import com.invent.models.CompanyProfileModel;

@Service
public class CompanyProfileServiceImpl implements CompanyProfileService {

	@Autowired
	private CompanyProfileDao companyProfileDao;
	
	@Override
	public List<CompanyProfileModel> getAllCompanyDetails() {

		return companyProfileDao.findAll();
	}

	@Override
	public void saveCompanyDetails(CompanyProfileModel companyProfile) {
		
		companyProfileDao.save(companyProfile);
	}


}
