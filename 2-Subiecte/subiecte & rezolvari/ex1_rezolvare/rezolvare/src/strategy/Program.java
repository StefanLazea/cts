package strategy;

import java.util.ArrayList;
import java.util.List;

import clase.ClientNou;
import clase.Locuinta;

public class Program {

	public static void main(String[] args) {
		List<Locuinta> locuinte = new ArrayList<>();
		locuinte.add(new Locuinta(100, 100, 10, 100));
		locuinte.add(new Locuinta(200, 20, 20, 200));
		locuinte.add(new Locuinta(300, 30, 30, 300));

		ClientNou client = new ClientNou("Popescu", 2500);
		client.alegeLocuinta(locuinte, 10);
		client.setStrategie(new StrategyPretCamere());
		client.alegeLocuinta(locuinte, 10);
	}

}
