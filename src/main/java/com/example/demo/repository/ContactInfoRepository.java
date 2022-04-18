package com.example.demo.repository;

import com.example.demo.model.ContactInfo;
import org.springframework.data.repository.CrudRepository;

public interface ContactInfoRepository extends CrudRepository<ContactInfo, Long>{

}
