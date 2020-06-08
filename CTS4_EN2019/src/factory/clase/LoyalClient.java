package factory.clase;

public class LoyalClient implements ICustomer{

	@Override
	public void recieveMessage(String message) {
		System.out.println("Loyal customer recieved " + message);		
	}

	@Override
	public void printCustomer() {
		System.out.println("I m a loyal customer");
	}

}
