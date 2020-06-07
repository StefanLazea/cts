package boja.clase;

public interface ContBancar {
	public void transfer(ContBancar contDestinatie, double suma);
	public void depune(double suma);
}
