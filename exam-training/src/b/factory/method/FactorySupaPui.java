package b.factory.method;

public class FactorySupaPui implements IFactory {

	@Override
	public ISupa createSupa() {
		return new SupaPui();
	}

}
