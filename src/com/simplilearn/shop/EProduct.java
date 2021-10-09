package com.simplilearn.shop;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="eProduct")
public class EProduct {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "ID")
	private long ID;
	private String name;
	private BigDecimal price;
    @Column(name = "date_added")
	private Date dateadded;
	
	
	public EProduct() {
		super();
	}
	public EProduct(long ID, String name, BigDecimal price, Date dateadded) {
		super();
		this.ID = ID;
		this.name = name;
		this.price = price;
		this.dateadded = dateadded;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDateadded() {
		return dateadded;
	}
	public void setDateadded(Date dateadded) {
		this.dateadded = dateadded;
	}

}
