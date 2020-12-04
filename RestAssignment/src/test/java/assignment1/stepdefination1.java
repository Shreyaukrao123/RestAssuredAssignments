package assignment1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class stepdefination1 {
	Response response;
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI=("https://api.ratesapi.io");
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
		System.out.println(StatusCode);
		Assert.assertTrue(StatusCode == 200);
		System.out.println(response.prettyPrint());
	}


}
