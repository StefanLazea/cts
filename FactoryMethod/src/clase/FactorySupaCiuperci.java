package clase;

public class FactorySupaCiuperci implements IFactory {

	@Override
	public ISupa creareSupa() {
		// TODO Auto-generated method stub
		return new SupaCiuperci();
	}

}
