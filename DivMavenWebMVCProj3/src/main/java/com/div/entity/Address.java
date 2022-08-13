/**
 * 
 */
package com.div.entity;

import java.util.List;

/**
 * @author Admini
 *
 */
public class Address {
	
	private int id;
	
	private String city;
	
	private List<Employee> emps;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	

}
