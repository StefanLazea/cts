package factory;

import clase.AObiectivTuristic;

public class Muzeu extends AObiectivTuristic {

	private TipObiectivTuristic tip;

	public Muzeu(String denumire, String adresa, TipObiectivTuristic tip) {
		super(denumire, adresa);
		this.tip = tip;
	}

	@Override
	public String toString() {
		return super.toString() + " Muzeu [ tip=" + tip + "]";
	}

	@Override
	public void getInfo() {
		System.out.println(this.toString());
	}

}
