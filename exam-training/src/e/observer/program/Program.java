package e.observer.program;

import e.observer.ClientFidel;
import e.observer.Observer;
import e.observer.SalaDeSport;

public class Program {

	public static void main(String[] args) {
		
		Observer obs = new ClientFidel("Gigi");
		SalaDeSport sala = new SalaDeSport("Sala Polivalenta");
		sala.adaugaObserver(obs);
		Observer obs2 = new ClientFidel("Meme");
		sala.adaugaObserver(obs2);
		
		sala.notificareMeciFotbal();
	}

}
