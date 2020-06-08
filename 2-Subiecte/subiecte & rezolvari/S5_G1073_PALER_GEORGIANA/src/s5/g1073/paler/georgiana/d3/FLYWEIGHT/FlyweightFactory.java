package s5.g1073.paler.georgiana.d3.FLYWEIGHT;

import java.util.HashMap;

public class FlyweightFactory {

	
	HashMap<EPictograme, IProdusComplet> listaProduse;
	public FlyweightFactory() {
		listaProduse = new HashMap<EPictograme, IProdusComplet>();
	}
	
	public int getNumarProduse() {
		return listaProduse.size();
	}
	
	public IProdusComplet getProdusComplet(EPictograme pictograma) {
		IProdusComplet produs = listaProduse.get(pictograma);
		
		if(produs == null) {
			produs = new ProdusComplet(pictograma);
			listaProduse.put(pictograma, produs);
		}
		
		return produs;
	}
}
