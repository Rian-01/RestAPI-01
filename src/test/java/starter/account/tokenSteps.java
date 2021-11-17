package starter.account;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class tokenSteps {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;

    @Step
    public void setBodyReqGenTokenBlank() {
        requestParams = new JSONObject();
        requestParams.put("userName", "");
        requestParams.put("password", "");

    }

    @Step
    public void setBodyReqGenTokenBlankPass() {
        requestParams = new JSONObject();
        requestParams.put("userName", "admin7"+endpoint.Username+endpoint.Pass);
        requestParams.put("password", "");

    }

    @Step
    public void setBodyReqGenToken() {
        requestParams = new JSONObject();
        requestParams.put("userName", "admin7"+endpoint.Username+endpoint.Pass);
        requestParams.put("password", "Sakuu@02"+endpoint.Username+endpoint.Pass);

    }


//    ###############################################################################################################

    @Step
    public void hitEndpointTokenBlank() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.TOKEN)
                .then()
                .statusCode(400);
    }


    @Step
    public void hitEndpointTokenBlankPass() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.TOKEN)
                .then()
                .statusCode(400);
    }


    @Step
    public void hitEndpointToken() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.TOKEN)
                .then()
                .statusCode(200);
    }


    //    ###############################################################################################################



    @Step
    public void valDateEndpointToken() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/token.json"));
    }
}
