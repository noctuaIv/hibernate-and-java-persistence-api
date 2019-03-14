package com.infiniteskills.data.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK")
public class Stock extends Investment {
	
	@Column(name = "SHARE_PRICE")
	private BigDecimal sharePrice;

	@Column(name = "QUANTITY")
	private BigDecimal quantity;

	public BigDecimal getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(BigDecimal sharePrice) {
		this.sharePrice = sharePrice;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

}

