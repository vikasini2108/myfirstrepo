package com.dev;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	@Id
 private int P_id;
	@Column    //to change column   @Column(name="Name")
	private String P_Name;
	 private int Qty;
 public int getP_id() {
	return P_id;
}
public void setP_id(int p_id) {
	P_id = p_id;
}
public String getP_Name() {
	return P_Name;
}
public void setP_Name(String p_Name) {
	P_Name = p_Name;
}
public int getQty() {
	return Qty;
}
public void setQty(int qty) {
	Qty = qty;
}

}
