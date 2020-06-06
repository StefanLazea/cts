package facade.clase;

public class Facade {
	public static void verificaPersoana(Persoana p, String serie) {
		Stadion stadion = new Stadion();
		stadion.initBilete();
		
		if (stadion.verificaBilet(p, serie)) {
			if (!Politie.esteUrmarit(p)) {
				if (!AdministratiaStadioanelor.existaAntecedente(p)) {
					System.out.println("Puteti intra pe stadion");
				} else {
					System.out.println("Nu puteti intra pe stadion");
				}
			} else {
				System.out.println("Persoana urmarita");
			}
		}else {
			System.out.println("Biletul nu corespunde");
		}
	}
}
