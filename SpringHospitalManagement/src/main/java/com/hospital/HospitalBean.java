package com.hospital;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class HospitalBean implements Hospital{

private JdbcTemplate jt;
	
	public HospitalBean(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}


	public List<HospitalP> getDetails() {
		List m = jt.queryForList("select * from hospital");
		return m;
		
	}

	public HospitalP getEmpDetails(int id) {
		HospitalP m = (HospitalP) jt.queryForMap("select * from hospital where id=?",new Object[]{id});
		return m;
	}

   public void deleteDetails(int id) {
		int result = jt.update("delete from hospital where id=?",new Object[]{id});
	
	}
	
	public void insertInfo(int id, String pname, String bgroup,String disease) {
		int result = jt.update("insert into hospital values(?,?,?,?)",new Object[]{id,pname,bgroup,disease});
		
	}

	public void updateDetails(int id, String pname, String bgroup,String disease) {
		int result = jt.update("update hospital set patientName=?,bgroup=? where id=?",new Object[]{pname,bgroup,disease,id});
		
	}


	

}
