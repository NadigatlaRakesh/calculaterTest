package com.calculator.demo.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CalService {

	public String additionService(String jSONObject) {
		org.apache.http.HttpResponse responsefromService = null;
		org.apache.http.client.HttpClient httpClient = null;
		HttpPost postRequest = null;
		StringEntity input = null;
		String apiRequestToken ="";
		BufferedReader br = null;
		try {
			
			httpClient = HttpClientBuilder.create().build();
			postRequest = new HttpPost("http://localhost:8081/math/main"); // NEED
			String requestBody = jSONObject;
			input = new StringEntity(requestBody);
			input.setContentType("application/json");
			postRequest.setEntity(input);
			responsefromService = httpClient.execute(postRequest);
			
//			RestTemplate restTemplate = new RestTemplate();
//			HttpHeaders headers = new HttpHeaders();
//			headers.setContentType("application/json");
//			String requestBody = jSONObject;
//			System.out.println("paylooad: " + requestBody);
//			HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
//			String response = restTemplate.postForObject("https://localhost:8081/math/main",requestEntity, String.class);
//			System.out.println("response: " + requestBody);
			br = new BufferedReader(new InputStreamReader((responsefromService.getEntity().getContent())));

			String output;
			final StringBuffer totalOutput = new StringBuffer();

			while ((output = br.readLine()) != null) {
				totalOutput.append(output);
			}

			apiRequestToken = totalOutput.toString();
			System.out.println("response: " + apiRequestToken);

			return apiRequestToken;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Error Occured";
		}
	}
}
