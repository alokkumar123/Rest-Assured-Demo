package com.alok.restAssuredFramework;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class RestAssuredConfiguration {

	
	@BeforeSuite(alwaysRun = true)
	public void configure(){
		RestAssured.baseURI="https://apigee.com";
		//RestAssured.port=8080;
		RestAssured.basePath ="/resources/blogger";
		
		
	}
}
