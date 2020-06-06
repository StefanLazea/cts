package adapter.clase;

public class AplicatieBilete implements IAplicatieBilete {
	private int nrBilet;
	private float incasari;
	
	
	public AplicatieBilete(int nrBilet, float incasari) {
		super();
		this.nrBilet = nrBilet;
		this.incasari = incasari;
	}

	@Override
	public void rezervareBilet() {
		System.out.println("S-a rezervat biletul cu numarul " + this.nrBilet);
	}

	@Override
	public void vanzareBilet() {
		System.out.println("S-a vandut biletul cu nr " + this.nrBilet + " in valoare de " + this.incasari);
	}

}
