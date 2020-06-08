package cts.exam.s1.unittesting;

public class NormalTicket {
	String eventName;
	int ticketNumber;

	public NormalTicket(String eventName, int ticketNumber) throws ExceptieGenerala {
		super();
		if (eventName.length() >= 3 && ticketNumber >= 1 && ticketNumber < 999) {
			this.eventName = eventName;
			this.ticketNumber = ticketNumber;
		} else {
			throw new ExceptieGenerala();
		}
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setTicketNumber(int ticketNumber) throws ExceptieGenerala {
		if (ticketNumber >= 1 && ticketNumber < 999) {
			this.ticketNumber = ticketNumber;
		} else {
			throw new ExceptieGenerala();
		}
	}

	public String getEventName() {
		return eventName;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void displayTicket() {
		System.out.println(String.format("It's ticket for {0} with a price of {1}", eventName, ticketNumber));
	}
}
