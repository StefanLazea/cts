package S4.G1079.Paraschivescu.Cristian.observer;

public class Service extends Observabil{
	private String nume;
	
	
	public Service(String nume) {
		super();
		this.nume = nume;
	}


	public void sendNotif(String text) {
		this.notifyAllObs(text);
	}
}
