package dp2;

public class BarieraInteligenta {
	int dimensiuneBariera;
	int inaltimeBariera;
	String culoareLumini;
	String adresaLocatie;
	boolean areSenzorMiscare;
	boolean areGPS;
	boolean permiteControlDistanta;
	boolean areCamereCCTV;
	
	private BarieraInteligenta() {
		
	}

	public BarieraInteligenta(int dimensiuneBariera, int inaltimeBariera, String culoareLumini, String adresaLocatie,
			boolean areSenzorMiscare, boolean areGPS, boolean permiteControlDistanta, boolean areCamereCCTV) {
		super();
		this.dimensiuneBariera = dimensiuneBariera;
		this.inaltimeBariera = inaltimeBariera;
		this.culoareLumini = culoareLumini;
		this.adresaLocatie = adresaLocatie;
		this.areSenzorMiscare = areSenzorMiscare;
		this.areGPS = areGPS;
		this.permiteControlDistanta = permiteControlDistanta;
		this.areCamereCCTV = areCamereCCTV;
	}

	public int getDimensiuneBariera() {
		return dimensiuneBariera;
	}

	private void setDimensiuneBariera(int dimensiuneBariera) {
		this.dimensiuneBariera = dimensiuneBariera;
	}

	public int getInaltimeBariera() {
		return inaltimeBariera;
	}

	private void setInaltimeBariera(int inaltimeBariera) {
		this.inaltimeBariera = inaltimeBariera;
	}

	public String getCuloareLumini() {
		return culoareLumini;
	}

	private void setCuloareLumini(String culoareLumini) {
		this.culoareLumini = culoareLumini;
	}

	public String getAdresaLocatie() {
		return adresaLocatie;
	}

	private void setAdresaLocatie(String adresaLocatie) {
		this.adresaLocatie = adresaLocatie;
	}

	public boolean isAreSenzorMiscare() {
		return areSenzorMiscare;
	}

	private void setAreSenzorMiscare(boolean areSenzorMiscare) {
		this.areSenzorMiscare = areSenzorMiscare;
	}

	public boolean isAreGPS() {
		return areGPS;
	}

	private void setAreGPS(boolean areGPS) {
		this.areGPS = areGPS;
	}

	public boolean isPermiteControlDistanta() {
		return permiteControlDistanta;
	}

	private void setPermiteControlDistanta(boolean permiteControlDistanta) {
		this.permiteControlDistanta = permiteControlDistanta;
	}

	public boolean isAreCamereCCTV() {
		return areCamereCCTV;
	}

	private void setAreCamereCCTV(boolean areCamereCCTV) {
		this.areCamereCCTV = areCamereCCTV;
	}
	
	@Override
	public String toString() {
		return "BarieraInteligenta [dimensiuneBariera=" + dimensiuneBariera + ", inaltimeBariera=" + inaltimeBariera
				+ ", culoareLumini=" + culoareLumini + ", adresaLocatie=" + adresaLocatie + ", areSenzorMiscare="
				+ areSenzorMiscare + ", areGPS=" + areGPS + ", permiteControlDistanta=" + permiteControlDistanta
				+ ", areCamereCCTV=" + areCamereCCTV + "]";
	}

	public static class BarieraInteligentaBuilder
	{
		private BarieraInteligenta bariera;
		
		public BarieraInteligentaBuilder(int dimensiuneBariera,String adresaLocatie,boolean areSenzorMiscare)
		{
			bariera = new BarieraInteligenta();
			bariera.setDimensiuneBariera(dimensiuneBariera);
			bariera.setAdresaLocatie(adresaLocatie);
			bariera.setAreSenzorMiscare(areSenzorMiscare);
		}
		
		public BarieraInteligentaBuilder permiteControlDistanta()
		{
			bariera.setPermiteControlDistanta(true);
			return this;
		}
		
		public BarieraInteligenta build()
		{
			return this.bariera;
		}
		
	}
	
}
