package proxy.clase;

public class VanzareBilet implements IVanzare {
	private Persoana pers;

	public VanzareBilet(Persoana pers) {
		super();
		this.pers = pers;
	}

	public Persoana getPersoana() {
		return pers;
	}

	public void setPersoana(Persoana pers) {
		this.pers = pers;
	}

	@Override
	public void descriere() {
		System.out.println("bilet pentru meci");
	}

	@Override
	public void vanzareBilet() {
		System.out.println(this.pers.getNume() + " a cumparat un bilet");

	}

}
