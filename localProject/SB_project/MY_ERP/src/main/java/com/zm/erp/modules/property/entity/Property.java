package com.zm.erp.modules.property.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 资产表
 */
@Entity
@Table(name = "property")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int propertyId;
	private String propertyName;
	private String model;
	private String bigtypeName;
	private String malltypeName;
	private int propertyNum;
	private double price;
	private double totalPrice;

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBigtypeName() {
		return bigtypeName;
	}

	public void setBigtypeName(String bigtypeName) {
		this.bigtypeName = bigtypeName;
	}

	public String getMalltypeName() {
		return malltypeName;
	}

	public void setMalltypeName(String malltypeName) {
		this.malltypeName = malltypeName;
	}

	public int getPropertyNum() {
		return propertyNum;
	}

	public void setPropertyNum(int propertyNum) {
		this.propertyNum = propertyNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
