package boja.clase;

public class ContCredit implements ContBancar {
	private double suma;

	public ContCredit(double suma) {
		super();
		this.suma = suma;
	}

	@Override
	public void transfer(ContBancar contDestinatie, double suma) {
		contDestinatie.depune(suma);
		this.suma -= suma;
	}

	@Override
	public void depune(double suma) {
		this.suma += suma;
	}

	@Override
	public String toString() {
		return "ContCredit [suma=" + suma + "]";
	}
	

}
