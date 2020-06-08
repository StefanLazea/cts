package junit.clase;

import java.util.ArrayList;

import junit.exceptii.LogException;
import junit.exceptii.LogExceptionLista;
import junit.interfete.ILogAcces;

public class LogAccesBariera {
	String adresaLocatie;			//minim 5 caractere, maxim 50
	int lungime;				//valori intre [3,6]
	int inaltime;
	ArrayList<Integer> numarIntrariPeZi;
	public static final int LIMITA_MIN_CARACTERE=5;
	public static final int LIMITA_MAX_CARACTERE=50;
	public static final int LIMITA_MIN_LUNGIME=3;
	public static final int LIMITA_MAX_LUNGIME=6;
	
	
	public LogAccesBariera(String adresaLocatie, int lungimeBariera, int inaltimeBariera) throws LogException {
		if(lungimeBariera<LIMITA_MIN_LUNGIME || lungimeBariera>LIMITA_MAX_LUNGIME)
			throw new LogException();
		this.adresaLocatie = adresaLocatie;
		this.lungime = lungimeBariera;
		this.inaltime = lungimeBariera;
	}
	
	public void adaugaIntrare(int valoare) {
		if(this.numarIntrariPeZi == null)
			this.numarIntrariPeZi = new ArrayList<>();
		this.numarIntrariPeZi.add(valoare);
	}
	
	

	public LogAccesBariera() {
		super();
	}

	public String getAdresaLocatie() {
		return adresaLocatie;
	}

	public void setAdresaLocatie(String adresaLocatie) {
		this.adresaLocatie = adresaLocatie;
	}

	public int getLungime() {
		return lungime;
	}

	public void setLungime(int lungime) {
		this.lungime = lungime;
	}

	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}

	public ArrayList<Integer> getNumarIntrariPeZi() {
		return numarIntrariPeZi;
	}

	public void setNumarIntrariPeZi(ArrayList<Integer> numarIntrariPeZi) {
		this.numarIntrariPeZi = numarIntrariPeZi;
	}

	public int totalIntrari() throws LogExceptionLista {
		int total = 100;
		if(this.numarIntrariPeZi==null)
			throw new LogExceptionLista();
		for(int i = 0; i<this.numarIntrariPeZi.size(); i++)
			total += this.numarIntrariPeZi.get(i);
		return total;
	}
	
	public int stergeLog(ILogAcces fisierLog) {
		if(fisierLog.salvareDate(this.numarIntrariPeZi)) {
			this.numarIntrariPeZi = null;
			return 1;
		}
		else
			return 0;
	}
	
}
