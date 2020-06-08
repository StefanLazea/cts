package clase;

import java.util.ArrayList;

public class LogAccesBariera {
	String adresaLocatie;			//minim 5 caractere, maxim 50
	int lungime;				//valori intre [3,6]
	int inaltime;
	ArrayList<Integer> numarIntrariPeZi;
	
	
	public LogAccesBariera(String adresaLocatie, int lungimeBariera, int inaltimeBariera) {
		this.adresaLocatie = adresaLocatie;
		this.lungime = lungimeBariera;
		this.inaltime = lungimeBariera;
	}
	
	public void adaugaIntrare(int valoare) {
		if(this.numarIntrariPeZi == null)
			this.numarIntrariPeZi = new ArrayList<>();
		this.numarIntrariPeZi.add(valoare);
	}
	

	public void setNumarIntrariPeZi(ArrayList<Integer> numarIntrariPeZi) {
		this.numarIntrariPeZi = numarIntrariPeZi;
	}

	public int totalIntrari() {
		int total = 100;
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
