package sources;

import java.util.ArrayList;

public class CosCumparaturi implements ICosCumparaturi{
	String user;
	ArrayList<Produs> produse;
	
	
	public CosCumparaturi(String user) {
		this.user = user;
		produse = new ArrayList<>();
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
	
	
	
	
}
