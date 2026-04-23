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

@FindBy(id="hotel_name_dis")
	private WebElement hotelname;

	@FindBy(id="location_dis")
	private WebElement location;

	@FindBy(id="room_type_dis")
	private WebElement Room_type;

	@FindBy(id="room_num_dis")
	private WebElement No_Of_Rooms;

	@FindBy(id="total_days_dis")
	private WebElement total_days;

	@FindBy(id="price_night_dis")
	private WebElement price_night;

	@FindBy(id="total_price_dis")
	private WebElement total_price;

	@FindBy(id="gst_dis")
	private WebElement gst;

	@FindBy(id="final_price_dis")
	private WebElement final_price;

	@FindBy(id="first_name")
	private WebElement first_name;

	@FindBy(id="last_name")
	private WebElement last_name;

	@FindBy(id="address")
	private WebElement addr;

	@FindBy(id="cc_num")
	private WebElement credit_number;

	@FindBy(id="cc_type")
	private WebElement credit_type;

	@FindBy(id="cc_exp_month")
	private WebElement Exp_month;

	@FindBy(id="cc_exp_year")
	private WebElement Exp_year;

	@FindBy(id="cc_cvv")
	private WebElement cvv;

	@FindBy(id="book_now")
	private WebElement Book_now;

	@FindBy(id="cancel")
	private WebElement Cancel;

	public String getHotelName()
	{
		return hotelname.getAttribute("value");
	}

	public String getLocation()
	{
		return location.getAttribute("value");
	}

	public String getRoomType()
	{
		return Room_type.getAttribute("value");
	}

	public String getNumberOfRooms()
	{
		return No_Of_Rooms.getAttribute("value");
	}

	public String getTotalDays()
	{
		return total_days.getAttribute("value");
	}

	public String getPrice()
	{
		return price_night.getAttribute("value");
	}

	public String getGst()
	{
		return gst.getAttribute("value");
	}

	public String getFinalPrice()
	{
		return final_price.getAttribute("value");
	}

	public void enterFirstName(String f_name)
	{
		first_name.sendKeys(f_name);
	}

	public void enterLastName(String l_name)
	{
		last_name.sendKeys(l_name);
	}

	public void enterBillingAddress(String billing_name)
	{
		addr.sendKeys(billing_name);
	}

	public void enterCreditCardNumber(String creditcardnumber)
	{
		credit_number.sendKeys(creditcardnumber);
	}

public void SelectCreditCardType(String type)
{
	selectDropDownByText(credit_type, type);
}

public void selectMonth(String month)
{
	selectDropDownByText(Exp_month, month);
}

	public void selectYear(String year)
	{
		selectDropDownByText(Exp_year, year);
	}

	public void selectCvv(String Cvv)
	{
		selectDropDownByText(cvv, Cvv);
	}

	public void clickBookNow()
	{
		clickOnElement(Book_now);
	}

	public void clickCancel()
	{
		clickOnElement(Cancel);
	}

}
