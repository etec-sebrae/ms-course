package com.franads.hrpayroll.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.franads.hrpayroll.entity.Payment;
import com.franads.hrpayroll.entity.Worker;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(long workId, int days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workId);
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class,uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
