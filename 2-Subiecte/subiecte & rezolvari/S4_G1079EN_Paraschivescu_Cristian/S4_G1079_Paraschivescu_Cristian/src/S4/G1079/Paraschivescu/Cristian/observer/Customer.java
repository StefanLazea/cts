package S4.G1079.Paraschivescu.Cristian.observer;

public class Customer implements IObserver{
	private String name;
	

	public Customer(String name) {
		super();
		this.name = name;
	}


	@Override
	public void act(String problema) {
		System.out.println(this.name + ", you must come to service, the problem is: " + problema);
		
	}

}
