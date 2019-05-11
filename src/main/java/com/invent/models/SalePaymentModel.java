package com.invent.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="sale_payments")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class SalePaymentModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="payment_mode")
	private String paymentMode;
	private int amount;
	@ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "sale_id")
	@JsonIgnore
	private SaleModel sale;
	public SalePaymentModel() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public SaleModel getSale() {
		return sale;
	}
	public void setSale(SaleModel sale) {
		this.sale = sale;
	}
	
	

}
