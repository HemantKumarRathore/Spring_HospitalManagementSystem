package com.amdocsHMS.Data;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Patients")
public class Patient {
	private long id;
    private String name;
    private int age;
    private String sex;
    private Date dob;
    private String address;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(long id, String name, int age, String sex, Date dob, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.dob = dob;
		this.address = address;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id", nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "p_name", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "p_age", nullable = false)
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Column(name = "p_sex", nullable = false)
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Column(name = "p_dob", nullable = false)
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Column(name = "p_address", nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
