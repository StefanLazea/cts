package clase;

public class Pacient implements Observer {
	private String nume;
	private String nrTelefon;
	private String email;

	public Pacient(String nume) {
		super();
		this.nume = nume;
		this.email = null;
		this.nrTelefon = null;
	}

	public Pacient(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	@Override
	public void notificareMesaj(String mesaj) {
		System.out.println(this.nume + " ai primit mesajul " + mesaj);
	}

	@Override
	public String getNume() {
		return this.nume;
	}

	@Override
	public String getNrTelefon() {
		return this.nrTelefon;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

}
