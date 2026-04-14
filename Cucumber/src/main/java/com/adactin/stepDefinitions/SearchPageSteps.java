package com.adactin.stepDefinitions;

import com.adactin.entitymanager.EntityHelper;
import com.adactin.pages.SearchPage;
import com.adactin.utitlities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SearchPageSteps extends BaseClass {

    public WebDriver driver;

    public SearchPage searchPage;

    public EntityHelper entityHelper;

    public SearchPageSteps(){
        driver = setChromeBrowser();
        searchPage = new SearchPage(driver);
        entityHelper = new EntityHelper();
    }


}
