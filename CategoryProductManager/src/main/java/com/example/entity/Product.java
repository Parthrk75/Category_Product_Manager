package com.example.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private double price;

	private int quantity; 
	private String description; 

	@ManyToOne
	@JoinColumn(name = "category_id")
	@JsonIgnore
	private Category category;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, double price, int quantity, String description, Category category) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", description="
				+ description + ", category=" + category + "]";
	}

	
}
