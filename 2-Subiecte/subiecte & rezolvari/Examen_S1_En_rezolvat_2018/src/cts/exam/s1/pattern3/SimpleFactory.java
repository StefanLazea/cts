package cts.exam.s1.pattern3;

public class SimpleFactory {
	public static OlineTicket genereazaTicket(TipTicket ticket, String nume, int numar) {
		OlineTicket olineTicket = null;

		switch (ticket) {
		case EVENIMENT:
			olineTicket = new Eveniment(nume, numar);
			break;
		case CONCERT:
			olineTicket = new Concert(nume, numar);
			break;
		case MUZEU:
			olineTicket = new Muzeu(nume, numar);
			break;
		}
		return olineTicket;
	}
}
