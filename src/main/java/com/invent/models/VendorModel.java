package com.invent.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="vendors")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class VendorModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="vendor_name")
	private String vendorName;
	private String address;
	@Column(name="vendor_company")
	private String vendorCompany;
	private String phone;
	@OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<StockItemsModel> stockItems;
	public VendorModel() {}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getVendorCompany() {
		return vendorCompany;
	}

	public void setVendorCompany(String vendorCompany) {
		this.vendorCompany = vendorCompany;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Set<StockItemsModel> getStockItems() {
		return stockItems;
	}
	public void setStockItems(Set<StockItemsModel> stockItems) {
		this.stockItems = stockItems;
	}
	
	
}
