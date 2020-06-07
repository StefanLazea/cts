package e.proxy;

public class ProxyBilet implements IVanzareBilet {

	private VanzareBilet bilet;

	public ProxyBilet(VanzareBilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vanzare() {
		if (this.bilet.getVarsta() > 14) {
			this.bilet.vanzare();
		}else {
			System.out.println("Vino cu ma-ta!");
		}
	}

}
