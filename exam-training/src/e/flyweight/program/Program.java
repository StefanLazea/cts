package e.flyweight.program;

import e.flyweight.FlyweightFactory;
import e.flyweight.IFlyweight;
import e.flyweight.Optionale;

public class Program {
	public static void main(String[] args) {
		Optionale op = new Optionale("NV", "rosu-albastru");
		IFlyweight persoana = new FlyweightFactory().getPersoana("Ionel", 100, 200);
		persoana.descriePersoana(op);
		IFlyweight persoana2 = new FlyweightFactory().getPersoana("George", 89, 78);
		persoana2.descriePersoana(op);

	}
}
