package clase;

public class Program {

	public static void main(String[] args) {
		Persoana p = new Persoana("ionel", "1971227030015");
		if(p.getVarsta()>18) {
			if(!Politie.esteUrmarita(p.getCNP())) {
				System.out.println("nu este urmarita");
				if(!Anaf.areDatorii(p.getCNP())) {
					System.out.println("nu are datorii");
					System.out.println("Cont creat");
				}
			}
				
		}
		
		System.out.println("utilizare facade");
		if(Facade.verificaPersoana(p)) {
			System.out.println("cont creat");
		}
		
	}

}
