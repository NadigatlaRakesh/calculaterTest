package com.demo.main.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class MainService {

	public String MainAddSub(String JSONValue) {
		Integer result = null;
		if (isTrueJson(JSONValue)) {
			JSONObject json = new JSONObject(JSONValue);
			if (json.has("firstValue")) {
				Integer firstNumber = json.getInt("firstValue");
				if (json.has("secondValue")) {
					Integer secondNumber = json.getInt("secondValue");
					String math = (String) json.get("math");
					switch (math) {
					case "+": {
						result = firstNumber + secondNumber;
					}
						break;
					case "-": {
						result = firstNumber - secondNumber;
					}
						break;
					case "*": {
						result = firstNumber * secondNumber;
					}
						break;
					case "%": {
						result = firstNumber % secondNumber;
					}
						break;
					default:
						return "Given Operation is not implemented: "+math+" please check with developer";
					}
					System.out.println(result);
					return String.valueOf(result);
				} else {
					return "please provide correct Data";
				}
			} else {
				return "please provide correct Data";
			}
		}
		return String.valueOf(result);
	}

	public static boolean isTrueJson(String JSONValue) {
		boolean isTrue = false;
		try {
			JSONObject json = new JSONObject(JSONValue);
			isTrue = true;
		} catch (Exception e) {
		}
		return isTrue;
	}
}
