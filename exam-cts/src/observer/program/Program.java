package observer.program;

import observer.clase.ClientAbonat;
import observer.clase.IObserver;
import observer.clase.SalaDeSport;

public class Program {
	public static void main(String[] args) {
		SalaDeSport sala = new SalaDeSport("Sala polivalenta Cluj");
		IObserver obs1 = new ClientAbonat("Ionut", "ionut@gmail.com", "0738888888");
		sala.adaugaObserver(obs1);
		sala.notificareMeciFotbal();
	}
}
