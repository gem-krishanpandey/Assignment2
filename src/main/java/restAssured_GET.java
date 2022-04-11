import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class restAssured_GET {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api/users?page=2";

         Response response = given().contentType (ContentType.JSON).when().relaxedHTTPSValidation().get();

           System.out.println(response.prettyPrint());

    }

}
