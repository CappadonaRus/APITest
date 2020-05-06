package in.reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserClassPostTest {
    private UserClassPost oldUser;
    private Response response = null;

    @BeforeClass
    public void setUp() {
        oldUser = new UserClassPost("Ivanov@mail.ru", "Ivanov", "Ivan", "www.google.com");
    }

    @BeforeMethod
    public void serializeAndSendUser() {
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(oldUser)
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .extract()
                .response();

    }

    @Test
    public void deserializeAndCheckUser() {
        UserClassPost newUser = response.getBody().as(UserClassPost.class);

        Assert.assertEquals(newUser.getEmail(), oldUser.getEmail());
        Assert.assertEquals(newUser.getFirst_name(), oldUser.getFirst_name());
        Assert.assertEquals(newUser.getLast_name(), oldUser.getLast_name());
        Assert.assertEquals(newUser.getAvatar(), oldUser.getAvatar());
    }

}

