package com.spring.dao;

import java.util.List;

import com.spring.model.Patient;

public interface PatientDao {

	   public void saveOrUpdate(Patient patient);
	   public void delete(int id);
	   public Patient get(int id);
	   public List<Patient> list();	
	
}
