package observer.clase;

import java.util.ArrayList;
import java.util.List;

import factory.clase.ICustomer;

public class ServiceAuto implements IService {

	private String location;
	private List<ICustomer> observers;

	public ServiceAuto(String location) {
		super();
		this.location = location;
		this.observers = new ArrayList<ICustomer>();
	}

	@Override
	public void addObserver(ICustomer observer) {
		this.observers.add(observer);
	}

	@Override
	public void deleteObserver(ICustomer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void sendNotification(String message) {
		for (ICustomer cust : this.observers) {
			cust.recieveMessage(message);
		}
	}

	public void notifyForMajorProblem() {
		this.sendNotification("A major problem has occur");
	}

	public void notifyAd() {
		this.sendNotification("This is a paid add. Come to our shop");
	}

}
