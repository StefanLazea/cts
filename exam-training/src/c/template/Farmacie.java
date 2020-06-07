package c.template;

public class Farmacie extends FarmacieTemplate {

	@Override
	public void primireReteta() {
		System.out.println("S-a primit reteta");
	}

	@Override
	public void aducereMedicamente() {
		System.out.println("S-au adus medicamente");
	}

	@Override
	public void incasareBani() {
		System.out.println("S-au incasat banii");
	}

	@Override
	public void emitereBon() {
		System.out.println("S-a emis bonul");

	}

}
