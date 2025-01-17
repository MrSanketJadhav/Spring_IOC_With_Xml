package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class person {

	@Autowired
	@Qualifier("Airtel")
	public sim sim1;
	@Autowired
	@Qualifier("Jio")
	public sim sim2;

	public sim getSim1() {
		return sim1;
	}

	public void setSim1(sim sim1) {
		this.sim1 = sim1;
	}

	public sim getSim2() {
		return sim2;
	}

	public void setSim2(sim sim2) {
		this.sim2 = sim2;
	}

	@Override
	public String toString() {
		return "person [sim1=" + sim1 + ", sim2=" + sim2 + "]";
	}

	public person(sim sim1, sim sim2) {
		super();
		this.sim1 = sim1;
		this.sim2 = sim2;
	}

	public person() {

	}

}
