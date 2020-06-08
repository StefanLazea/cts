package factory.clase;

public class VIPClient implements ICustomer {

	@Override
	public void printCustomer() {
		System.out.println("Vip client");
	}
	@Override
	public void recieveMessage(String message) {
		System.out.println("VIP customer recieved " + message);		
	}
}
