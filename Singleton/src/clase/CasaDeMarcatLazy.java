package clase;

public class CasaDeMarcatLazy {
	private double suma;
	private static CasaDeMarcatLazy instanta = null;
	
	private CasaDeMarcatLazy() { 
		super();
		this.suma = 0;
	}
	
	public void incasareNota(double suma) {
		this.suma+=suma;
	}
	
	public static synchronized CasaDeMarcatLazy getInstance() {
		if(instanta == null) {
			instanta = new CasaDeMarcatLazy();
		}
		return instanta;
	}

	public double getSuma() {
		return suma;
	}

}
