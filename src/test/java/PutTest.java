import io.restassured.http.ContentType;
import org.junit.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PutTest {
    @Test
    public void putRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .when()
                .contentType(ContentType.TEXT)
                .body("This is expected to be sent back as part of response body.")
                .put("/put")
                .then()
                .log().body().assertThat()
                .statusCode(200)
                .body("args", anEmptyMap())
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("files", anEmptyMap())
                .body("form", anEmptyMap())
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/put"));
    }
}