package s6.g1073.popescu.ancamaria.facade;

import java.util.ArrayList;

public class CosCumparaturi implements ICosCumparaturi {

	String user;
	ArrayList<String> produse;
	
	
	public CosCumparaturi(String user) {
		this.user = user;
		produse = new ArrayList<>();
	}


	@Override
	public void adaugaProdus(String produs) {
		this.produse.add(produs);
	}


	@Override
	public void plata() {
		for(String prod : this.produse) 
			System.out.println("Plata " + prod);
	}
	
}
