package clase;

public class Medic {
	private String nume;

	public Medic(String nume) {
		super();
		this.nume = nume;
	}

	public void internare(String nume) {
		System.out.println("Medicul " + this.nume + " a internat pacientul " + nume);
	}

	public void tratareImediata(String nume) {
		System.out.println("Medicul " + this.nume + " trateaza pacientul " + nume);
	}
}
