package com.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	public static void main(String[] args) {

		ApplicationContext ap = new AnnotationConfigApplicationContext(MyConfig.class);
		person p = ap.getBean(person.class);
		System.out.println(p.getSim1().calling());
		System.out.println(p.getSim2().calling());
	}

}
