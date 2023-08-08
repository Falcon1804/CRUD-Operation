package com.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name ="abroad")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;

	@Column(name = "phNo")
	private long phNo;
	
	@Column(name = "desI")
	private String desI;
	
	public Employee() {
		
	}
	
	public Employee(int id,String firstName, String lastName, String emailId,long phNo,String desI) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phNo= phNo;
		this.desI=desI;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getphNo() {
		return phNo;
	}
	public void setphNo(long phNo ) {
		this.phNo = phNo;
	}
	public String getdesI() {
		return desI;
	}
	public void setdesI(String desI ) {
		this.desI = desI;
	}
}
