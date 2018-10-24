package io.pivotal.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
	
	@JsonProperty("firstname")
	private String first;
	@JsonProperty("lastname")
	private String last;
	@JsonProperty("email")
	private String email;
	@JsonIgnore
	private List<Address> addresses;
	@JsonIgnore
	private String password;
	
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public String getEmail() {
		return email;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public String getPassword() {
		return password;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee()
	{
		
	}
	public Employee(String first, String last, String email, List<Address> addresses, String password) {
		super();
		this.first = first;
		this.last = last;
		this.email = email;
		this.addresses = addresses;
		this.password = password;
	}
	

}
