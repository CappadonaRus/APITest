package in.reqres;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserClassGetTest {

    public in.reqres.UserClassGet userClassGet;

    @BeforeClass
    public void setUp() {
        userClassGet = RestAssured.get("https://reqres.in/api/users?page=2").as(UserClassGet.class);
    }

    @Test
    public void userClassBodyNotNullTest() {
        Assert.assertTrue(isNotNull(userClassGet.getPage()), "field is 0");
        Assert.assertTrue(isNotNull(userClassGet.getPer_page()), "field is 0");
        Assert.assertTrue(isNotNull(userClassGet.getTotal()), "field is 0");
        Assert.assertTrue(isNotNull(userClassGet.getTotal_pages()), "field is 0");
    }

    private boolean isNotNull(int a) {
        return a > 0;
    }

    @Test
    public void innerDataClassNotNullTest() {
        for (int i = 0; i < userClassGet.getArrayList().size(); i++) {
            for (int j = 0; j < userClassGet.getArrayList().size(); j++) {
                Assert.assertTrue(isNotNull(userClassGet.getArrayList().get(j).getId()));
                Assert.assertNotNull(userClassGet.getArrayList().get(j).getEmail());
                Assert.assertNotNull(userClassGet.getArrayList().get(j).getFirst_name());
                Assert.assertNotNull(userClassGet.getArrayList().get(j).getLast_name());
                Assert.assertNotNull(userClassGet.getArrayList().get(j).getAvatar());
            }
        }
    }

    @Test
    public void innerAdClassNotNullTest() {
        Assert.assertNotNull(userClassGet.getAd().getCompany(), "Field company is null");
        Assert.assertNotNull(userClassGet.getAd().getUrl(), "Field url is null");
        Assert.assertNotNull(userClassGet.getAd().getText(), "Field text is null");
    }
}
