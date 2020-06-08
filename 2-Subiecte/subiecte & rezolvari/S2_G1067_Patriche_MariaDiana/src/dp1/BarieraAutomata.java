package dp1;

public class BarieraAutomata implements IBariera{
	int dimensiuneBariera;
	String culoareLumini;
	String adresaLocatie;
	
	public BarieraAutomata(int dimensiuneBariera, String culoareLumini, String adresaLocatie) {
		this.dimensiuneBariera = dimensiuneBariera;
		this.culoareLumini = culoareLumini;
		this.adresaLocatie = adresaLocatie;
	}

	@Override
	public void deschide(String numeUtilizator) {
		
		System.out.println("Deschide de catre " + numeUtilizator);
	}

	@Override
	public void inchide() {
		System.out.println("Inchidere bariera");
	}
}
