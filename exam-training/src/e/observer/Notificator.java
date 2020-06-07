package e.observer;

public interface Notificator {
	public void adaugaObserver(Observer obs);

	public void stergeObserver(Observer obs);

	public void trimiteNotificare(String mesaj);

}
