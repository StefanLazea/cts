package e.flyweight.program;

import e.flyweight.FlyweightFactory;
import e.flyweight.IFlyweight;
import e.flyweight.Optionale;

public class Program {
	public static void main(String[] args) {
		Optionale op = new Optionale("NV", "rosu-albastru");
		FlyweightFactory factory = new FlyweightFactory();
		IFlyweight persoana = factory.getPersoana("Ionel", 100, 200);
		persoana.descriePersoana(op);
		IFlyweight persoana2 = factory.getPersoana("George", 89, 78);
		persoana2.descriePersoana(op);
		IFlyweight persoana3 = factory.getPersoana("Ionel", 100, 200);
		persoana3.descriePersoana(op);
		
		System.out.println(factory.getNumarPersoane());

	}
}
