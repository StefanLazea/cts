package b.factory.method.program;

import b.factory.method.FactorySupaPui;
import b.factory.method.FactorySupaVita;
import b.factory.method.IFactory;
import b.factory.method.ISupa;

public class Program {
	public static void descriere(IFactory factory) {
		ISupa supa = factory.createSupa();
		supa.descriere();
	}
	public static void main(String[] args) {
		descriere(new FactorySupaPui());
		descriere(new FactorySupaVita());
	}

}
