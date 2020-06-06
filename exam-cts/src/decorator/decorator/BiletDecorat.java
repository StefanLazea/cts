package decorator.decorator;

import decorator.clase.IBilet;

public class BiletDecorat extends Decorator {

	protected boolean meciAcasa;

	public BiletDecorat(IBilet bilet, boolean meciAcasa) {
		super(bilet);
		this.meciAcasa = meciAcasa;
	}

	@Override
	public void mesajSustinere() {
		if (this.meciAcasa) {
			System.out.println("Fortza Otelu Galati!");
		}
	}

}
