package com.java.products;

import jakarta.persistence.*;

@Entity
public class Product {

	@Id
	private int id;

	private String name;

	private String type;

	private String category;

	private double price;

	private double discount;

	private double gst;

	private double deliverycharge;

	public Product() {
	}

	public Product(int id, String name, String type, String category, double price, double discount, double gst,
			double deliverycharge) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.category = category;
		this.price = price;
		this.discount = discount;
		this.gst = gst;
		this.deliverycharge = deliverycharge;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		this.discount = price * discount / 100;
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getGst() {
		this.gst = (price - this.discount) * gst / 100;
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public double getDeliverycharge() {
		return deliverycharge;
	}

	public void setDeliverycharge(double deliverycharge) {
		this.deliverycharge = deliverycharge;
	}

	public double getFinalPrice() {

		return price + gst + deliverycharge - discount;
	}

}
