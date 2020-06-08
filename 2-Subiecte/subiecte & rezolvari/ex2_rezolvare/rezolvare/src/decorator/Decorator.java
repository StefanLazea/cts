package decorator;

import clase.ABiletIntrare;

public abstract class Decorator extends ABiletIntrare {

	private ABiletIntrare bilet;

	public Decorator(float pret, ABiletIntrare bilet) {
		super(pret);
		this.bilet = bilet;
	}

	@Override
	public float getPret() {
		return bilet.getPret();
	}

}
