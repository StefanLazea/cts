package s6.g1073.popescu.ancamaria.adapter;

import java.util.ArrayList;

public class ShoppingCart implements IShoppingCart {

	ArrayList<String> produse = new ArrayList<>();

	@Override
	public void addProduct(String produs) {
		this.produse.add(produs);

	}

	@Override
	public void pay(int numarPrduse) {
		System.out.println("S-a efectuat plata pentru " + numarPrduse + " produse");
		
		
	}

	@Override
	public String toString() {
		return "ShoppingCart [produse=" + produse + "]";
	}
	
	

}
