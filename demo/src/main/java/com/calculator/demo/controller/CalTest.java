package com.calculator.demo.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.demo.service.CalService;

@RestController
public class CalTest {

	@Autowired
	CalService calService;

	@RequestMapping("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addition(@RequestBody String JSONObject) {
		String additionServiceResponse = calService.additionService(JSONObject);
		System.out.println("controller: "+additionServiceResponse);
		return additionServiceResponse.trim();
	}
}
