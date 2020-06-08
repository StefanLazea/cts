package factory;

public class Program {

	public static void main(String[] args) {
		Muzeu antipa = (Muzeu) FactoryObiectiv.getObiectiv(TipObiectivTuristic.Muzeu, "Muzeul Antipa",
				"Piata Victoriei");
		antipa.getInfo();
		Teatru evreiesc = (Teatru) FactoryObiectiv.getObiectiv(TipObiectivTuristic.Teatru, "Teatrul Evreiesc de Stat",
				"Strada IuliuBarasch 16");
		evreiesc.getInfo();
	}

}
