package s5.g1073.paler.georgiana.d3.FLYWEIGHT;

import sources.Produs;

public class ProdusComplet implements IProdusComplet{
	
	EPictograme pictograma;
	
	

	public EPictograme getPictograma() {
		return pictograma;
	}



	public void setPictograma(EPictograme pictograma) {
		this.pictograma = pictograma;
	}



	public ProdusComplet(EPictograme pictograma) {
		super();
		this.pictograma = pictograma;
	}



	@Override
	public void descrieProdus(Produs optional) {
		System.out.println("Pentru produsul " + optional.getDenumire() + " se foloseste pictograma " + pictograma);
	}

}
