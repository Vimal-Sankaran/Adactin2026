package com.adactin.pages;

import com.adactin.utitlities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {

	public WebDriver driver;
	

	public SearchPage(WebDriver driverr) {
		this.driver=driverr;
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement Hotels;

	@FindBy(id="room_type")
	private WebElement Room_type;

	@FindBy(id="room_nos")
	private WebElement Number_of_rooms;

	@FindBy(id="datepick_in")
	private WebElement check_in_date;

	@FindBy(id="datepick_out")
	private WebElement Check_out_date;

	@FindBy(id="adult_room")
	private WebElement Adults_per_room;

	@FindBy(id="child_room")
	private WebElement Child_room;

	@FindBy(id="Submit")
	private WebElement submit;

	@FindBy(id="Reset")
	private WebElement reset;

	public void selectLocation(String locationValue) {
		selectDropDownByText(location, locationValue);
	}
		public void selectHotel(String hotelName)
		{
			selectDropDownByText(Hotels, hotelName);

		}

		public void selectRoomType(String room_type)
		{
			selectDropDownByText(Room_type, room_type);

		}

		public void selectNumberOfRooms(String noOfRooms)
		{
			selectDropDownByText(Number_of_rooms, noOfRooms);

		}

		public void selectCheckInDate(String checkIn)
		{
			selectDropDownByText(check_in_date, checkIn);

		}

		public void selectCheckOutDate(String checkOut)
		{
			selectDropDownByText(Check_out_date, checkOut);

		}

		public void selectAdultsPerRoom(String adultsPerRoom)
		{
			selectDropDownByText(Adults_per_room, adultsPerRoom);

		}

		public void selectChildrenPerRoom(String cildrenPerRoom)
		{
			selectDropDownByText(Child_room, cildrenPerRoom);

		}

		public void clickSearch()
		{
			clickOnElement(submit);
		}

	public void clickReset()
	{
		clickOnElement(reset);
	}

	}
