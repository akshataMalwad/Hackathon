package com.hackathon.api;

import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ApplyLoanScreen {
	
	/**
	 * Verify API for uploading loan details on 'Apply Loan' screen.
	 */
	@Test(priority=0)
	public void verifyApiForUploadingDetailsOfLoanOnApplyLoanScreen() {

		Response response;
		
		try {
			
			response = given().body(Utility.getJsonDetails("Resources\\LoanDetails.json")).contentType(ContentType.JSON)
					.post("http://10.117.189.142:8080/applyLoan");
			
			assertTrue(response.getStatusCode() == 201,"Expected Status code '201' but actual '"+"'"+response.getStatusCode()+"'");
			assertTrue(response.getStatusLine().equals("HTTP/1.1 201 "),"Expected Status line 'HTTP/1.1 201 ' but actual '"+"'"+response.getStatusLine()+"'");			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
