import java.net.URI;
import java.net.URISyntaxException;
import static  io.restassured.RestAssured.given;

public class restAssured_AUTHENTICATION {

    public static void main(String[] args) throws URISyntaxException {
        URI url = new URI("https://postman-echo.com/basic-auth");

        given().auth().basic("postman","password").get(url).body().prettyPrint();


        int res = given().auth().basic("postman","password").get(url).getStatusCode();

        System.out.println(res);


    }
}