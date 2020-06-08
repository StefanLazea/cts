package decorator;

import clase.ABiletIntrare;

public class BiletcuGhid extends ABiletIntrare {

	public BiletcuGhid(float pret) {
		super(pret);
	}

	@Override
	public float getPret() {
		return super.pret;
	}

}
