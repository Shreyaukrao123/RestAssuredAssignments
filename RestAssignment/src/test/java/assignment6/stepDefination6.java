package assignment6;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class stepDefination6 {
	
	Response response;
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://api.ratesapi.io";
	}

    @Test
	@When("posted with future date information")
	public void posted_with_future_date_information() {
	    // Write code here that turns the phrase above into concrete actions
    	response = RestAssured.get("/api/07-12-2020");
	}
    @Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
	    // Write code here that turns the phrase above into concrete actions
    	int StatusCode=response.getStatusCode();
		System.out.println("Response Code : "+StatusCode);
		
		response = RestAssured.given().
				headers("Content-Type","application/json").
				log().all().get("/api/07-12-2020").
                then().
                assertThat().statusCode(400).log().all().extract().response();
	}


}
