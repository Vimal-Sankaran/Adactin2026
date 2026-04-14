package com.adactin.pages;

import com.adactin.utitlities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass {

	public WebDriver driver;

	public BookingPage(WebDriver driverr) {
		this.driver=driverr;
		PageFactory.initElements(driver, this);
	}
}
