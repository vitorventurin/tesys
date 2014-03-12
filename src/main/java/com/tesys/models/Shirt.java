package com.tesys.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tesys.enums.Arm;
import com.tesys.enums.Size;
import com.tesys.enums.Style;
import com.tesys.enums.Tissue;

@SuppressWarnings("serial")
@Entity
@Table(name="shirt")
public class Shirt implements Serializable {
	
	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	
	@Enumerated(EnumType.STRING)
	private Tissue tissue;
	
	@Enumerated(EnumType.STRING)
	private Size size;
	
	@Enumerated(EnumType.STRING)
	private Style style;
	
	private int year;
	
	private int logoCoordinateX;
	
	private int logoCoordinateY;
	
	private int logoSize;
	
	private String logoFileName;
	
	private String color;
	
//	@Enumerated(EnumType.STRING)
//	private Neck neck;
	
//	@Enumerated(EnumType.STRING)
//	private Arm arm;
	
	public Shirt() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Tissue getTissue() {
		return tissue;
	}

	public void setTissue(Tissue tissue) {
		this.tissue = tissue;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getLogoCoordinateX() {
		return logoCoordinateX;
	}

	public void setLogoCoordinateX(int logoCoordinateX) {
		this.logoCoordinateX = logoCoordinateX;
	}

	public int getLogoCoordinateY() {
		return logoCoordinateY;
	}

	public void setLogoCoordinateY(int logoCoordinateY) {
		this.logoCoordinateY = logoCoordinateY;
	}

	public int getLogoSize() {
		return logoSize;
	}

	public void setLogoSize(int logoSize) {
		this.logoSize = logoSize;
	}

//	public Neck getNeck() {
//		return neck;
//	}
//
//	public void setNeck(Neck neck) {
//		this.neck = neck;
//	}

//	public Arm getArm() {
//		return arm;
//	}
//
//	public void setArm(Arm arm) {
//		this.arm = arm;
//	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLogoFileName() {
		return logoFileName;
	}

	public void setLogoFileName(String logoFileName) {
		this.logoFileName = logoFileName;
	}
}