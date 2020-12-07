package assignment8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class stepDefination8 {
Response response;
	
	@DataProvider(name="values")
	public Object[][] dataForGet(){
		Object[][] data = new Object[2][3];
		data[0][0]="2020";
		data[0][1]="12";
		data[0][2]="30";
		
		data[1][0]="2020";
		data[1][1]="12";
		data[1][2]="15";
		return data;
	}
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://api.ratesapi.io";
	}



    @Test(dataProvider="values")
	@When("posted with {string}-{string}-{string} future date information")
	public void posted_with_future_date_information(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
    	response = RestAssured.get("/api/"+string+"-"+string2+"-"+string3);
	}
    @Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
	    // Write code here that turns the phrase above into concrete actions
    	int StatusCode = response.getStatusCode();
	    System.out.println("Response Code : "+StatusCode);
	}



}
