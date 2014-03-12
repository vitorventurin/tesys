package com.tesys.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Company implements Serializable{
	@Id
	@GeneratedValue
	@Column(name = "company_id")
	private Long id;

	@Column(unique = true)
	private String name;
	private String address;
	private String phone;
	private String email;
	private String email2;

	public Company() {
	}

	public Company(String name, String address, String phone, String email,
			String email2) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.email2 = email2;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Company)) {
			return false;
		} else {
			if (((Company) obj).name.equals(this.name)) {
				return true;
			} else {
				return false;
			}
		}
	}

	/*@Override
	public int hashCode() {
		return this.name.hashCode();
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}
}