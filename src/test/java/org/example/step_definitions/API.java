package org.example.step_definitions;

import java.util.HashMap;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.*;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;


public class API {

    Response response;
    String endpoint, exampleID;

    HashMap<String, String> selectedHeaders = new HashMap<>();
    HashMap<String, String> selectedParameters = new HashMap<>();

    @Given("Url")
    public void url() {
        System.out.println("Test Started");
    }


    @When("Get response")
    public void getResponse() {

        response =
                given()
                        //.relaxedHTTPSValidation() //if needed
                        .headers(selectedHeaders)
                        .and()
                        .queryParams(selectedParameters)
                        .when()
                        .get(endpoint);

        //        response.prettyPrint();

        //Below code will fail test when we get empty JSON
        if (response.asPrettyString().equals("{\n    \n}")) {
            Assert.fail("Body is empty");
        }
    }

    @When("Check Status Code {int}")
    public void CheckStatusCode(int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.statusCode());
    }


    @When("Get response and Check Status Code {int}")
    public void getResponseAndCheckStatusCode(int expectedStatusCode) {
        response =
                given()
                        .accept(ContentType.JSON)
                        //.relaxedHTTPSValidation()
                        .headers(selectedHeaders)
                        .and()
                        .queryParams(selectedParameters)
                        .when()
                        .get(endpoint)
                        .then()
                        .statusCode(expectedStatusCode).extract().response();


        System.out.println("selectedHeaders = " + selectedHeaders);
        System.out.println("selectedParameters = " + selectedParameters);
        response.prettyPrint();

        //Below code will fail test when we get empty JSON
        if (response.asPrettyString().equals("{\n    \n}")) {
            Assert.fail("Body is empty");
        }
    }



//   --- --- --- --- --- --- Setting the request Headers and Parameters --- --- --- --- --- --- ---



    @And("Set endpoint {string}")
    public void setEndpoint(String endpointValue) {
        endpoint = endpointValue;
    }

    @And("Set content type {string}")
    public void setContentType(String contentTypeValue) {
        selectedHeaders.put("Accept", contentTypeValue);
    }

    @And("Set exampleID {string}")
    public void setExampleID(String exampleID) {
        selectedHeaders.put("exampleID", exampleID);
    }

    @And("Set requiredHeader {string}")
    public void setRequiredHeader(String requiredHeader) {
        selectedHeaders.put("requiredHeader", requiredHeader);
    }

    @And("Set optional parameters {string} {string}")
    public void setOptionalParameters(String paramNames, String paramValues) {

        String[] listOfParamNames = paramNames.split(", ");
        String[] listOfParamValues = paramValues.split(", ");

        for (int i = 0; i <listOfParamNames.length ; i++) {
            selectedParameters.put(listOfParamNames[i], listOfParamValues[i]);
        }

    }



//   --- --- --- --- --- --- Navigating in the response body --- --- --- --- --- --- ---



    @Then("Body contains field {string}")
    public void bodyContainsField(String bodyContainsField) {

        //codes

    }

    @Then("Body contains error message {string}")
    public void bodyContainsErrorMessages(String listOfErrorMessages) {

        //codes

    }

    @And("Set path with list {string} get {string} as expected value")
    public void setPathWithListInTheBody(String bodyContentPath, String bodyContentExpectedValue) {

        //codes

    }

    @And("Set path with digit in the body equals {string} {string}")
    public void setPathWithDigitInTheBody(String bodyContentPath, String bodyContentExpectedValue) {

        //codes

    }

}
