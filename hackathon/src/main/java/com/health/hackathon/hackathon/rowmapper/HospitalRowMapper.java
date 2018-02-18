package com.health.hackathon.hackathon.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.health.hackathon.hackathon.model.Hospital;
import com.health.hackathon.hackathon.model.User;

public class HospitalRowMapper implements RowMapper<Hospital>{


	@Override
	public Hospital mapRow(ResultSet res, int arg1) throws SQLException {
		Hospital hospital = new Hospital();
		hospital.setName(res.getString("NAME"));
		hospital.setAddress(res.getString("ADDRESS"));
		hospital.setAdvancedFacility(res.getString("ADVANCEDFACILITY"));
		hospital.setContactNo(res.getString("CONTACTNO"));
		hospital.setDistrict(res.getString("DISTRICT"));
		hospital.setGovernment(res.getString("GOVERNMENT"));
		hospital.setHospitalType(res.getString("HOSPITALTYPE"));
		hospital.setNoOfDoctors(res.getShort("DOCTORS"));
		return hospital;
	}
}
