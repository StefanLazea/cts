package d.composite;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements INod {
	private String denumire;
	private List<INod> noduri = null;

	public Agentie(String denumire) {
		super();
		this.denumire = denumire;
		this.noduri = new ArrayList<INod>();
	}

	@Override
	public void adaugaNod(INod nod) {
		this.noduri.add(nod);
	}

	@Override
	public INod getNod(int index) {
		return this.noduri.get(index);
	}

	@Override
	public void stergereNod(INod nod) {
		this.noduri.remove(nod);
	}

	@Override
	public void descriere(String spatiu) {
		System.out.println(spatiu+"Agentia " + this.denumire);
		for(INod nod: this.noduri) {
			nod.descriere(spatiu+" ");
		}
	}

}
