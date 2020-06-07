package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class SalaDeSport implements INotificator {

	private String numeSala;
	private List<IObserver> listaObserveri;

	public SalaDeSport(String numeSala) {
		super();
		this.numeSala = numeSala;
		this.listaObserveri = new ArrayList<IObserver>();
	}

	@Override
	public void adaugaObserver(IObserver observer) {
		this.listaObserveri.add(observer);
	}

	@Override
	public void stergeObserver(IObserver observer) {
		this.listaObserveri.remove(observer);
	}

	@Override
	public void trimiteNotificare(String mesaj) {
		for(IObserver o: this.listaObserveri) {
			o.receptionareMesaj(this.numeSala + " : " + mesaj);
		}
	}
	
	public void notificareMeciFotbal() {
		trimiteNotificare("Se organizeaza un nou meci de fotbal");
	}
	
	public void notificareMeciHandbal() {
		trimiteNotificare("Se organizeaza un nou meci de handbal");
	}

}
