package restAssured;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Config {

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
