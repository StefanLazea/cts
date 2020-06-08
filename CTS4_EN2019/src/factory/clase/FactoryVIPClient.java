package factory.clase;

public class FactoryVIPClient implements IFactory {

	@Override
	public ICustomer createObject() {
		return new VIPClient();
	}

}
