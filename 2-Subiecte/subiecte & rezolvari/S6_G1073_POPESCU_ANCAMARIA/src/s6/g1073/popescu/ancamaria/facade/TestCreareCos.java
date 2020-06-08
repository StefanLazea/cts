package s6.g1073.popescu.ancamaria.facade;

public class TestCreareCos {
	public static void main(String[] args) {
		System.out.println("CREARE COS FARA FACADE");
		//simulare creare cos
		User user = new User("Gigel");
		ConexiuneBD conexiune = new ConexiuneBD("127.0.0.1");
		Sesiune sesiune = new Sesiune(user, conexiune);
		conexiune.deschideConexiune();
		sesiune.deschideSesiune();
		
		System.out.println("CREARE COS CU FACADE");
		CosCumparaturi cos = sesiune.genereazaCos();
		CosCumparaturi cosFacade = Facade.CreareCos();

		
	}

}
