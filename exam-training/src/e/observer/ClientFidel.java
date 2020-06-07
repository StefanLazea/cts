package e.observer;

public class ClientFidel implements Observer {

	private String nume;

	public ClientFidel(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println(this.nume + " a primit mesajul " + mesaj);
	}

}
