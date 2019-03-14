package com.infiniteskills.data.entities.ids;

import java.io.Serializable;


@SuppressWarnings("serial")
public class CurrencyId implements Serializable{

	private String name;

	private String countryName;

	public CurrencyId(){
		
	}
	
	public CurrencyId(String name, String countryName) {
		this.name = name;
		this.countryName = countryName;
	}

	public final String getName() {
		return name;
	}

	public final String getCountryName() {
		return countryName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrencyId other = (CurrencyId) obj;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
