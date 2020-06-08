package S4.G1079.Paraschivescu.Cristian.observer;

public class testObserver {

	public static void main(String[] args) {
		Service service = new Service("Service Romana");
		
		Customer c1 = new Customer("Ion");
		Customer c2 = new Customer("Mihai");
		Customer c3 = new Customer("Bogdan");
		
		service.addObserver(c1);
		service.addObserver(c2);
		service.addObserver(c3);
		
		service.sendNotif("Bad component must be swaped");
		service.sendNotif("We are testing the notification system");
	}

}
