package clase;

public class FactorySupaLegume implements IFactory{

	@Override
	public ISupa creareSupa() {
		// TODO Auto-generated method stub
		return new SupaLegume();
	}
	
}
