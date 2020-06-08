package facade.clase;

public class Facade {
	public static CosCumparaturi creareCosCumparatori() {
		User user = new User();
		ConexiuneDB conn = new ConexiuneDB();
		Sesiune ses = new Sesiune();
		return new CosCumparaturi(user, ses, conn);
	}
}
