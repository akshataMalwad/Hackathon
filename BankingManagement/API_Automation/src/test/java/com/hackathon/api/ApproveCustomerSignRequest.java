package com.hackathon.api;

import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ApproveCustomerSignRequest {
	

	/**
	 * Verify API for approve customer customer sign up request.
	 */
	@Test
	public void verifyApiForUploadingDetailsOfLoanOnApplyLoanScreen() {

		Response response;
		
		try {			

			Map<String, String> dataMap=Utility.getMapFromJsonFile("Resources\\ApproveLoan.json");			
			
			response = given().contentType(ContentType.JSON)
					.get("http://10.117.189.142:8080/regApproval?aadharNumber="+dataMap.get("aadharNumber")+"&status="+dataMap.get("status"));
			
			
			assertTrue(response.getStatusCode() == 200,"Expected Status code '200' but actual '"+"'"+response.getStatusCode()+"'");
			assertTrue(response.getStatusLine().equals("HTTP/1.1 200 "),"Expected Status line 'HTTP/1.1 200 ' but actual '"+"'"+response.getStatusLine()+"'");			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}

	}


}
