package junit;

import java.util.ArrayList;

import junit.exceptii.ExceptieInaltime;
import junit.exceptii.ExceptieLungimeAdresa;
import junit.exceptii.ExceptieLungimeBariera;

public class LogAccesBariera {
	String adresaLocatie;			//minim 5 caractere, maxim 50
	int lungime;				//valori intre [3,6]
	int inaltime;
	ArrayList<Integer> numarIntrariPeZi;
	
	
	public LogAccesBariera(String adresaLocatie, int lungimeBariera, int inaltimeBariera) throws ExceptieLungimeAdresa, ExceptieLungimeBariera, ExceptieInaltime {
		if(adresaLocatie.length() < 5 || adresaLocatie.length() > 50)
			throw new ExceptieLungimeAdresa();			
		else
			this.adresaLocatie = adresaLocatie;
		
		if(lungimeBariera >= 3 && lungimeBariera <= 6)
			this.lungime = lungimeBariera;
		else
			throw new ExceptieLungimeBariera();
		
		if(inaltimeBariera > 0)
			this.inaltime = lungimeBariera;
		else
			throw new ExceptieInaltime();
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


	public void adaugaIntrare(int valoare) {
		if(this.numarIntrariPeZi == null)
			this.numarIntrariPeZi = new ArrayList<>();
		this.numarIntrariPeZi.add(valoare);
	}
	

	public void setNumarIntrariPeZi(ArrayList<Integer> numarIntrariPeZi) {
		if(numarIntrariPeZi != null)
			this.numarIntrariPeZi = (ArrayList<Integer>) numarIntrariPeZi.clone();
	}

	public int totalIntrari() {
		int total = 0;
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
