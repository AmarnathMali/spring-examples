package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Patient;

public class PatientDaoImpl implements PatientDao{
	
	private JdbcTemplate jdbcTemplate;
	public PatientDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveOrUpdate(Patient patient) {
		// TODO Auto-generated method stub
		if(patient.getId()>0){
			String sql = "UPDATE patients SET patientname=?, bloodgroup=?, disease=? WHERE id=?";
			jdbcTemplate.update(sql, patient.getPatientname(), patient.getBloodgroup(),patient.getDisease(), patient.getId());
		}else{
			String sql = "INSERT INTO patients (patientname, bloodgroup, disease)  VALUES (?, ?, ?)";
		    jdbcTemplate.update(sql, patient.getPatientname(), patient.getBloodgroup(),patient.getDisease()); 		
		}
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM patients WHERE contact_id=?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public Patient get(int id) {
		
		String sql = "SELECT * FROM patients WHERE contact_id=" + id;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Patient>(){
			@Override
			public Patient extractData(ResultSet rs) throws SQLException,DataAccessException {
				if (rs.next()) {
					Patient patient = new Patient();
					patient.setId(rs.getInt("id"));
					patient.setPatientname(rs.getString("patientname"));
					patient.setBloodgroup(rs.getString("bloodgroup"));
					patient.setDisease(rs.getString("disease"));
					return patient;
				}
				return null;
				
			}
			
		});	
	}

	@Override
	public List<Patient> list() {
		String sql = "select * from patients";
		List<Patient> listPatient = jdbcTemplate.query(sql,new RowMapper<Patient>(){
			@Override
			public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
				Patient patient = new Patient();
				patient.setId(rs.getInt("id"));
				patient.setPatientname(rs.getString("patientname"));
				patient.setBloodgroup(rs.getString("bloodgroup"));
				patient.setDisease(rs.getString("disease"));
				return patient;
			
			}
			
		});	
		return listPatient;
	}
	
	
	
}

	