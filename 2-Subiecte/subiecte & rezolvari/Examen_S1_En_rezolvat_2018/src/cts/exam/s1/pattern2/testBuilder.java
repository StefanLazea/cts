package cts.exam.s1.pattern2;

import cts.exam.s1.pattern2.Booking.Builder;

public class testBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking booking = new Booking.Builder("Hotel resort").setBedType("pat matrimonial").build();
		Booking booking1 = new Booking.Builder("Hotel resort").setBedType("pat matrimonial").setSeaView(true).build();
		Booking booking2 = new Booking.Builder("Hotel resort").setBedType("pat matrimonial").setNoPers(3).build();

		System.out.println(booking.toString());
		System.out.println(booking1.toString());
		System.out.println(booking2.toString());

	}

}
