package program;

import clase.Observer;
import clase.Pacient;
import clase.Spital;

public class Program {

	public static void main(String[] args) {
		Observer pacient1 = new Pacient("Ion");
		Observer pacient2 = new Pacient("Alex", null, "ion@gmail.com");
		Observer pacient3 = new Pacient("Geo", "0748587117", "geo@gmail.com");

		Spital spital = new Spital();
		spital.adaugaObserver(pacient1);
		spital.trimiteNotificare("Stati in casa");
		spital.adaugaObserver(pacient2);
		spital.adaugaObserver(pacient3);
		spital.trimiteNotificare("Totul va fi bine");

	}

}
