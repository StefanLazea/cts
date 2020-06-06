package factory.method.clase;

public class PortarFactory implements IFactory {

	@Override
	public IJucator createObject() {
		return new Portar();
	}

}
