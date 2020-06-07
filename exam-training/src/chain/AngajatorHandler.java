package chain;

public abstract class AngajatorHandler {
	private AngajatorHandler nextAngajator;

	public AngajatorHandler getNextAngajator() {
		return nextAngajator;
	}

	public void setNextAngajator(AngajatorHandler nextAngajator) {
		this.nextAngajator = nextAngajator;
	}
	
	public abstract void angajeaza(Candidat candidat);
}
