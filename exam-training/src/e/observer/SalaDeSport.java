package e.observer;

import java.util.ArrayList;
import java.util.List;

public class SalaDeSport implements Notificator {
	private String name;
	private List<Observer> observeri;
	
	
	public SalaDeSport(String name) {
		super();
		this.name = name;
		this.observeri = new ArrayList<Observer>();
	}

	@Override
	public void adaugaObserver(Observer obs) {
		this.observeri.add(obs);
	}

	@Override
	public void stergeObserver(Observer obs) {
		this.observeri.remove(obs);
	}

	@Override
	public void trimiteNotificare(String mesaj) {
		for(Observer obs: this.observeri) {
			obs.receptionareMesaj(mesaj);
		}
	}
	
	public void notificareMeciHandbal() {
		trimiteNotificare("O SA FIE MECI MARE DE HANDBAL");
	}
	
	public void notificareMeciFotbal() {
		trimiteNotificare("Se organizeaza un nou meci de fotbal");
	}
	
	public void notificareMeciVolei() {
		trimiteNotificare("Se organizeaza un nou meci de volei");
	}
	

}
