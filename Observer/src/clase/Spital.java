package clase;

import java.util.ArrayList;
import java.util.List;

import clase.chain.NotificareEmail;
import clase.chain.NotificareHandler;
import clase.chain.NotificareManager;
import clase.chain.NotificareSms;

public class Spital implements Notificator {
	private List<Observer> listaObserveri;

	public Spital() {
		super();
		this.listaObserveri = new ArrayList<Observer>();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		this.listaObserveri.add(observer);
	}

	@Override
	public void stergeObserver(int index) {
		this.listaObserveri.remove(index);
	}

	@Override
	public Observer getObserver(int index) {
		return this.listaObserveri.get(index);
	}

	@Override
	public void trimiteNotificare(String mesaj) {
		NotificareHandler notificatorSms = new NotificareSms();
		NotificareHandler notificatorEmail = new NotificareEmail();
		NotificareHandler notificatorManager = new NotificareManager();

		notificatorSms.setUrmatorulNotificator(notificatorEmail);
		notificatorEmail.setUrmatorulNotificator(notificatorManager);

		for (Observer observer : this.listaObserveri) {
			notificatorSms.notifica((Pacient) observer, mesaj);
		}

	}

}
