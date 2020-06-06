package factory.simple.program;

import factory.simple.clase.IJucator;
import factory.simple.clase.JucatorFactory;
import factory.simple.clase.TipJucator;

public class Program {

	public static void main(String[] args) {
		JucatorFactory factory = new JucatorFactory();
		IJucator jucator = factory.antreneaza(TipJucator.Atacant);
		jucator.descrie();
	}

}
