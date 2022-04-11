import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class restAssured_PUT {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api/users/2";

        String res = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";

        int status = given().contentType(ContentType.JSON).body(res).put().getStatusCode();
        System.out.println(status);
    }
}
