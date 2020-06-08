package composite;

import clase.ObiectivTuristic;
import clase.Primarie;

public class Program {

	public static void main(String[] args) {
		Primarie generala = new Primarie("Primaria generala");
		Primarie sector6 = new Primarie("Sector 6");
		Primarie sector3 = new Primarie("Sector 3");

		ObiectivTuristic arculDeTriumf = new ObiectivTuristic("Arcul de triumf", 30, 16);
		ObiectivTuristic teatrulEvreiescDeStat = new ObiectivTuristic("Teatrul Evreiesc de Stat", 20, 16);
		ObiectivTuristic magazinulCora = new ObiectivTuristic("Magazinul Cora", 10, 5);

		sector6.adaugaNod(magazinulCora);
		sector3.adaugaNod(teatrulEvreiescDeStat);
		sector3.adaugaNod(arculDeTriumf);
		generala.adaugaNod(sector3);
		generala.adaugaNod(sector6);

		generala.descriere();
	}

}
