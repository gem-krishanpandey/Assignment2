import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class restAssured_DELETE {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api/users/2";

        int status = given().contentType(ContentType.JSON).delete().getStatusCode();
        System.out.println("Status Code " + status);
    }
}
