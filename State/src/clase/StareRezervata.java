package clase;

public class StareRezervata implements IStare {

	@Override
	public void schimbareStarea(Masa masa) {
		masa.setStare(this);
	}

	@Override
	public void afisareStare(int nrMasa) {
		System.out.println("Masa " +nrMasa + " este rezervata");
	}

}
