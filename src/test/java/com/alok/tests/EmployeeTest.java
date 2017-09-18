package com.alok.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;



public class EmployeeTest {
	
	@Test
	public void validateEmploye(){
		given().get("").then().statusCode(200).log().all();
	}

}
