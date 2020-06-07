package e.flyweight;

public class ConcreteFlyweight implements IFlyweight {
	private String nume;
	private int inaltime;
	private int latime;

	public ConcreteFlyweight(String nume, int inaltime, int latime) {
		super();
		this.nume = nume;
		this.inaltime = inaltime;
		this.latime = latime;
	}

	@Override
	public void descriePersoana(Optionale optional) {
		System.out.println(this.toString() + "  " + optional.toString());

	}

	@Override
	public String toString() {
		return "ConcreteFlyweight [nume=" + nume + ", inaltime=" + inaltime + ", latime=" + latime + "]";
	}

}
