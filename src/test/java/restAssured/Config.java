package restAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Config {


    RequestSpecification requestSpecification = new RequestSpecBuilder()
  //          .addCookie("sdf", "zxcv")
  //          .addHeader("Authorization", "werwuieyrwuyerweyr")
  //         .setBaseUri("http://www.onet.pl")
            .setContentType(ContentType.JSON)
            .build();

    @BeforeEach
    public void before(){
        System.out.println("================== BeforEach rest Assured==============");
    }

    @BeforeAll
    public static void setUp(){
        System.out.println("================== BeforAll rest Assured==============");
        RestAssured.baseURI = DataTest.baseUri;
        RestAssured.basePath = DataTest.basePath;
    }
}
