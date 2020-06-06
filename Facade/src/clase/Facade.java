package clase;

public class Facade {
	public static boolean verificaPersoana(Persoana p) {
		if(p.getVarsta()>18) {
			if(!Politie.esteUrmarita(p.getCNP())) {
				if(!Anaf.areDatorii(p.getCNP())) {
					return true;
				}
			}	
		}
		return false;
	}
}
