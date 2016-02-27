package com.rhpsoft.hibernate.core.beans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Regions {
	
	private long regionId;
	private String regionName;
	
    private Country country ;

    
    private Set<Country> countrySet=new HashSet<Country>();
    
    /*		
     * 
    private List<Country> countryList=new ArrayList<Country>();
	private Country [] countryArray;
	private Map<String,Country> countryMap;
	*/
	
	public Set<Country> getCountrySet() {
		return countrySet;
	}

	public void setCountrySet(Set<Country> countrySet) {
		this.countrySet = countrySet;
	}

	public Regions() {
	
	}

	public long getRegionId() {
		return regionId;
	}

	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

    public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
 
	
}
