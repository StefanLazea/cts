package clase;

public class Spital implements ISpital {
	
	@Override
	public void descriere() {
		System.out.println("Matei Bals");
	}

	@Override
	public void interneaza(Pacient p) {
		System.out.println(p.getNume() + " a fost internat");
		
	}

}
