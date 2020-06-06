package clase;

public class Program {
	public static void main(String[] args) {
		Spital spital = new Spital("Floreasca", "Calea Floreasca", 209);
		ManagerSpital managerSpital = new ManagerSpital();
		managerSpital.adaugareMemento(spital.creazaMemento());
		
		spital.setNrPacienti(189);
		System.out.println(spital.toString());

		managerSpital.adaugareMemento(spital.creazaMemento());
		spital.restaurare(managerSpital.extragereMemento(0));
		System.out.println(spital.toString());
	}
	
}
