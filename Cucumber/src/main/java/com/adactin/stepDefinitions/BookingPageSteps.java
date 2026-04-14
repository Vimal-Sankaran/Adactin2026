package com.adactin.stepDefinitions;

import com.adactin.entitymanager.EntityHelper;
import com.adactin.pages.BookingPage;
import com.adactin.utitlities.BaseClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;


public class BookingPageSteps extends BaseClass {
    public WebDriver driver;

    public BookingPage bookingPage;

    public EntityHelper entityHelper;

    public BookingPageSteps(){
        driver = setChromeBrowser();
        bookingPage = new BookingPage(driver);
        entityHelper = new EntityHelper();
    }


}
