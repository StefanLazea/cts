package clase;

public interface Notificator {
	public void adaugaObserver(Observer observer);
	public void stergeObserver(int index);
	public Observer getObserver(int index);
	public void trimiteNotificare(String mesaj);
}
