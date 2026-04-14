package com.adactin.pages;

import com.adactin.utitlities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends BaseClass {

	public WebDriver driver;

	//constructor
	public SelectPage(WebDriver driverr) {
		this.driver=driverr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "hotel_name_0")
	private WebElement hotelName;

	public String getHotelName() {
		return hotelName.getText();
	}

}
