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
@Table(name="sale_products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class SaleProductsModel implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_no")
	private String productNo;
	private int quantity;
	@Column(name="unit_price")
	private int unitPrice;
	@ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "sale_id")
	@JsonIgnore
	private SaleModel sale;
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "product_id")
	@JsonIgnore
	private ProductsModel product;
	public SaleProductsModel() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public SaleModel getSale() {
		return sale;
	}
	public void setSale(SaleModel sale) {
		this.sale = sale;
	}
	
	public ProductsModel getProduct() {
		return product;
	}
	public void setProduct(ProductsModel product) {
		this.product = product;
	}
	
	


}
