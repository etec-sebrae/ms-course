package com.franads.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.franads.hrpayroll.entity.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
