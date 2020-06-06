package decorator.program;

import decorator.clase.Bilet;
import decorator.clase.IBilet;
import decorator.decorator.BiletDecorat;
import decorator.decorator.Decorator;

public class Program {

	public static void main(String[] args) {
		IBilet bilet = new Bilet("az12");

		bilet.printeazaBilet();

		Decorator decoratorBilet = new BiletDecorat(bilet, true);
		decoratorBilet.mesajSustinere();
		decoratorBilet.printeazaBilet();

	}

}
