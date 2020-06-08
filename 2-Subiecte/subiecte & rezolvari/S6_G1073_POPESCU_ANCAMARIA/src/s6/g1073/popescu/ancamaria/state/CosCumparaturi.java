package s6.g1073.popescu.ancamaria.state;

import java.util.ArrayList;

public class CosCumparaturi implements ICosCumparaturi {
	String user;
	ArrayList<String> produse;
	IAfisareCos stare;

	public CosCumparaturi(String user) {
		this.user = user;
		produse = new ArrayList<>();
		this.stare = new StareFaraProduse();
//		this.stare.afisareMesajCos();
	}

	public IAfisareCos getStare() {
		return stare;
	}

	public void setStare(IAfisareCos stare) {
		this.stare = stare;
	}

	public void afisareStare() {
		this.stare.afisareMesajCos();
	}

	@Override
	public void adaugaProdus(String produs) {
		this.produse.add(produs);
		this.stare = new StareCuProduse();
//		this.stare.afisareMesajCos();
	}

	@Override
	public void plata() {
		for (String prod : this.produse)
			System.out.println("Plata " + prod);
		this.stare = new StareFaraProduse();
//		this.stare.afisareMesajCos();
	}

	@Override
	public String toString() {
		return "CosCumparaturi [user=" + user + ", produse=" + produse + ", stare=" + stare + "]";
	}

}
