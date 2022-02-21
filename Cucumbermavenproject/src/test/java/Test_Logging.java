import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
public class Test_Logging {
    
    @Test
    void login() {
        
        
        System.out.println("**********GET**********");
        
        RestAssured.given()
        .when().log().all()
        .get("https://reqres.in/api/users?page=2")
        .then().log().all();
        
        System.out.println("**********PUT**********");
        //DEFAULT_BODY_ROOT_PATH
        RestAssured.given()
        .contentType(ContentType.JSON)
        .body("{\r\n"
                + "    \"name\": \"morpheus\",\r\n"
                + "    \"job\": \"leader\"\r\n"
                + "}")
        .when().log().all()
        .get("https://reqres.in/api/users?page=2")
        .then().log().status();
    }    
}
 
