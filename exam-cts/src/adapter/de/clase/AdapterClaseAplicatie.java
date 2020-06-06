package adapter.de.clase;

import adapter.clase.IAplicatieBilete;
import adapter.ebilet.Ebilet;

public class AdapterClaseAplicatie extends Ebilet implements IAplicatieBilete {
		
	public AdapterClaseAplicatie(int nrLoc, float incasari) {
		super(nrLoc, incasari);
	}

	@Override
	public void rezervareBilet() {
		super.rezervaLoc(super.getNrLoc());
	}

	@Override
	public void vanzareBilet() {
		super.vanzareBilet(super.getNrLoc(), super.getIncasari());
	}

}
