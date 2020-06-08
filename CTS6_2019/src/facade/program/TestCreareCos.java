package facade.program;

import adapter.clase.AdapterObiecte;
import facade.clase.CosCumparaturi;
import facade.clase.Facade;
import facade.clase.ICosComparaturi;

public class TestCreareCos {

	public static void main(String[] args) {
		// Facade
		CosCumparaturi cos = Facade.creareCosCumparatori();
		cos.adaugaInCos();
		cos.cumpara();

		// Adapter
		System.out.println("=======Facade=======");
		ICosComparaturi cos2 = Facade.creareCosCumparatori();
		AdapterObiecte cosAdapter = new AdapterObiecte(cos2);
		cosAdapter.buy();
		cosAdapter.addToCart();
		cosAdapter.buy();

		
		//State
		System.out.println("=======State=======");
		CosCumparaturi cosState = Facade.creareCosCumparatori();
		cosState.cumpara();		
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		cosState.adaugaInCos();
		
		

	}

}
