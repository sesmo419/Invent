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
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class ProductsModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="product_name")
	@NotNull
	private String productName;
	@Column(name="product_no")
	@NotNull
	private String productNo;
	@NotNull
	private int quantity;
	@OneToMany(mappedBy="product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<SaleProductsModel> saleProducts;
	public ProductsModel() {}
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public Set<SaleProductsModel> getSaleProducts() {
		return saleProducts;
	}
	public void setSaleProducts(Set<SaleProductsModel> saleProducts) {
		this.saleProducts = saleProducts;
	}
	
	

	
}
