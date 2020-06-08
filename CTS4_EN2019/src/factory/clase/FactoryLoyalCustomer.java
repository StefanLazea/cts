package factory.clase;

public class FactoryLoyalCustomer implements IFactory{

	@Override
	public ICustomer createObject() {
		return new LoyalClient();
	}

}
