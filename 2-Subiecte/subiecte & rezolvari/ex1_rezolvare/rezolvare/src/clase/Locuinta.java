package clase;

public class Locuinta {
	private int cod;
	private float mp;
	private int nrCamere;
	private float pret;

	public Locuinta(int cod, float mp, int nrCamere, float pret) {
		this.cod = cod;
		this.mp = mp;
		this.nrCamere = nrCamere;
		this.pret = pret;
	}

	public int getCod() {
		return cod;
	}

	public float getMp() {
		return mp;
	}

	public void setNrCamere(int nrCamere) {
		this.nrCamere = nrCamere;
	}

	public float getPret() {
		return pret;
	}

	public int getNrCamere() {
		return nrCamere;
	}

	@Override
	public String toString() {
		return "Locuinta [cod=" + cod + ", mp=" + mp + ", nrCamere=" + nrCamere + ", pret=" + pret + "]";
	}

}
