package clase;

public class CasaDeMarcat {
	private double suma;
	private static CasaDeMarcat instanta = new CasaDeMarcat();
	
	private CasaDeMarcat() {
		super();
		this.suma = 0;
	}
	
	public void incasareNota(double suma) {
		this.suma+=suma;
	}
	
	public static CasaDeMarcat getInstance() {
		return instanta;
	}

	public double getSuma() {
		return suma;
	}
	
}
