package clase;

public abstract class AObiectivTuristic {
	private String denumire;
	private String adresa;

	public AObiectivTuristic(String denumire, String adresa) {
		super();
		this.denumire = denumire;
		this.adresa = adresa;
	}

	@Override
	public String toString() {
		return "AObiectivTuristic [denumire=" + denumire + ", adresa=" + adresa + "]";
	}

	public abstract void getInfo();
}
