package clase;

public abstract class Angajator {
	private Angajator nextAngajator;

	public void setNextAngajator(Angajator nextAngajator) {
		this.nextAngajator = nextAngajator;
	}

	public Angajator getNextAngajator() {
		return nextAngajator;
	}

	public abstract void angajare(Candidat candidat);
}
