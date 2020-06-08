package factory.clase;

public class Customer implements ICustomer {

	@Override
	public void printCustomer() {
		System.out.println("Me a simple customer");
	}

	@Override
	public void recieveMessage(String message) {
		System.out.println("Customer recieved " + message);		
	}

}
