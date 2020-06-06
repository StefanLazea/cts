package clase;

import clase.framework_achizitionat.CreditLeasing;

public class AdapterCredit implements ICredit {
	private CreditLeasing creditLeasing;

	public AdapterCredit(CreditLeasing creditLeasing) {
		super();
		this.creditLeasing = creditLeasing;
	}

	@Override
	public void oferaCredit() {
		this.creditLeasing.oferaLeasing();
	}

	@Override
	public float rataLunara() {
		return this.creditLeasing.calculareSumaLunara();
	}

}
