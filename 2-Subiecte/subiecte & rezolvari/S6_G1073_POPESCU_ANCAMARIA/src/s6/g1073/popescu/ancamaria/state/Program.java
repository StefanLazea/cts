package s6.g1073.popescu.ancamaria.state;

public class Program {

	public static void main(String[] args) {
		CosCumparaturi cos = new CosCumparaturi("user");
		cos.afisareStare();
		cos.adaugaProdus("produs1");
		cos.afisareStare();
		cos.plata();
		cos.afisareStare();
		

	}

}
