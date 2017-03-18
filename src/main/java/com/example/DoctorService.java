package com.example;

import org.springframework.stereotype.Service;

@Service
public class DoctorService {

	public DoctorList find(String location, String speciality) {
		DoctorList docList = new DoctorList();
		
		Doctor doc1 = new Doctor();
		doc1.setId("doc1");
		doc1.setFirstName("Ajithesh");
		doc1.setLastName("Kumar Shukla");
		doc1.setSpecialityCode("Orthopedics");
		docList.add(doc1);
		
		Doctor doc2 = new Doctor();
		doc2.setId("doc2");
		doc2.setFirstName("Aditi");
		doc2.setLastName("Shukla");
		doc2.setSpecialityCode("Gyanocaelogy");
		docList.add(doc2);
		
		Doctor doc3 = new Doctor();
		doc3.setId("doc3");
		doc3.setFirstName("Anisha");
		doc3.setLastName("Shukla");
		doc3.setSpecialityCode("Cardiology");
		docList.add(doc3);
		
		return docList;
	}

}
