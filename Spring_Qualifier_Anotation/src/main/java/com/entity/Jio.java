package com.entity;

import org.springframework.stereotype.Component;

@Component("Jio")
public class Jio implements sim {

	@Override
	public String calling() {
		return "U r calling from Jio ";
	}

}
