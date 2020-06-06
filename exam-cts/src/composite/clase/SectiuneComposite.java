package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneComposite implements ISectiuneAsezare {
	private List<ISectiuneAsezare> sectiuni;
	private String denumire;

	public SectiuneComposite(String denumire) {
		super();
		this.denumire = denumire;
		this.sectiuni = new ArrayList<ISectiuneAsezare>();
	}

	@Override
	public void adaugaOptiune(ISectiuneAsezare optiune) {
		this.sectiuni.add(optiune);
	}

	@Override
	public ISectiuneAsezare getChild(int index) {
		return this.sectiuni.get(index);
	}

	@Override
	public void stergereOptiune(ISectiuneAsezare sectiune) {
		this.sectiuni.remove(sectiune);
	}

	@Override
	public void descriere(String spatiu) {
		System.out.println(spatiu + "sectiunea " + this.denumire);
		for (ISectiuneAsezare sect : this.sectiuni) {
			sect.descriere(spatiu + " ");
		}
	}

}
