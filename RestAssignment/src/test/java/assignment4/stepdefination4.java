package assignment4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class stepdefination4 {
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
		response = RestAssured.get("/api/");
	}
	@Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.given().log().all().header("Content-Type", "application/json")
				.body(response.getBody().asString()).when().get("/api/").then().log().all().assertThat()
				.statusCode(404).extract().response();
	}

}
