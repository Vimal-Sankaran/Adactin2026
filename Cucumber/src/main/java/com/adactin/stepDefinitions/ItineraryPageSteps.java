package com.adactin.stepDefinitions;

import com.adactin.entitymanager.EntityHelper;
import com.adactin.pages.ItineraryPage;
import com.adactin.utitlities.BaseClass;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ItineraryPageSteps extends BaseClass {
    public WebDriver driver;

    public ItineraryPage itineraryPage;

    public EntityHelper entityHelper;

    public ItineraryPageSteps(){
        driver = setChromeBrowser();
        itineraryPage = new ItineraryPage(driver);
        entityHelper = new EntityHelper();
    }



}
