package com.example;

import org.springframework.stereotype.Service;

@Service
public class DoctorService {

	public DoctorList find(String location, String speciality) {
		DoctorList docList = new DoctorList();
		
		Doctor doc1 = new Doctor();
		doc1.setId("doc1");
		doc1.setFirstName("Sumit");
		doc1.setLastName("Cho");
		doc1.setSpecialityCode("Orthopedics");
		docList.add(doc1);
		
		Doctor doc2 = new Doctor();
		doc2.setId("doc2");
		doc2.setFirstName("Saanvi");
		doc2.setLastName("Choudhary");
		doc2.setSpecialityCode("Gyanocaelogy");
		docList.add(doc2);
		
		Doctor doc3 = new Doctor();
		doc3.setId("doc3");
		doc3.setFirstName("Snehal");
		doc3.setLastName("Choudhary");
		doc3.setSpecialityCode("Cardiology");
		docList.add(doc3);
		
		return docList;
	}

}
