package com.health.hackathon.hackathon.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.hackathon.hackathon.dao.HospitalDao;
import com.health.hackathon.hackathon.model.Hospital;

@Service
public class HospitalService {

	@Autowired
	private HospitalDao hospitalDao;
	
	public Hospital addNewHospital(Hospital hospital){
		return hospitalDao.addNewHospital(hospital);
	}
	
	public List<Hospital> getAllUser(){
		return hospitalDao.getAllHospital();
	}
}

