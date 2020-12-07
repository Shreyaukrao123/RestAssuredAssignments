package assignment5;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class stepdefination5 {
	Response response;
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	    // Write code here that turns the phrase above into concrete actions
		 RestAssured.baseURI = "https://api.ratesapi.io";
	}



    @Test
	@When("posted with correct Information")
	public void posted_with_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
    	response = RestAssured.get("/api/latest");
	}
    @Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
	    // Write code here that turns the phrase above into concrete actions
    	int StatusCode = response.getStatusCode();

		Assert.assertTrue(StatusCode == 200);
    	String contentType = response.getContentType();
		Assert.assertEquals(contentType /* actual value */, "application/json" /* expected value */);
		
    	String responseBody = response.getBody().asString();
    	Assert.assertEquals(responseBody.contains("GP") /*Expected value*/, true /*Actual Value*/, "Response body does not contain John");
	}



}
