package clase;

public class Politie {
	public static boolean esteUrmarita(String cnp) {
		return cnp.charAt(12) % 2 == 0;
	}
}
