package b.factory.method;

public class FactorySupaVita implements IFactory {

	@Override
	public ISupa createSupa() {
		return new SupaVita();
	}

}
