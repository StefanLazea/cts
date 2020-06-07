package state.clase;

public class StareOcupata implements IStare {

	@Override
	public void doAction(Loc loc) {
		loc.setState(this);
	}

	@Override
	public void afisareStare(int nrLoc) {
		System.out.println("Locul " + nrLoc + " este ocupat.");
	}

}
