package b.adapter;

import b.adapter.frameworkachizitionat.SoftBar;

public class Adapter extends SoftBucatarie {
	private SoftBar bar;

	public Adapter(String denumireServiciu, float pretFinal, SoftBar bar) {
		super(denumireServiciu, pretFinal);
		this.bar = bar;
	}

	@Override
	public void afisareNota() {
		this.bar.printeaza();
	}

}
