package factory.clase;

public class FactoryCustomer implements IFactory{

	@Override
	public ICustomer createObject() {
		return new Customer();
	}

}
