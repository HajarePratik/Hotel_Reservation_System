package com.hotelreservationsystem;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;


public class HotelResevationTest 
{

	HotelReservation HR = new HotelReservation();
	ArrayList<Hotel> hotelList = new ArrayList<>(); 	// Initallizing a Arraylist for Adding Value 
	
	Hotel hotel1= new Hotel("Lackwood",100);
	Hotel hotel2 = new Hotel("Bridgewood",160);
	Hotel hotel3 = new Hotel("Ridgewood",220);
	 
	// Create a method for adding Hotel
	@Test
	public void addhotel()
	{
		boolean Welcome = HR.printWelcome();
		hotelList.add(hotel1);
		hotelList.add(hotel2);
		hotelList.add(hotel3);
		Assert.assertEquals(true, Welcome);
	}
		
}
