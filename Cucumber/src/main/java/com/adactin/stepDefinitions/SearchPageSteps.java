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

    @Given("I select {string} location in Search Page")
    public void selectLocation(String location){
        searchPage.selectLocation(location);
    }

    @Given("I select {string} hotel in Search Page")
    public void selectHotel(String hotel){
        searchPage.selectHotel(hotel);
    }


    @Given("I enter details in Search Page using id {string}")
    public void searchHotel(String id){
        searchPage.selectLocation(entityHelper.getCustomerDataById(id).getLocation());
        searchPage.selectHotel(entityHelper.getCustomerDataById(id).getHotelName());
        searchPage.clickSearch();
    }



}
