package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.ContactInfo;
import com.example.demo.repository.ContactInfoRepository;

public class ContactService {
	
	@Autowired
	private ContactInfoRepository contactInfoRepository;
	public String addContact(ContactInfo cinfo) {
		contactInfoRepository.save(cinfo);
		return "Contact added successfully";
	}
}
