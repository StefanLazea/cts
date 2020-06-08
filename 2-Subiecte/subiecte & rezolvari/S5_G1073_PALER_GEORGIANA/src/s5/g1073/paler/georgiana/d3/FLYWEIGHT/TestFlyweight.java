package s5.g1073.paler.georgiana.d3.FLYWEIGHT;

import sources.Produs;

public class TestFlyweight {

	public static void main(String[] args) {
		
		
		FlyweightFactory fabrica = new FlyweightFactory();
		
		Produs produs;
		try {
			produs = new Produs("Masinuta", 20, 50);
			Produs produs2 = new Produs("Trotineta", 20, 100);
			Produs produs3 = new Produs("Bicicleta", 20, 150);
			
			fabrica.getProdusComplet(EPictograme.PICTOGRAMA1).descrieProdus(produs);
			fabrica.getProdusComplet(EPictograme.PICTOGRAMA1).descrieProdus(produs2);
			fabrica.getProdusComplet(EPictograme.PICTOGRAMA2).descrieProdus(produs3);
			
			System.out.println(fabrica.getNumarProduse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
