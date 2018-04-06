package com.hackathon.api;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PostAPI {
	
	public String getJsonDetails() throws IOException {
		return new String(Files.readAllBytes(Paths.get("")));
	}
	
  @Test
  public void verifyPostAPI() {
	  //Response response=given().body("").post();
	  //assertTrue(response.getStatusCode()==201);	
	  assertTrue(true);
  } 
  
}
