package s3.g1079.paris.iannis.command;

public class testCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver r = new Receiver();
		Invoker invoker = new AsistentMecanic("Gigi", r);
		invoker.adaugaComanda(new InspectieMasina(r));
		invoker.adaugaComanda(new InspectieMasina(r));
		invoker.adaugaComanda(new InspectieMasina(r));
		invoker.trimiteComenzile();
	}

}
