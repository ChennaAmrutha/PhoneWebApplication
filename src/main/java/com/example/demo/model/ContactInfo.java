package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Contact_details")
public class ContactInfo {
	@Id
	@GeneratedValue
	private Long contact_id;
	private String contact_name;
	private String contact_email;
	private Long contact_number;
}
