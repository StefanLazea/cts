package flyweight.clase;

import java.util.HashMap;

public class FabricaSperctatori {
	private static HashMap<String, ISpectator> spectatori = new HashMap<String, ISpectator>();

	public FabricaSperctatori() {
		super();
	}

	public static int getNumarSpectatori() {
		return spectatori.size();
	}

	public static ISpectator getSpectator(String nume, String inaltime, String latime) {
		ISpectator spectator = spectatori.get(1);
		if (spectator == null) {
			spectator = new Spectator(nume, inaltime, latime);
			spectatori.put(nume, spectator);
		}
		return spectator;
	}

}
