package com.jin2ml.adoptpet.model;

import java.util.List;


public class User {
	
	Integer id ;
	
	String name;
	
	char[] password;
	
	String telenumber;
	
	String address;
	
	List<Pet> pets;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getTelenumber() {
		return telenumber;
	}

	public void setTelenumber(String telenumber) {
		this.telenumber = telenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

}
