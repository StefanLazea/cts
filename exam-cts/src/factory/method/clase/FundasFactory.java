package factory.method.clase;

public class FundasFactory implements IFactory {

	@Override
	public IJucator createObject() {
		return new Fundas();
	}

}
