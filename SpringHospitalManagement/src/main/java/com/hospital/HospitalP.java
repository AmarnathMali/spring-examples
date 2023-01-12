package com.hospital;


public class HospitalP {

	
	private int id;
	private String patientName;
	private String bloodGroup;
	private String disease;
	
	
	
	public HospitalP() {
		super();
	}
	
	
	public HospitalP(String patientName, String bloodGroup, String disease) {
		super();
		this.patientName = patientName;
		this.bloodGroup = bloodGroup;
		this.disease = disease;
	}

	

	public HospitalP(int id, String patientName, String bloodGroup, String disease) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.bloodGroup = bloodGroup;
		this.disease = disease;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	
}
