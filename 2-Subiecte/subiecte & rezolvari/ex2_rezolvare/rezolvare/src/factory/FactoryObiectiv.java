package factory;

import clase.AObiectivTuristic;

public class FactoryObiectiv {
	public static AObiectivTuristic getObiectiv(TipObiectivTuristic tip, String denumire, String adresa) {
		switch (tip) {
		case Muzeu:
			return new Muzeu(denumire, adresa, TipObiectivTuristic.Muzeu);
		case Teatru:
			return new Teatru(denumire, adresa, TipObiectivTuristic.Teatru);
		default:
			return null;
		}
	}
}
