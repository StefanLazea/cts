package clase;

public interface Observer {
	void notificareMesaj(String mesaj);

	//chain
	String getNume();

	String getNrTelefon();

	String getEmail();
}
