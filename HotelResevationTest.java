package com.hotelreservationsystem;

import org.junit.Assert;
import org.junit.Test;


public class HotelResevationTest {

	HotelReservation HR = new HotelReservation();
	
	Hotel hotel1= new Hotel("Lackwood",100);
	Hotel hotel2 = new Hotel("Bridgewood",160);
	Hotel hotel3 = new Hotel("Ridgewood",220);
	@Test
	public void shouldprintHello()
	{
		boolean Welcome = HR.printWelcome();
		Assert.assertEquals(true, Welcome);
	}
}
