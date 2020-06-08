package s6.g1073.popescu.ancamaria.adapter;

public class Program {

	public static void main(String[] args) {
		ICosCumparaturi cos1 = new CosCumparaturi("user1");
		ICosCumparaturi cos2 = new Adapter();

		cos1.adaugaProdus("produs");
		cos2.adaugaProdus("produs");
		cos2.adaugaProdus("produs1");
		cos1.plata();
		cos2.plata();
		
		System.out.println(cos1);
		System.out.println(cos2);

	}

}
