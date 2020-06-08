package cts.exam.s1.pattern3;

public class testFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OlineTicket olineTicket = SimpleFactory.genereazaTicket(TipTicket.EVENIMENT, "Neversea", 1);
		OlineTicket olineTicket1 = SimpleFactory.genereazaTicket(TipTicket.MUZEU, "Antipa", 1);
		OlineTicket olineTicket2 = SimpleFactory.genereazaTicket(TipTicket.CONCERT, "Cargo", 1);

		olineTicket.displayTicket();
		olineTicket1.displayTicket();
		olineTicket2.displayTicket();
	}

}
