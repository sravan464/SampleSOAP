package com.rhpsoft.hibernate.core.beans;

public class Country {

	private String countryId;
	private String countryName;

	private Regions region;
	
	
	public Country() {
	
	}
	

	public Country(String countryId, String countryName) {

		this.countryId = countryId;
		this.countryName = countryName;
	}


	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public Regions getRegion() {
		return region;
	}


	public void setRegion(Regions region) {
		this.region = region;
	}

	

	/*
	 * public boolean equals(Object obj) { if (obj == null) return false; if
	 * (!this.getClass().equals(obj.getClass())) return false;
	 * 
	 * Country obj2 = (Country)obj; if((this.countryId == obj2.getCountryId())
	 * && (this.countryName.equals(obj2.getCountryName()))) { return true; }
	 * return false; } public int hashCode() { int tmp = 0; tmp = ( countryId +
	 * countryName).hashCode(); return tmp; }
	 */

}
