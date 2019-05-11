package com.invent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invent.models.CompanyProfileModel;

@Repository
public interface CompanyProfileDao extends JpaRepository<CompanyProfileModel, Long> {

}
