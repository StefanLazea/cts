package cts.exam.s1.pattern3;

public class Eveniment extends OlineTicket{
	private TipTicket ticket = TipTicket.EVENIMENT;
	
	public Eveniment(String eventName, int ticketNumber) {
		super(eventName, ticketNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return ticket.toString();
	}

}
