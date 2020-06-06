package clase;

public class Program {

	public static void main(String[] args) {
//		CasaDeMarcat casa = CasaDeMarcat.getInstance();
//		casa.incasareNota(90);
//		System.out.println("casa "+casa.getSuma());
//		CasaDeMarcat casaDeMarcat2 = CasaDeMarcat.getInstance();
//		casaDeMarcat2.incasareNota(100);
//		System.out.println("suma incasare 2 "+ casaDeMarcat2.getSuma());
//		
//		CasaDeMarcatLazy casaLazy;
//		CasaDeMarcatLazy casa2Lazy = CasaDeMarcatLazy.getInstance();
//		casa2Lazy.incasareNota(200);
//		System.out.println("suma " + casa2Lazy.getSuma());
//		casaLazy=CasaDeMarcatLazy.getInstance();
//		casaLazy.incasareNota(123);
//		System.out.println("suma " + casaLazy.getSuma());
		
		
		Manager manager = Manager.getInstanta("Sirius", 5, 20);
		System.out.println(manager.toString());
		Manager manager2 = Manager.getInstanta("ALEX", 20, 12);
		manager2.angajeaza();

		System.out.println(manager2.toString());
		
		
	}

}
