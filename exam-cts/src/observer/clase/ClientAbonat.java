package observer.clase;

public class ClientAbonat implements IObserver {
	private String nume;
	private String email;
	private String telefon;

	public ClientAbonat(String nume, String email, String telefon) {
		super();
		this.nume = nume;
		this.email = email;
		this.telefon = telefon;
	}

	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println(this.nume + " a receptionat mesajul " + mesaj);
	}

	public String getNume() {
		return nume;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

}
