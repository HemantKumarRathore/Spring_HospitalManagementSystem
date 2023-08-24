package com.amdocsHMS.Data;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor {
	private long doctorId;
	private String name;
	private String quali;
	private long pid;
	private Date date;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Doctor(long d_id, String name, String quali, long pid, Date date) {
		super();
		this.doctorId = d_id;
		this.name = name;
		this.quali = quali;
		this.pid = pid;
		this.date = date;
	}


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "d_id", nullable = false)
	public long getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	
	
	@Column(name = "d_name", nullable = false)
	public String getName() {
		return name;
	}
	


	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "d_quali", nullable = false)
	public String getQuali() {
		return quali;
	}
	public void setQuali(String quali) {
		this.quali = quali;
	}
	
	@Column(name = "d_dob", nullable = false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name = "p_id", nullable = false)
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	
}
