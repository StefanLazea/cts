package factory.method.program;

import factory.method.clase.AtacantFactory;
import factory.method.clase.FundasFactory;
import factory.method.clase.IFactory;
import factory.method.clase.IJucator;
import factory.method.clase.PortarFactory;

public class Program {

	public static void afisare(IFactory factory) {
		IJucator jucator = factory.createObject();
		jucator.descriere();
	}

	public static void main(String[] args) {
		afisare(new AtacantFactory());
		afisare(new FundasFactory());
		afisare(new PortarFactory());
	}

}
