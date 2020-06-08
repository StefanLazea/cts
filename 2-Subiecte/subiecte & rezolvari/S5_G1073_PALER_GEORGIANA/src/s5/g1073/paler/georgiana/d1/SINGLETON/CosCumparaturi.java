package s5.g1073.paler.georgiana.d1.SINGLETON;

import java.util.ArrayList;

import sources.IPlata;
import sources.Produs;

public class CosCumparaturi implements ICosCumparaturi, IPlata {

	
    static String user;
	ArrayList<Produs> produse;
	IPlata modPlata; 
	static CosCumparaturi cosCump = null;
	
	private CosCumparaturi(String user) {
		this.user = user;
		produse = new ArrayList<>();
	}
	
	private CosCumparaturi(int  nrProduse) {
		this.user = user;
		produse = new ArrayList<>(nrProduse);
	}

	
	 public static synchronized CosCumparaturi getInstanta() {
		 
		 if(cosCump == null) {
			 cosCump = new CosCumparaturi(user);
		 }
		 
		 return cosCump;
	 }
	 
	 
	 
	public IPlata getModPlata() {
		return modPlata;
	}

	public void setModPlata(IPlata modPlata) {
		this.modPlata = modPlata;
	}

	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public void adaugaProdus(Produs produs) {
		this.produse.add(produs);
	}


	@Override
	public float getValoareCos() {
		int total = 0;
		for(Produs prod : this.produse) 
			total += (prod.getPret() * prod.getStoc());
		return total;
	}


	@Override
	public void plateste(float valoareCos) {
		this.modPlata.plateste(valoareCos);
	}
	
	
	 
		@Override
		public String toString() {
			return "CosCumparaturi [produse=" + produse + ", modPlata=" + modPlata + "user " + getUser() + " ]" ;
		}
		
		public void displayInfo() {
			System.out.println("Produse cos: ");
			for (Produs produs : produse) {
				produs.toString();
			}
			System.out.println( " modPlata=" + modPlata + "user " + getUser() );
		}
}
