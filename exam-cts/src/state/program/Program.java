package state.program;

import state.clase.IStare;
import state.clase.Loc;
import state.clase.StareOcupata;

public class Program {

	public static void main(String[] args) {
		Loc loc = new Loc(2);
		loc.rezerva();
		loc.ocupa();
		loc.rezerva();
		loc.elibereaza();

		IStare stare = new StareOcupata();
		stare.doAction(loc);
		stare.afisareStare(loc.getNrLoc());
	}

}
