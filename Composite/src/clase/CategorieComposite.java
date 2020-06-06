package clase;

import java.util.ArrayList;
import java.util.List;

public class CategorieComposite implements IOptiune {

	private String nume;
	private List<IOptiune> lista;

	public CategorieComposite(String nume) {
		super();
		this.nume = nume;
		this.lista = new ArrayList<IOptiune>();
	}

	@Override
	public void stergereNod(IOptiune optiune) {
		this.lista.remove(optiune);
	}

	@Override
	public void adaugaNod(IOptiune optiune) {
		this.lista.add(optiune);
	}

	@Override
	public void descriere(String identare) {
		System.out.println(identare + "Categorie: " + nume);
		for(IOptiune optiune: lista) {
			optiune.descriere(identare+"  ");
		}
	}

	@Override
	public IOptiune getChild(int pozitie) {
		return this.lista.get(pozitie);
	}

}
