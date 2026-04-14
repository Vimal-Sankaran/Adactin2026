package com.adactin.pages;

import com.adactin.entitymanager.EntityHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItineraryPage {

	public WebDriver driver;
	public EntityHelper entityHelper;

	public ItineraryPage(WebDriver driverr) {
		this.driver=driverr;
		PageFactory.initElements(driver, this);
		entityHelper = new EntityHelper();
	}

}
