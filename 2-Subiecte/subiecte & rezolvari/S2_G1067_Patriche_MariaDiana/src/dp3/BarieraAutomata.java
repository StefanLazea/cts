package dp3;

public class BarieraAutomata implements IBariera {
	int dimensiuneBariera;
	String culoareLumini;
	String adresaLocatie;
	
	private boolean barieraDeschisa = false;
	private Executant executant;
	
	
	public boolean isBarieraDeschisa() {
		return barieraDeschisa;
	}

	public void setBarieraDeschisa() {
		if(barieraDeschisa==false)
		{
			barieraDeschisa = true;
			this.executant.deschidePoarta();
		}
		else
			barieraDeschisa = false;
	}
	
		
	public Executant getExecutant() {
		return executant;
	}

	public void setExecutant(Executant executant) {
		this.executant = executant;
	}

	@Override
	public String toString() {
		return "BarieraAutomata [dimensiuneBariera=" + dimensiuneBariera + ", culoareLumini=" + culoareLumini
				+ ", adresaLocatie=" + adresaLocatie + ", barieraDeschisa=" + barieraDeschisa + ", executant=";
	}

	public BarieraAutomata(int dimensiuneBariera, String culoareLumini, String adresaLocatie) {
		this.dimensiuneBariera = dimensiuneBariera;
		this.culoareLumini = culoareLumini;
		this.adresaLocatie = adresaLocatie;
	}

	@Override
	public void deschide(String numeUtilizator) {
		//System.out.println("nume executant: " + executant.getNumeExecutant());
		executant.deschidePoarta();
		System.out.println("Deschisa de catre " + numeUtilizator);
	}

	@Override
	public void inchide() {
		System.out.println("Inchidere bariera");
	}
}
