package clase.chain;

import clase.Pacient;

public class NotificareEmail extends NotificareHandler {

	@Override
	public void notifica(Pacient pacient, String mesaj) {
		if (pacient.getEmail() != null) {
			pacient.notificareMesaj("email " + mesaj);
		} else {
			super.getUrmatorulNotificator().notifica(pacient, mesaj);
		}
	}

}
