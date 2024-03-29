package com.invent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {
	
	@GetMapping("/home")
	public String showHome() {

		return "index";
	}
	@GetMapping("/company")
	public String showCompanyInfo() {

		return "companyinfo";
	}
	@GetMapping("/manage-users")
	public String manageUser() {

		return "manage-users";
	}
	@GetMapping("/add-product")
	public String addProduct() {

		return "add-product";
	}
	@GetMapping("/manage-products")
	public String manageProducts() {

		return "manage-products";
	}
	@GetMapping("sales")
	public String newSale() {

		return "sales";
	}
	@GetMapping("/manage-vendors")
	public String manageVendors() {

		return "manage-vendors";
	}
	@GetMapping("/create-invoice")
	public String createInvoice() {

		return "create-invoice";
	}
	@GetMapping("/manage-invoices")
	public String manageInvoice() {

		return "manage-invoices";
	}
	@GetMapping("add-stock")
	public String addStock() {

		return "add-stock";
	}
	@GetMapping("manage-stock")
	public String manageStock() {

		return "manage-stock";
	}
	@GetMapping("reports")
	public String getReports() {

		return "reports";
	}
	
}
