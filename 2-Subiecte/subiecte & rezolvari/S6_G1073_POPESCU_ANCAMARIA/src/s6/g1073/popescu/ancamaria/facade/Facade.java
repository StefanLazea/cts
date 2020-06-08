package s6.g1073.popescu.ancamaria.facade;

public class Facade {
	public static CosCumparaturi CreareCos() {
		User user = new User("Gigel");
		ConexiuneBD conexiune = new ConexiuneBD("127.0.0.1");
		Sesiune sesiune = new Sesiune(user, conexiune);
		conexiune.deschideConexiune();
		sesiune.deschideSesiune();
		
		CosCumparaturi cos = sesiune.genereazaCos();
		return cos;
	}

}
