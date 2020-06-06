package clase;

import clase.framework_achizitionat.CreditLeasing;

public class AdapterCreditClase extends CreditLeasing implements ICredit{

	public AdapterCreditClase(float pretProdus, Integer nrLuniRestituire) {
		super(pretProdus, nrLuniRestituire);
	}

	@Override
	public void oferaCredit() {
		super.oferaLeasing();
	}

	@Override
	public float rataLunara() {
		return super.calculareSumaLunara();
	}

}
