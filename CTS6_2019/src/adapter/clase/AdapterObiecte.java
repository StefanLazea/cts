package adapter.clase;

import facade.clase.ICosComparaturi;

public class AdapterObiecte implements IShoppingCart {
	private ICosComparaturi cosCumparaturi;

	public AdapterObiecte(ICosComparaturi cosCumparaturi) {
		super();
		this.cosCumparaturi = cosCumparaturi;
	}

	@Override
	public void buy() {
		this.cosCumparaturi.cumpara();
	}

	@Override
	public void addToCart() {
		this.cosCumparaturi.adaugaInCos();
	}

	@Override
	public void removeProduct() {
		this.cosCumparaturi.stergeDinCos();
	}

}
