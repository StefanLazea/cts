package proxy.clase;

public class ProxyBilet implements IVanzare {
	private VanzareBilet bilet;

	public ProxyBilet(VanzareBilet bilet) {
		super();
		this.bilet = bilet;
	}

	public ProxyBilet(Persoana pers) {
		super();
		this.bilet = new VanzareBilet(pers);
	}

	@Override
	public void descriere() {
		this.bilet.descriere();
	}

	@Override
	public void vanzareBilet() {
		if (bilet.getPersoana().getVarsta() > 14) {
			this.bilet.vanzareBilet();
		} else {
			System.out.println("Vanzarea nu este permisa persoanelor sub varsta de 14 ani."
					+ " Iar persoana de fata are " + this.bilet.getPersoana().getVarsta());
		}
	}

}
