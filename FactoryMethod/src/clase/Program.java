package clase;

public class Program {

	public static void afisareSupa(IFactory factory) {
		ISupa supa = factory.creareSupa();
		supa.descirere();
	}
	
	public static void main(String[] args) {
		afisareSupa(new FactorySupaCiuperci());
		afisareSupa(new FactorySupaLegume());
		afisareSupa(new FactorySupaPui());
	}

}
