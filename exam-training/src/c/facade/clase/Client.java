package c.facade.clase;

public class Client {
	private int codAsigurare;
	private String denumireMedicament;

	public Client(int codAsigurare, String denumireMedicament) {
		super();
		this.codAsigurare = codAsigurare;
		this.denumireMedicament = denumireMedicament;
	}

	public int getCodAsigurare() {
		return codAsigurare;
	}

	public String getDenumireMedicament() {
		return denumireMedicament;
	}

	public void setCodAsigurare(int codAsigurare) {
		this.codAsigurare = codAsigurare;
	}

	public void setDenumireMedicament(String denumireMedicament) {
		this.denumireMedicament = denumireMedicament;
	}

}
