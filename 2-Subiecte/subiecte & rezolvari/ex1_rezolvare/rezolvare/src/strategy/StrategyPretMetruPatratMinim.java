package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import clase.Locuinta;

public class StrategyPretMetruPatratMinim implements Strategy {

	@Override
	public void alegereLocuinta(List<Locuinta> locuinte, double pret) {
		List<Locuinta> locuinteValide = new ArrayList<Locuinta>();
		for (Locuinta l : locuinte) {
			if (l.getPret() / l.getMp() >= pret) {
				locuinteValide.add(l);
			}
		}
		Collections.sort(locuinteValide, new Comparator<Locuinta>() {
			@Override
			public int compare(Locuinta o1, Locuinta o2) {
				double pret1 = o1.getPret() / o1.getMp();
				double pret2 = o2.getPret() / o2.getMp();
				if (pret1 == pret2)
					return 0;
				return pret1 < pret ? 1 : -1;
			}
		});
		System.out.println("Locuinta aleasa: ");
		if (locuinteValide.size() > 0)
			System.out.println(locuinteValide.get(0));
		else
			System.out.println("Nu exista locuinte");
	}

}
