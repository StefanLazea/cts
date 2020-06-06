package clase.framework_achizitionat;

public class CreditLeasing {
	public float pretProdus;
	public Integer nrLuniRestituire;

	public CreditLeasing(float pretProdus, Integer nrLuniRestituire) {
		super();
		this.pretProdus = pretProdus;
		this.nrLuniRestituire = nrLuniRestituire;
	}

	public void oferaLeasing() {
		System.out.println("A fost achizitionat produs la pret de " + this.pretProdus);
	}

	public float calculareSumaLunara() {
		return this.pretProdus / this.nrLuniRestituire;
	}
}
