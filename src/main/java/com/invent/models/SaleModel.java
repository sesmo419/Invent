package com.invent.models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="sales")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class SaleModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sale_no")
	private long saleNo;
	@Temporal(TemporalType.DATE)
	@Column(name="sale_date", columnDefinition="DATETIME")
	private Date saleDate;
	private String customer;
	@OneToMany(mappedBy = "sale", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<SaleProductsModel> saleItems;
	@OneToMany(mappedBy = "sale", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<SalePaymentModel> salePayment;
	public SaleModel() {}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSaleNo() {
		return saleNo;
	}
	public void setSaleNo(long saleNo) {
		this.saleNo = saleNo;
	}
	
	public Date getSaleDate() {
		return saleDate;
	}


	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}


	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Set<SaleProductsModel> getSaleItems() {
		return saleItems;
	}
	public void setSaleItems(Set<SaleProductsModel> saleItems) {
		this.saleItems = saleItems;
	}
	public Set<SalePaymentModel> getSalePayment() {
		return salePayment;
	}
	public void setSalePayment(Set<SalePaymentModel> salePayment) {
		this.salePayment = salePayment;
	}
	
	

	
}
