package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorSearchController {
	
	@Autowired
	DoctorService docService;
	
	@RequestMapping(value="/doctors", method=RequestMethod.GET, produces="application/json")
	public DoctorList searchDoctor(@RequestParam(value="location", required=false) String location,
			@RequestParam(value="speciality", required=false) String speciality) {
		DoctorList docList = docService.find(location, speciality);
		return docList;
	}
}
