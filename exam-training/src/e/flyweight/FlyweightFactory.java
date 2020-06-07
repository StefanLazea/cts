package e.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String, IFlyweight> persoane;

	public FlyweightFactory() {
		super();
		this.persoane = new HashMap<String, IFlyweight>();
	}

	public IFlyweight getPersoana(String nume, int latime, int inaltime) {
		IFlyweight spectator = this.persoane.get(nume);
		if (spectator == null) {
			spectator = new ConcreteFlyweight(nume, inaltime, latime);
			this.persoane.put(nume, spectator);
		}
		return spectator;
	}

	public int getNumarPersoane() {
		return this.persoane.size();
	}
}
