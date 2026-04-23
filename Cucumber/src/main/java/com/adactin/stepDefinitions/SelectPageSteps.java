package com.adactin.stepDefinitions;

import com.adactin.entitymanager.EntityHelper;
import com.adactin.pages.SearchPage;
import com.adactin.pages.SelectPage;
import com.adactin.utitlities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SelectPageSteps extends BaseClass {

    public WebDriver driver;

    public SelectPage selectPage;

    public EntityHelper entityHelper;

    public SelectPageSteps(){
        driver = setChromeBrowser();
        selectPage = new SelectPage(driver);
        entityHelper = new EntityHelper();
    }

    //    @Given("I select location option {string} in Search Page")
//    public void selectLocation(String location){
//        //selectPage.selectLocation(location);
//    }

    @Given("I validate hotel location {string} in select hotel page")
    public void validateLocation(String location){
        assertTrue(selectPage.getLocationName(),location,"Location validated");
    }
}
