package facade.program;

import facade.clase.Facade;
import facade.clase.Persoana;

public class Program {
	public static void main(String[] args) {
		Persoana pers = new Persoana("AZ0001", "Ion");

		Facade.verificaPersoana(pers, "A11");

	}
}
