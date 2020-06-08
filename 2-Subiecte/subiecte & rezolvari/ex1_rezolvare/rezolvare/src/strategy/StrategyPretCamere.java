package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import clase.Locuinta;

public class StrategyPretCamere implements Strategy {

	@Override
	public void alegereLocuinta(List<Locuinta> locuinte, double pret) {
		List<Locuinta> locuinteValide = new ArrayList<Locuinta>();
		for (Locuinta l : locuinte) {
			if (l.getPret() / l.getNrCamere() >= pret) {
				locuinteValide.add(l);
			}
		}
		Collections.sort(locuinteValide, new Comparator<Locuinta>() {
			@Override
			public int compare(Locuinta o1, Locuinta o2) {
				double pret1 = o1.getPret() / o1.getNrCamere();
				double pret2 = o2.getPret() / o2.getNrCamere();
				if (pret1 == pret2)
					return 0;
				return pret1 < pret ? 1 : -1;
			}
		});
		System.out.println("Locuinta aleasa: ");
		System.out.println(locuinteValide.get(0));
	}

}
