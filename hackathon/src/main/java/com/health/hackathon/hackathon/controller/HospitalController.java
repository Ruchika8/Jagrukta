package com.health.hackathon.hackathon.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.hackathon.hackathon.model.Hospital;
import com.health.hackathon.hackathon.service.HospitalService;


@RestController
@RequestMapping("/api/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping("/getAllHospitals")
	public List<Hospital> getAllHospitals(){
		return hospitalService.getAllUser();
	}
	
	@PostMapping("/register")
	public Hospital addNewHospital(@Valid @RequestBody Hospital hospital){
		return hospitalService.addNewHospital(hospital);
	}
	
}
