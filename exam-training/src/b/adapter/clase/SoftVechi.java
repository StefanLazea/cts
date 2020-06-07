package b.adapter.clase;

public class SoftVechi implements ISoft {
	private String nume;
	private int nrProduse;

	@Override
	public void vanzare() {
		System.out.println("Am vandut");
	}

	public SoftVechi(String nume, int nrProduse) {
		super();
		this.nume = nume;
		this.nrProduse = nrProduse;
	}

}
