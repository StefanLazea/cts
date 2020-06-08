package observer.clase;

import factory.clase.ICustomer;

public interface IService {
	public void addObserver(ICustomer observer);
	public void deleteObserver(ICustomer observer);
	public void sendNotification(String message);
}
