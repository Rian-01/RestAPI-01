package starter.account;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Login {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;

    @Step
    public void setBodyReqBlank() {
        requestParams = new JSONObject();
        requestParams.put("userName", "");
        requestParams.put("password", "");
    }

    @Step
    public void setBodyReqBlankPass() {
        requestParams = new JSONObject();
        requestParams.put("userName", "Dada02" + endpoint.Username + endpoint.Pass);
        requestParams.put("password", "");
    }

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("userName", "Dada02" + endpoint.Username + endpoint.Pass);
        requestParams.put("password", "Akusayang@02" + endpoint.Username + endpoint.Pass);
    }


    //    ##################################################################################################################


    @Step
    public void hitEndPointLoginBlank() {
        SerenityRest
                .given()
                    .header("Content-Type", "application/json")
                    .body(requestParams.toString())
                .when()
                    .post(endpoint.LOGIN)
                .then()
                    .statusCode(400);
    }


    @Step
    public void hitEndPointLoginBlankPass() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.LOGIN)
                .then()
                .statusCode(400);
    }

    @Step
    public void hitEndpointLogin() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.LOGIN)
                .then()
                .statusCode(201);
    }


    //    ##################################################################################################################


    @Step
    public void valDateEndpointLoginBlank() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/loginBlank.json"));
    }

    @Step
    public void valDateEndpointLoginBlankPass() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/loginBlank.json"));
    }


    @Step
    public void valDateEndpointLogin() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/login.json"));
    }
}