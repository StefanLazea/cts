package state.clase;

public class Loc {
	private int nrLoc;
	private IStare state;

	public Loc(int nrLoc) {
		super();
		this.nrLoc = nrLoc;
		this.state = new StareLibera();
	}

	public int getNrLoc() {
		return nrLoc;
	}

	public IStare getState() {
		return state;
	}

	public void setNrLoc(int nrLoc) {
		this.nrLoc = nrLoc;
	}

	public void setState(IStare state) {
		this.state = state;
	}

	public void rezerva() {
		if (this.state instanceof StareLibera) {
			this.state = new StareLibera();
			this.state.afisareStare(this.nrLoc);
		} else {
			System.out.println("Locul nu a fost rezervat!");
		}
	}

	public void ocupa() {
		if (!(this.state instanceof StareOcupata)) {
			this.state = new StareOcupata();
			this.state.afisareStare(this.nrLoc);
		} else {
			System.out.println("Locul nu a fost ocupat!");
		}
	}

	public void elibereaza() {
		if (!(this.state instanceof StareLibera)) {
			this.state = new StareLibera();
			this.state.afisareStare(this.nrLoc);
		} else {
			System.out.println("Locul deja era liber!");
		}
	}

}
