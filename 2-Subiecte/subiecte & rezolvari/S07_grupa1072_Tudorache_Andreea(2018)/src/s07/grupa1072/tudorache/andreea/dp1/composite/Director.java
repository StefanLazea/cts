package s07.grupa1072.tudorache.andreea.dp1.composite;

import java.util.ArrayList;
import java.util.List;

public class Director implements Optiune{
	
	List<Optiune> listaDir = new ArrayList<>();
	private String denumire;
	
	public Director (String nume)
	{
		listaDir = new ArrayList<Optiune>();
		this.denumire=nume;
	}

	@Override
	public void stergeNod(Optiune optiune) {
		
		listaDir.remove(optiune);
	}

	@Override
	public void adaugaNod(Optiune optiune){
	
		listaDir.add(optiune);
		
	}

	@Override
	public Optiune getNod(int index) throws Exception {
		
		return listaDir.get(index);
	}

	@Override
	public void descriere() {
		
		System.out.println("Director: " + denumire);
		for(Optiune optiune : listaDir)
			optiune.descriere();
	}
	
	//alte campuri/metode vor fi inserate aici
}