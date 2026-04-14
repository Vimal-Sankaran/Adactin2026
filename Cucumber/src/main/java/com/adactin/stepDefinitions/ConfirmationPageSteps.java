package com.adactin.stepDefinitions;

import com.adactin.entitymanager.EntityHelper;
import com.adactin.pages.ConfirmationPage;
import com.adactin.utitlities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ConfirmationPageSteps extends BaseClass {
    public WebDriver driver;

    public ConfirmationPage confirmationPage;

    public EntityHelper entityHelper;

    String checkInEr = "Check-In Date shall be before than Check-Out Date";

    public ConfirmationPageSteps(){
        driver = setChromeBrowser();
        confirmationPage = new ConfirmationPage(driver);
        entityHelper = new EntityHelper();
    }

    @Then("I validate details in Confirmation Page with json {string}")
    public void validateConfirmationPage(String id){
       // assertTrue(confirmationPage.getHotelName(),entityHelper.getCustomerDataById(id).getHotelName(),"Hotel name valid");

    }



}
