package com.cg.springcoredemo.dto;

import org.springframework.stereotype.Component;

@Component("prod")
public class Product {
	
	private Integer prodId;
	private String prodName;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Integer prodId, String prodName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + "]";
	}
	
	
	
	

}
