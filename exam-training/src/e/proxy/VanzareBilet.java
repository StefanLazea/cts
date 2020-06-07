package e.proxy;

public class VanzareBilet implements IVanzareBilet {
	private int varsta;

	public VanzareBilet(int varsta) {
		super();
		this.varsta = varsta;
	}

	@Override
	public void vanzare() {
		System.out.println("Bilet vandut pentru suporterul cu varsta " + varsta);
	}

	public int getVarsta() {
		return varsta;
	}

}
