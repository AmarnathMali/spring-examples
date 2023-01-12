package com.hospital;

import java.util.List;
import java.util.Map;

public interface Hospital {
	

	public void insertInfo(int id,String patientName,String bloodGroup,String disease);
	 public void updateDetails(int id,String patientName,String bloodGroup,String disease);
	 public void deleteDetails(int id);
	 public List<HospitalP> getDetails();
     public HospitalP getEmpDetails(int id);

}
