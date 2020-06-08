package singleton;

import clase.Locuinta;

public class GeneratorLocuinte {
	private static GeneratorLocuinte generator = null;
	private int contor;

	private GeneratorLocuinte() {
		this.contor = 0;
	}

	public static synchronized GeneratorLocuinte getInstance() {
		if (generator == null) {
			generator = new GeneratorLocuinte();
		}
		return generator;
	}

	public Locuinta getLocuinta(float mp, int nrCamere, float pret) {
		return new Locuinta(++contor, mp, nrCamere, pret);
	}
}
