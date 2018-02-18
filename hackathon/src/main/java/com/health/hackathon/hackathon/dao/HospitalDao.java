package com.health.hackathon.hackathon.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.health.hackathon.hackathon.model.Hospital;
import com.health.hackathon.hackathon.model.User;
import com.health.hackathon.hackathon.rowmapper.HospitalRowMapper;
import com.health.hackathon.hackathon.rowmapper.UserRowMapper;

@Repository
public class HospitalDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String ADD_NEW_HOSPITAL = "INSERT INTO HOSPITAL(NAME, CONTACTNO, GOVERNMENT, ADDRESS, STATE, DISTRICT, WEBSITE,  HOSPITALTYPE, ADVANCEDFACILITY, DOCTORS) VALUES(?,?,?,?,?,?, ?, ?, ?, ?);";
	private final String GET_ALL_HOSPITAL = "SELECT NAME, CONTACTNO, GOVERNMENT, ADDRESS, STATE, DISTRICT, WEBSITE, LONGITUDE, LATITUDE, HOSPITALTYPE, ADVANCEDFACILITY, DOCTORS FROM HOSPITAL;";
	
	
	public Hospital addNewHospital(Hospital hospital){
		jdbcTemplate.update(ADD_NEW_HOSPITAL, hospital.getName(), hospital.getContactNo(), hospital.getGovernment(),hospital.getAddress(),hospital.getState(),hospital.getDistrict(),hospital.getWebsite(),hospital.getHospitalType(),hospital.getAdvancedFacility(),hospital.getNoOfDoctors());
		return hospital;
	}
	
	public List<Hospital> getAllHospital(){
		return jdbcTemplate.query(GET_ALL_HOSPITAL, new HospitalRowMapper());
	}
}

