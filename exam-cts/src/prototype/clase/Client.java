package prototype.clase;

public class Client {
	private String nume;
	private String numarTelefon;

	public Client(String nume, String numarTelefon) {
		super();
		this.nume = nume;
		this.numarTelefon = numarTelefon;
	}

	public String getNumarTelefon() {
		return numarTelefon;
	}

	public void setNumarTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", numarTelefon=" + numarTelefon + "]";
	}

}
