package com.api.sportyShoes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@ToString
public class PurchaseReport {
	
	

	public PurchaseReport(int id, String purchasedBy, String category, Date dop, String orderList) {
		super();
		this.id = id;
		this.purchasedBy = purchasedBy;
		this.category = category;
		this.dop = dop;
		this.orderList = orderList;
	}

	@Id
	@GeneratedValue
	private int id;
	private String purchasedBy; // This can be extended to utilize one to one relation with User Table [Future Implemetations]
	private String category;
	
	@Temporal(TemporalType.DATE)
	private Date dop;
	
@Override
	public String toString() {
		return "PurchaseReport [id=" + id + ", purchasedBy=" + purchasedBy + ", category=" + category + ", dop=" + dop
				+ ", orderList=" + orderList + "]";
	}


public PurchaseReport() {
	super();
	// TODO Auto-generated constructor stub
}


public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPurchasedBy() {
		return purchasedBy;
	}

	public void setPurchasedBy(String purchasedBy) {
		this.purchasedBy = purchasedBy;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	public String getOrderList() {
		return orderList;
	}

	public void setOrderList(String orderList) {
		this.orderList = orderList;
	}

/**
 * This can be used for storing orderlist as <Qty, Shoe>
 * Here implementation is made simple by using shoeId instead
 * of shoe in string format.
 */
//	@ManyToMany(cascade = CascadeType.ALL)
//	Map<Integer,Shoe> orderList = new HashMap<Integer,Shoe>();
//								OR
//	Map<Integer,Integer> orderList = new HashMap<Integer,Integer>();
	
	String orderList;




}


	

