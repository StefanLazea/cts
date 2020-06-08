package dp1;

public class Singleton {
	int dimensiuneBariera;
	String culoareLumini;
	String adresaLocatie;
	
	
	static int DIMENSIUNE_BARIERA;
	static String CULOARE_LUMINI;
	static String ADRESA_LOCATIIE;
	
	private static Singleton barieraUnica = null;
	
	private Singleton(int dimensiuneBariera, String culoareLumini, String adresaLocatie) {
		this.dimensiuneBariera = DIMENSIUNE_BARIERA;
		this.culoareLumini = CULOARE_LUMINI;
		this.adresaLocatie = ADRESA_LOCATIIE;
	}
	
	public static synchronized Singleton getBariera() {
		if(barieraUnica == null)
			barieraUnica = new Singleton(10, "rosu", "Mall vitan");
		return barieraUnica;
	}
}
