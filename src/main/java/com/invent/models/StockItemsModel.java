package com.invent.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="stock_items")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class StockItemsModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="stock_item_name")
	private String stockItemName;
	private int quantity;
	@Temporal(TemporalType.DATE)
	@Column(name="date_received", columnDefinition="DATETIME")
	private Date dateReceived;
	@ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "vendor_id")
	@JsonIgnore
	private VendorModel vendor;
	public StockItemsModel() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStockItemName() {
		return stockItemName;
	}
	public void setStockItemName(String stockItemName) {
		this.stockItemName = stockItemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}
	public VendorModel getVendor() {
		return vendor;
	}
	public void setVendor(VendorModel vendor) {
		this.vendor = vendor;
	}
	

}
