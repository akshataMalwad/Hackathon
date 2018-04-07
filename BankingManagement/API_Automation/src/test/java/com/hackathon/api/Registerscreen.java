package com.hackathon.api;

import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.path.json.JSONAssertion;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class Registerscreen {
	
	/**
	 * Verify API for post method for login screen.
	 * 
	 * @throws IOException
	 */
	@Test(priority=0)
	public void verifyApiForUploadingDetailsOfUserOnRegisterScreen() {

		Response response;
		
		try {
			
			response = given().body(Utility.getJsonDetails("Resources\\Register.json")).contentType(ContentType.JSON)
					.post("http://10.117.189.142:8080/register");
			
			assertTrue(response.getStatusCode() == 201,"Expected Status code '201' but actual '"+"'"+response.getStatusCode()+"'");
			assertTrue(response.getStatusLine().equals("HTTP/1.1 201 "),"Expected Status line 'HTTP/1.1 201 ' but actual '"+"'"+response.getStatusLine()+"'");			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}
	
	/**
	 * Verify API for post method for login screen.
	 * 
	 * @throws IOException
	 */
	@Test(priority=1)
	public void verifyApiForUploadingDuplicateDetailsOfUserOnRegisterScreen() {

		Response response;
		
		try {
			
			response = given().body(Utility.getJsonDetails("Resources\\Register.json")).contentType(ContentType.JSON)
					.post("http://10.117.189.142:8080/register");
			
			assertTrue(response.getStatusCode() == 404,"Expected Status code '404' but actual '"+"'"+response.getStatusCode()+"'");
			assertTrue(response.getStatusLine().equals("HTTP/1.1 404 "),"Expected Status line 'HTTP/1.1 404 ' but actual '"+"'"+response.getStatusLine()+"'");			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}


}
