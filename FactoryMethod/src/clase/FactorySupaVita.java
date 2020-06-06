package clase;

public class FactorySupaVita implements IFactory{

	@Override
	public ISupa creareSupa() {
		// TODO Auto-generated method stub
		return new SupaVita();
	}

}
