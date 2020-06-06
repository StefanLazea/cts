package clase;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		masa.elibereaza();
		masa.rezerva();
		masa.elibereaza();
		masa.ocupa();
		masa.rezerva();
		
		StareOcupata ocupata = new StareOcupata();
		ocupata.schimbareStarea(masa);
		
	}

}
