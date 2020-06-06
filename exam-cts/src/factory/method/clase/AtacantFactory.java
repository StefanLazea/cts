package factory.method.clase;

public class AtacantFactory implements IFactory {

	@Override
	public IJucator createObject() {
		return new Atacant();
	}

}
