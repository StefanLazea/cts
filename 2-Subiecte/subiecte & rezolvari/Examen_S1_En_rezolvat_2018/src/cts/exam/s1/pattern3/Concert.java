package cts.exam.s1.pattern3;

public class Concert extends OlineTicket{
	private TipTicket ticket = TipTicket.CONCERT;
	
	
	public Concert(String eventName, int ticketNumber) {
		super(eventName, ticketNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return ticket.toString();
	}

}
