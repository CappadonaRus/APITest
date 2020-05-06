package ru.open.GoogleSearch;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPage {

    public void search(String query) {
            $(By.name("q")).val(query).pressEnter();
    }
}
