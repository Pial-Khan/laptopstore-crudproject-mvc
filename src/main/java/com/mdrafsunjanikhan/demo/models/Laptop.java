package com.mdrafsunjanikhan.demo.models;

public class Laptop {

	String id;
	String model_name;
	String brand_name;
	
	public Laptop() {
		
	}

	public Laptop(String id, String model_name, String brand_name) {
		this.id = id;
		this.model_name = model_name;
		this.brand_name = brand_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model_name=" + model_name + ", brand_name=" + brand_name + "]";
	}
	
	
	
}

