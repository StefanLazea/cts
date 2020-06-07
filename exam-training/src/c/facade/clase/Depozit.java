package c.facade.clase;

public class Depozit {
	public static boolean verificaDisponibilitate(String medicament) {
		return medicament.length() % 2 == 1;
	}
}
