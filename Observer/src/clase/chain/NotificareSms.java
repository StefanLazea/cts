package clase.chain;

import clase.Pacient;

public class NotificareSms extends NotificareHandler {

	@Override
	public void notifica(Pacient pacient, String mesaj) {
		if (pacient.getNrTelefon() != null) {
			pacient.notificareMesaj("sms " + mesaj);
		} else {
			super.getUrmatorulNotificator().notifica(pacient, mesaj);
		}
	}

}
