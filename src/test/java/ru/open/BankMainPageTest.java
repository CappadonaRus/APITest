import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class BankMainPageTest {

    @BeforeClass
    public void setUp() {
        Configuration.browser = Browsers.CHROME;
    }

    @Test
    public void testSearch() {
        open("https://www.google.com");
        new GoogleSearchPage().search("Открытие");
        GoogleResultPage resultPage = new GoogleResultPage();

        resultPage.results().findBy(Condition.text("www.open.ru"))
                .findElement(By.partialLinkText("www.open.ru")).click();

        TabDriver.acceptCookies();
        BankMainPage bankMainPage = new BankMainPage();

        bankMainPage.tableHeader().shouldHave(Condition.matchText("Курс обмена в интернет-банке"));
        Assert.assertTrue(bankMainPage.getUSDSellValue() > bankMainPage.getUSDBuyValue());
        Assert.assertTrue(bankMainPage.getEURSellValue() > bankMainPage.getEURBuyValue());

    }
}
