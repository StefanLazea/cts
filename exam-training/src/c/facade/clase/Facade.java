package c.facade.clase;

public class Facade {
	public void verificaClient(Client c) {
		if(Sistem.verificaReteta(c.getCodAsigurare())) {
			if(Cnas.verificareCardSanatate(c.getCodAsigurare())) {
				if(Depozit.verificaDisponibilitate(c.getDenumireMedicament())) {
					System.out.println("Ura, ia vicodin!");
				}else {
					System.out.println("Nu exista medicamentul pe stoc");
				}
			}else {
				System.out.println("Nu esti asigurat");
			}
		}else {
			System.out.println("Nu exista reteta");
		}
	}
}
