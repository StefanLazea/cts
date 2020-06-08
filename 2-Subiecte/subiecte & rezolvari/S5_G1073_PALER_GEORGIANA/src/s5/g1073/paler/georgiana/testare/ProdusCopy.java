package s5.g1073.paler.georgiana.testare;

import java.util.ArrayList;

public class ProdusCopy {

	
		String denumire;	//minim 3 caractere, maxim 30
		int stoc;		//valori intre [1, 1000]
		float pret;		//valori pozitive
		ArrayList<Integer> vanzariZilnice;
		
		public ProdusCopy(String denumire, int stoc, float pret) throws Exception {
			
			if(denumire.length() <3 || denumire.length() >30 || stoc < 1 || stoc > 1000 || pret < 0 ) {
				throw new Exception();
			}
			this.denumire = denumire;
			this.stoc = stoc;
			this.pret = pret;
		}

		public float getPret() {
			return pret;
		}
		
		public String getDenumire() {
			return this.denumire;
		}

		
		public int getStoc() {
			return stoc;
		}

		public void setPret(float pret) throws Exception {
			
			if(  pret < 0 ) {
				throw new Exception();
			}
			this.pret = pret;
		}

		public void setVanzariZilnice(ArrayList<Integer> vanzariZilnice) {
			this.vanzariZilnice = vanzariZilnice;
		}


		//determina numarul maxim de produse vandute
		public int getVanzareMaxima() throws MaxException {
			int maxim  = 0;
			
			if(vanzariZilnice == null || vanzariZilnice.size() == 0 ) {
				throw new MaxException();
			}
			for(int valoare : vanzariZilnice)
				if(valoare > maxim)
					maxim  = valoare;
			return maxim;
		}
		
		//actualizeaza stocul prin comanda furnizor - la stocul existent se adauga cantitatea comandata
		//daca furnizorul nu are produse pe stoc atunci se arunca exceptie de tip UnsupportedOperationException
		
		public void comandaFurnizor(int cantitate, IFurnizor furnizor) {
			if(furnizor.verificaStocFurnizor(cantitate))
				this.stoc = this.getStoc() + cantitate;
			else
				throw new UnsupportedOperationException();
				
		}

		@Override
		public String toString() {
			return "Produs [denumire=" + denumire + ", stoc=" + stoc + ", pret=" + pret + ", vanzariZilnice="
					+ vanzariZilnice + "]";
		}
		
	

}
