package com.invent.requests;

public class ProductRequestModel {
	
	private String productName;
	private String ProductNo;
	private int quantity;
	private int unitPrice;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductNo() {
		return ProductNo;
	}
	public void setProductNo(String productNo) {
		ProductNo = productNo;
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
	
	
	

}
