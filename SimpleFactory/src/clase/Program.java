package clase;

public class Program {
	public static void afisareSupa(ISupa supa) {
		supa.descirere();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleFactory factory = new SimpleFactory();
		ISupa supa  = factory.creareSupa(TipSupa.SupaCiuperci);
		afisareSupa(supa);
		afisareSupa(factory.creareSupa(TipSupa.SupaLegume));
	}

}
