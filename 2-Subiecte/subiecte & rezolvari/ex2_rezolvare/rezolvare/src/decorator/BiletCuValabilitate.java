package decorator;

import clase.ABiletIntrare;

public class BiletCuValabilitate extends Decorator {

	private int valabilitate;

	public BiletCuValabilitate(float pret, ABiletIntrare bilet, int valabilitate) {
		super(pret, bilet);
		this.valabilitate = valabilitate;
	}

	@Override
	public float getPret() {
		return super.pret * valabilitate;
	}

}
