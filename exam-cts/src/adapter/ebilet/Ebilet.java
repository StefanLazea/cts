package adapter.ebilet;

import java.util.ArrayList;
import java.util.List;

public class Ebilet {
	private int nrLoc;
	private List<Integer> locuriVandute = null;
	private List<Integer> locuriRezervate = null;
	private float incasari;

	public Ebilet(int nrLoc, float incasari) {
		super();
		this.nrLoc = nrLoc;
		this.incasari = incasari;
		this.locuriVandute = new ArrayList<Integer>();
		this.locuriRezervate = new ArrayList<Integer>();
	}

	public void rezervaLoc(int nrLoc) {
		this.locuriRezervate.add(nrLoc);
		System.out.println("S-a rezervat locul cu nr " + nrLoc);
	}

	public void vanzareBilet(int nrLoc, float suma) {
		for (int i = 0; i < this.locuriRezervate.size(); i++) {
			if (this.locuriRezervate.get(i) == nrLoc) {
				this.locuriVandute.add(nrLoc);
				this.incasari += suma;
				System.out.println("A fost vandut locul " + nrLoc + " de catre Ebilet");
			}
		}
	}

	public int getNrLoc() {
		return nrLoc;
	}

	public float getIncasari() {
		return incasari;
	}

	public void setNrLoc(int nrLoc) {
		this.nrLoc = nrLoc;
	}

	public void setIncasari(float incasari) {
		this.incasari = incasari;
	}
	
	
}
