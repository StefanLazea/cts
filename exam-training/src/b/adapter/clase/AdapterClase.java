package b.adapter.clase;

import b.adapter.clase.framwork.SoftNou;

public class AdapterClase extends SoftNou implements ISoft {

	public AdapterClase(float suma, int nrProduse) {
		super(suma, nrProduse);
	}

	@Override
	public void vanzare() {
		super.emiteNota();
	}

}
