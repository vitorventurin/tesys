package com.tesys.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="tesys_user")
public class User implements Serializable {
	@Id @GeneratedValue
	private Long id;
	
	@Column(nullable=false, unique=true, length=30)	//TODO fazer o validator
	private String userName;
	
	@Column(nullable=false, length=15) //TODO fazer o validator
	private String userPassword;
	
	@ManyToOne
	private Company company;
	
	public User() {}
	
	public User(String userName, String userPassword, Company company) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.company = company;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}