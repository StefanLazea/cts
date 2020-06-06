package clase.chain;

import clase.Pacient;

public class NotificareManager extends NotificareHandler {

	@Override
	public void notifica(Pacient pacient, String mesaj) {
		System.out.println("Dl Manager, " + pacient.getNume() + " nu a putut fi contactat");
	}

}
