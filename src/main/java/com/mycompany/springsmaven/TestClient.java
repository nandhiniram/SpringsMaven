/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springsmaven;

import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 *
 * @author Nandhini
 */
public class TestClient {
	public static void main(String[] args) {
		try {
	System.out.println("TestClient started");

	//Load the hello.xml to classpath
	ClassPathXmlApplicationContext appContext = 
	new ClassPathXmlApplicationContext(new String[] { "src/target/resources/hello.xml" });

	System.out.println("Classpath loaded");

	HelloBean helloBean = (HelloBean) appContext.getBean("helloBean");

	Name name = new Name();
	name.setFirstName("Tony");
	name.setLastName("Greg");
	String str = helloBean.wishMe(name);

	System.out.println(str);
	System.out.println("TestClient end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
