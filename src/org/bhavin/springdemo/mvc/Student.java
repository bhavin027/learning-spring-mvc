package org.bhavin.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favLanguage;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String[] operatingSystems;
	
	public Student() {
		
		// populate country options
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IN", "India");
		countryOptions.put("CA", "Canada");
		countryOptions.put("AU", "Australia");
		countryOptions.put("US", "United States Of America");
		countryOptions.put("Fr", "France");
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavLanguage() {
		return favLanguage;
	}
	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}
