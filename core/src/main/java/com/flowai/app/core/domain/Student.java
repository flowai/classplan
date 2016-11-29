package com.flowai.app.core.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	private long iD;
	
	private String name;
	private String prename;
	
	private Date birthday;
	private String street;
	private int zipCode;
	private String city;
	
	/**
	 * @return the iD
	 */
    @Id
    @GeneratedValue
	public long getiD() {
		return iD;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setiD(long iD) {
		this.iD = iD;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the prename
	 */
	public String getPrename() {
		return prename;
	}
	/**
	 * @param prename the prename to set
	 */
	public void setPrename(String prename) {
		this.prename = prename;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	

}
