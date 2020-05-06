import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TabDriver {

    public static void acceptCookies(){
        $(By.xpath("//div[@class = 'cookies-agreement']")).findElement(By.xpath("//div/a")).click();
    }

    public static WebDriver switchToOpenedTab(){
        ArrayList<String> tabs = new ArrayList<String>(getWebDriver().getWindowHandles());
        return getWebDriver().switchTo().window(tabs.get(1));
    }
}
