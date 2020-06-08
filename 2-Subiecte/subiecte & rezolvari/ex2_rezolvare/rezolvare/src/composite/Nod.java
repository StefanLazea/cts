package composite;

import java.util.ArrayList;
import java.util.List;

public class Nod extends CompositeAbstract {

	private String nume;
	private List<CompositeAbstract> noduri;

	public Nod(String nume) {
		this.nume = nume;
		this.noduri = new ArrayList<CompositeAbstract>();
	}

	@Override
	public void descriere() {
		System.out.println(nume);
		for (CompositeAbstract nod : noduri) {
			nod.descriere();
		}
	}

	@Override
	public void adaugaNod(CompositeAbstract nod) {
		noduri.add(nod);
	}

	@Override
	public void stergeNod(CompositeAbstract nod) {
		noduri.remove(nod);
	}

	@Override
	public CompositeAbstract getNod(int index) {
		return noduri.get(index);
	}
}
