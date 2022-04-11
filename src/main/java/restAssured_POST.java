import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.net.URI;

import static io.restassured.RestAssured.given;

public class restAssured_POST {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api/users";

        String res = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        given().contentType(ContentType.JSON).body(res).post().then().log().all();
    }
}
