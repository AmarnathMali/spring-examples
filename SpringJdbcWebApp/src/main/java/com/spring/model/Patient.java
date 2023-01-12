package com.spring.model;

public class Patient {

	private int id;
	private String patientname;
	private String bloodgroup;
	private String disease;
	
	public Patient() {
		super();
	}

	public Patient(String patientname, String bloodgroup, String disease) {
		super();
		this.patientname = patientname;
		this.bloodgroup = bloodgroup;
		this.disease = disease;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	
}
