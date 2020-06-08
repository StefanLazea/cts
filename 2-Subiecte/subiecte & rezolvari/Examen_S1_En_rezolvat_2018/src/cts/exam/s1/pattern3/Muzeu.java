package cts.exam.s1.pattern3;

public class Muzeu extends OlineTicket{
	private TipTicket ticket = TipTicket.MUZEU;

	public Muzeu(String eventName, int ticketNumber) {
		super(eventName, ticketNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return ticket.toString();
	}

}
