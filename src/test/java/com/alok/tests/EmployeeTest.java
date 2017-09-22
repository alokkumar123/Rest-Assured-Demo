package com.alok.tests;

import org.testng.annotations.Test;

import com.alok.restAssuredFramework.RestAssuredConfiguration;
import com.alok.tests.common.EndPoint;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;



public class EmployeeTest extends RestAssuredConfiguration {
	
//	@Test
//	public void validateEmploye(){
//		given().get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").then().statusCode(200).log().all();
//		
//		
//	}

	@Test
	public void resAssured(){
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httpResquest = RestAssured.given();
		
		Response response = httpResquest.request(Method.GET,"/Hyderabad");
		
		     String res  =response.getBody().asString();
		       
		
		System.out.println("Response of body: " +res);
	}
	
	//@Test
	public void validate(){
		
		given().get("https://graph.facebook.com/99394368305/photos").then().statusCode(200).log().all();
		//given().get(EndPoint.GET_VALUE).getContentType();
	}
}
