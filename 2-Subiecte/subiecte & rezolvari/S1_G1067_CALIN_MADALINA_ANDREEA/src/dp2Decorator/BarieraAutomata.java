package dp2Decorator;


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
	public void avertizareSonora() {
		System.out.println("BIP BIP");
	}

	@Override
	public void aprindeLuminaIntermitenta() {
		System.out.println("Aprindere lumini avertizare");
	}

	@Override
	public void deschideBariera() {
		System.out.println("Deschide bariera prin buton");
	}

	@Override
	public void inchideBariera() {
		System.out.println("Inchidere bariera");
	}
	
	
	
}
