package com.entity;

import org.springframework.stereotype.Component;

@Component("Airtel")
public class Airtel implements sim {

	@Override
	public String calling() {
		return " U R Calling Airtel";
	}

}
