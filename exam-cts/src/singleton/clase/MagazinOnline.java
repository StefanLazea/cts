package singleton.clase;

public class MagazinOnline {
	private String denumire;
	private int nrProduse;
	private float suma;
	private static MagazinOnline instanta = null;
	
	public MagazinOnline(String denumire, int nrProduse, float suma) {
		super();
		this.denumire = denumire;
		this.nrProduse = nrProduse;
		this.suma = suma;
	}
	
	public void adaugaProduse() {
		this.nrProduse++;
	}
	
	public static synchronized MagazinOnline getInstance(String denumire, int nrProduse, float suma) {
		if(instanta == null) {
			instanta = new MagazinOnline(denumire, nrProduse, suma);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "MagazinOnline [denumire=" + denumire + ", nrProduse=" + nrProduse + ", suma=" + suma + "]";
	}
		
}
