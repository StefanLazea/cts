package boja.clase;

public class SimpleFactorySingleton {
	private String denumire;
	private String adresa;
	private static int CONTOR = 0;

	private static SimpleFactorySingleton instanta;

	private SimpleFactorySingleton(String denumire, String adresa) {
		super();
		this.denumire = denumire;
		this.adresa = adresa;
	}

	public static synchronized SimpleFactorySingleton getInstance(String denumire, String adresa) {
		if (instanta == null) {
			instanta = new SimpleFactorySingleton(denumire, adresa);
		}
		return instanta;
	}
	
	public ContBancar creazaContBancar(String tip, double suma) {
		switch (tip) {
		case "ContDebit":
			CONTOR++;
			return new ContDebit(suma);
		case "ContCredit":
			CONTOR++;
			return new ContCredit(suma);
		default:
			return null;
		}
	}
}
