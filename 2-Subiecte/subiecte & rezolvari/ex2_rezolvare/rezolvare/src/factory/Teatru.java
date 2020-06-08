package factory;

import clase.AObiectivTuristic;

public class Teatru extends AObiectivTuristic {

	private TipObiectivTuristic tip;

	public Teatru(String denumire, String adresa, TipObiectivTuristic tip) {
		super(denumire, adresa);
		this.tip = tip;
	}

	@Override
	public String toString() {
		return super.toString() + " Teatru [ tip=" + tip + "]";
	}

	@Override
	public void getInfo() {
		System.out.println(this.toString());
	}

}
