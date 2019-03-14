package com.infiniteskills.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "MARKET")
public class Market {

	@Column(name="MARKET_ID")
	private Long marketId;

	@Column(name="CURRENCY_NAME")
	private String currencyName;

	@Column(name="COUNTRY_NAME")
	private String countryName;

	@Column(name="MARKET_NAME")
	private String marketName;

	public Long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

}
