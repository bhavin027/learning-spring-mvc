package org.bhavin.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.bhavin.springdemo.mvc.validation.CourseCode;

public class Student {
	
	@NotNull(message="is required")
	@Size(min=3, message="First Name should have atleast 3 characters")
	private String firstName;
	private String lastName;
	private String country;
	private String favLanguage;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String[] operatingSystems;
	
	@NotNull(message="is required")
	@Min(value=1, message="must be greater than or equal to 1")
	@Max(value=6, message="must be less than or equal to 6")
	private Integer studyYears;
	
	@Pattern(regexp="^[a-zA-Z0-9]{6}", message="only 6 characters/digits")
	private String postalCode;
	
	@NotNull(message="is required")
	@CourseCode(value="ENG", message="must start with ENG")
	private String courseCode;
	
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

	public Integer getStudyYears() {
		return studyYears;
	}
	public void setStudyYears(Integer studyYears) {
		this.studyYears = studyYears;
	}

	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
