package com.hackathon.api;

import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ApproveLoanScreen {
	
	/**
	 * Verify API for approving loan details on 'Approval Loan' screen.
	 */
	@Test
	public void verifyApiForUploadingDetailsOfLoanOnApplyLoanScreen() {

		Response response;
		
		try {
			
			response = given().body(Utility.getJsonDetails("Resources\\ApproveLoan.json")).contentType(ContentType.JSON)
					.post("http://10.117.189.142:8080/regApproval");
			
			assertTrue(response.getStatusCode() == 200,"Expected Status code '200' but actual '"+"'"+response.getStatusCode()+"'");
			assertTrue(response.getStatusLine().equals("HTTP/1.1 200 "),"Expected Status line 'HTTP/1.1 200 ' but actual '"+"'"+response.getStatusLine()+"'");			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}


}
