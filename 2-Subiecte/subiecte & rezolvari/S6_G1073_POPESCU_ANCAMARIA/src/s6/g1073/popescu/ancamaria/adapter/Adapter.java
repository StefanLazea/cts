package s6.g1073.popescu.ancamaria.adapter;

public class Adapter extends ShoppingCart implements ICosCumparaturi{

	@Override
	public void adaugaProdus(String produs) {
		this.addProduct(produs);
		
	}

	@Override
	public void plata() {
		this.pay(this.produse.size());
		
	}



	
}
