package observer.clase;

public interface INotificator {
	void adaugaObserver(IObserver observer);

	void stergeObserver(IObserver observer);

	void trimiteNotificare(String mesaj);
}
