package com.apipothi.propertiesreader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apipothi.propertiesreader.service.Bookservice;

@RestController
public class Bookcontroller {

	@Autowired
	Bookservice bookservice; 
	
	@GetMapping("/books")
	public void getBookInfo() {

		System.out.println("*Start-Bookcontroller**-getBookInfo()-***");
		
		bookservice.getFromProperties();
		
		
		System.out.println("*End-Bookcontroller**-getBookInfo()-***");
	}
}
