package clase;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Pacient {

	private String nume;
	public boolean esteAsigurat;

	public Pacient(String nume, boolean esteAsigurat) {
		super();
		this.nume = nume;
		this.esteAsigurat = esteAsigurat;
	}

	public String getNume() {
		return nume;
	}

	public boolean isEsteAsigurat() {
		return esteAsigurat;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setEsteAsigurat(boolean esteAsigurat) {
		this.esteAsigurat = esteAsigurat;
	}

}