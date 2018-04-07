package com.hackathon.api;

import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class ApproveLoanScreen {
	
	/**
	 * Verify API for approving loan details on 'Approval Loan' screen.
	 */
	@Test
	public void verifyApiForUploadingDetailsOfLoanOnApplyLoanScreen() {

		Response response;
		
		try {			

			Map<String, String> dataMap=Utility.getMapFromJsonFile("Resources\\ApproveLoan.json");			
			
			System.out.println("http://10.117.189.142:8080/loanApproval?aadharNumber="+dataMap.get("aadharNumber")+"&status="+dataMap.get("status"));
			response = given()
					.get("http://10.117.189.142:8080/loanApproval?aadharNumber="+dataMap.get("aadharNumber")+"&status="+dataMap.get("status"));
			
			
			assertTrue(response.getStatusCode() == 200,"Expected Status code '200' but actual '"+"'"+response.getStatusCode()+"'");
			assertTrue(response.getStatusLine().equals("HTTP/1.1 200 "),"Expected Status line 'HTTP/1.1 200 ' but actual '"+"'"+response.getStatusLine()+"'");			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}

	}


}
