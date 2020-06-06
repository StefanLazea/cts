package clase;

public class FactorySupaPui implements IFactory{

	@Override
	public ISupa creareSupa() {
		// TODO Auto-generated method stub
		return new SupaPui();
	}

}
