import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APITests {
    @Test
    void test1(){

        Response response =  get("https://reqres.in/api/users?page=2");
        response.getStatusCode();
        System.out.println(response.getStatusCode());
        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.getTime());
        System.out.println(response.getHeader("content-type"));


    }

//    @Test
//    void test2(){
//
//
//
//                given().get("https://reqres.in/api/users?page=2")
//                        .then()
//                        .statusCode(201)
//                        .body()
//
//
//
//    }
}
