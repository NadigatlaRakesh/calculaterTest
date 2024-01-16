package com.demo.main.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.service.MainService;

@RestController
public class MainController {

	@Autowired
	MainService service;

	@RequestMapping("/math/main")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String mainCalculator(@RequestBody String JsonObject) {
		String mainAddSubResponse = service.MainAddSub(JsonObject);
		return mainAddSubResponse;
	}
}
