package adapter.clase;

import adapter.ebilet.Ebilet;

public class AdapterAplicatie implements IAplicatieBilete {
	private Ebilet ebilet;

	public AdapterAplicatie(Ebilet ebilet) {
		this.ebilet = ebilet;
	}

	@Override
	public void rezervareBilet() {
		this.ebilet.rezervaLoc(this.ebilet.getNrLoc());
	}

	@Override
	public void vanzareBilet() {
		this.ebilet.vanzareBilet(this.ebilet.getNrLoc(), this.ebilet.getIncasari());
	}

}
