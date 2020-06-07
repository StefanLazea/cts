package b.factory.method;

public class FactorySupaLegume implements IFactory {

	@Override
	public ISupa createSupa() {
		return new SupaLegume();
	}

}
