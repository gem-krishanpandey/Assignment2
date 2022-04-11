import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.core.Is;

import java.net.URI;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;

public class restAssured_BODYASSERTION {
    public static void main(String[] args) throws URISyntaxException {
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api/users";
        URI url = new URI("https://reqres.in/api/users");

        given().contentType(ContentType.JSON).get().then().assertThat().body(containsString("George")).log().all();
     // given().contentType(ContentType.JSON).header("content-Type","application/JSON").get(url).then().assertThat().body("data.id[1]", Is.is(2)).log().all();

    }
}
