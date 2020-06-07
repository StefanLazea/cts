package b.adapter.clase.framwork;

public class SoftNou {
	private float suma;
	private int nrProduse;

	public SoftNou(float suma, int nrProduse) {
		super();
		this.suma = suma;
		this.nrProduse = nrProduse;
	}

	public void emiteNota() {
		System.out.println("Am emis nota de pe softul nou avand totatlul" + this.suma);
	}

}
