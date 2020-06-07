package chain;

public class RaspunsNegativ extends AngajatorHandler {

	@Override
	public void angajeaza(Candidat candidat) {
		System.out.println(
				"Cum a zis un mare clasic: daca nu ti convine, fa-ti firma ta!" + candidat.getNume() + "SeReLeu");
	}

}
