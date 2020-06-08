package facade.clase;

import state.clase.IAfisareCos;
import state.clase.StareCuMulteProduse;
import state.clase.StareCuProduse;
import state.clase.StareFaraProduse;

public class CosCumparaturi implements ICosComparaturi {
	private int nrProduse;
	private float total;

	private User user;
	private Sesiune sesiune;
	private ConexiuneDB conn;

	private IAfisareCos stare;

	public CosCumparaturi(User user, Sesiune sesiune, ConexiuneDB conn) {
		super();
		this.user = user;
		this.sesiune = sesiune;
		this.conn = conn;
		this.total = 0;
		this.nrProduse = 0;
		this.stare = new StareFaraProduse();
	}

	@Override
	public void cumpara() {
		System.out.println("Ai cumparat " + this.nrProduse + " produse in valoare de " + this.total);
		this.setStare(new StareFaraProduse());
		this.stare.afisareMesajCos();
		this.nrProduse = 0;	
		this.total = 0;
	}

	@Override
	public void adaugaInCos() {
		this.nrProduse++;
		this.total += 100;
		if (this.nrProduse < 10) {
			this.setStare(new StareCuProduse());
		} else {
			this.setStare(new StareCuMulteProduse());
		}
		this.stare.afisareMesajCos();

	}

	@Override
	public void stergeDinCos() {
		this.nrProduse--;
		this.total -= 100;
		if (this.nrProduse <= 10) {
			this.setStare(new StareCuProduse());
		} else if (nrProduse == 0) {
			this.setStare(new StareFaraProduse());
		}
		this.stare.afisareMesajCos();
	}

	@Override
	public String toString() {
		return "CosCumparaturi [nrProduse=" + nrProduse + ", total=" + total + ", user=" + user + ", sesiune=" + sesiune
				+ ", conn=" + conn + "]";
	}

	private void setStare(IAfisareCos stare) {
		this.stare = stare;
	}
}
