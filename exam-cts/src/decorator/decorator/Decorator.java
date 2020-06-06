package decorator.decorator;

import decorator.clase.IBilet;

public abstract class Decorator implements IBilet {

	protected IBilet bilet;
	
	public Decorator(IBilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void printeazaBilet() {
		this.bilet.printeazaBilet();
	}

	public abstract void mesajSustinere();
}
