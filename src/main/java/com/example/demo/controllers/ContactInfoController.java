package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.ContactInfo;

@Controller
public class ContactInfoController {

	@PostMapping("/addContact")
	public String addContact(@RequestBody ContactInfo cinfo ) {
		
		return "Data Stored Successfully";
	}
}
