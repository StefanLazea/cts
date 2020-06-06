package clase.chain;

import clase.Pacient;

public abstract class NotificareHandler {
	private NotificareHandler urmatorulNotificator;

	public NotificareHandler getUrmatorulNotificator() {
		return urmatorulNotificator;
	}

	public void setUrmatorulNotificator(NotificareHandler urmatorulNotificator) {
		this.urmatorulNotificator = urmatorulNotificator;
	}

	public abstract void notifica(Pacient pacient, String mesaj);

}
