package clase;

//Flyweight concret
public class Client implements IClient {
	private int numarAsigurare;
	private String nume;

	public Client(int numarAsigurare, String nume) {
		super();
		this.numarAsigurare = numarAsigurare;
		this.nume = nume;
	}

	public int getNumarAsigurare() {
		return numarAsigurare;
	}

	public String getNume() {
		return nume;
	}

	public void setNumarAsigurare(int numarAsigurare) {
		this.numarAsigurare = numarAsigurare;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Client [numarAsigurare=" + numarAsigurare + ", nume=" + nume + "]";
	}

	@Override
	public void printareReteta(Reteta reteta) {
		System.out.println(this.toString() + " are reteta " + reteta.toString());
	}
}
