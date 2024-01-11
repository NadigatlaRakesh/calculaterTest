package com.calculator.demo.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CalService {

	public String additionService(String jSONObject) {

		try {
			JSONObject json = new JSONObject(jSONObject);
			if (json.has("firstValue")) {
				Integer firstNumber = json.getInt("firstValue");
				if (json.has("secondValue")) {
					Integer secondNumber = json.getInt("secondValue");
					Integer result = firstNumber + secondNumber;
					System.out.println(result);
					return String.valueOf(result);
				} else {
					return "please provide correct Data";
				}
			} else {
				return "please provide correct Data";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Error Occured";
		}
	}
}
