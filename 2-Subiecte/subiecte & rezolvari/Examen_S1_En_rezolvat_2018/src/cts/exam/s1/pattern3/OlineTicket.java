package cts.exam.s1.pattern3;

public abstract class OlineTicket {
	String eventName;
	int ticketNumber;

	public OlineTicket(String eventName, int ticketNumber) {
		super();
		this.eventName = eventName;
		this.ticketNumber = ticketNumber;
	}

	public abstract String getType();

	public void displayTicket() {
		System.out.println(String.format(
				"It's a " + this.getType() + " type ticket for " + eventName + " with a price of " + ticketNumber));
	}
}
