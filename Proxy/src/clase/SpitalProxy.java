package clase;

public class SpitalProxy implements ISpital {
	private Spital spital;

	public SpitalProxy(Spital spital) {
		super();
		this.spital = spital;
	}
	
	@Override
	public void descriere() {
		this.spital.descriere();
	}

	@Override
	public void interneaza(Pacient p) {
		if (p.isEsteAsigurat()) {
			this.spital.interneaza(p);
		} else {
			System.out.println("Spitalul nu permite internari fara asigurari medicale "
					+ p.getNume() + " nu are asigurare");
		}
	}

}
