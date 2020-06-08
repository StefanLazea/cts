package clase;

import java.util.List;

import strategy.Strategy;
import strategy.StrategyPretMetruPatratMinim;

public class ClientNou {
	private String nume;
	private float creditMaximAccordat;

	private Strategy strategie;

	public ClientNou(String nume, float creditMaximAccordat) {
		this.nume = nume;
		this.creditMaximAccordat = creditMaximAccordat;
		this.strategie = new StrategyPretMetruPatratMinim();
	}

	public float getCreditMaximAccordat() {
		return creditMaximAccordat;
	}

	public void alegeLocuinta(List<Locuinta> locuinte, double pret) {
		strategie.alegereLocuinta(locuinte, pret);
	}

	public void setStrategie(Strategy strategie) {
		this.strategie = strategie;
	}
}
