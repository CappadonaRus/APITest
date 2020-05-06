import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class BankMainPage {

     List<WebElement> rowElements = $(By.xpath("//div[@class='ReactCollapse--collapse']"))
             .findElement(By.xpath("//table[@class='main-page-exchange__table main-page-exchange__table--online']"))
             .findElements(By.xpath(".//tr"));


    public SelenideElement tableHeader() {
        return $(By.xpath("//h2[@class='ant-typography open-ui-title block-subtitle main-page-exchange__dropdown-title']"));
    }

    public double getUSDBuyValue() {
        return Double.parseDouble(rowElements.get(1).findElements(By.xpath("./td")).get(1).getText().replace(",", "."));
    }

    public double getUSDSellValue() {
        return Double.parseDouble(rowElements.get(1).findElements(By.xpath("./td")).get(3).getText().replace(",", "."));
    }

    public double getEURBuyValue() {
        return Double.parseDouble(rowElements.get(2).findElements(By.xpath("./td")).get(1).getText().replace(",", "."));
    }

    public double getEURSellValue() {
        return Double.parseDouble(rowElements.get(2).findElements(By.xpath("./td")).get(3).getText().replace(",", "."));
    }
}
