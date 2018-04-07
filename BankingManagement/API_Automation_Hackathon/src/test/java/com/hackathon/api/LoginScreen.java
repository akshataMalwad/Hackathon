package com.hackathon.api;

import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class LoginScreen {	

	/**
	 * Verify API for post method for login screen.
	 * 
	 * @throws IOException
	 */
	@Test(priority=0)
	public void verifyApiForLoginScreen() {		

		Response response;
		
		try {
			
			response = given().body(Utility.getJsonDetails("Resources\\Login.json")).contentType(ContentType.JSON)
					.post("http://10.117.189.142:8080/login");

			System.out.println(response.getStatusCode());
			assertTrue(response.getStatusCode() == 200,"Expected Status code '200' but actual '"+"'"+response.getStatusCode()+"'");
			assertTrue(response.getStatusLine().equals("HTTP/1.1 200 "),"Expected Status line 'HTTP/1.1 200 ' but actual '"+"'"+response.getStatusLine()+"'");

			System.out.println(response.getBody().asString());
			JsonPath jsonpath = response.jsonPath();			
			assertTrue(jsonpath.getString("aadharNumber").equals("12345"),"Not Expected userid'"+jsonpath.getString("userId")+"'");
			assertTrue(jsonpath.getString("userName").equals("akshata1"),"Not Expected username'"+jsonpath.getString("username")+"'");
			assertTrue(jsonpath.getString("fullName").equals("akshataM"),"Not Expected fullName'"+jsonpath.getString("fullName")+"'");
			assertTrue(jsonpath.getString("email").equals("aksh@1234"),"Not Expected email'"+jsonpath.getString("email")+"'");
			assertTrue(jsonpath.getString("registrationStatus").equals("approved"),"Not Expected status'"+jsonpath.getString("status")+"'");
			assertTrue(jsonpath.getString("role").equals("customer"),"Not Expected role'"+jsonpath.getString("role")+"'");
			assertTrue(jsonpath.getString("contactNumber").equals("9999999"),"Not Expected contactNumber'"+jsonpath.getString("contactNumber")+"'");
			//assertTrue(jsonpath.getString("password").equals("null"),"Not Expected password'"+jsonpath.getString("password")+"'");
			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
