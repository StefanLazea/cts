package s07.grupa1072.tudorache.andreea.dp2.memento;


public class Program {

	public static void main(String[] args) {
		try {	
			
		Document d1 = new Document ("document1", "poc");
		ManagerDocumente managerDocumente = new ManagerDocumente();
		System.out.println(d1.toString());
		
		managerDocumente.adaugaMemento(d1.salvareMemento());
		d1.setDenumire("doc2");
		System.out.println(d1.toString());
		
		managerDocumente.adaugaMemento(d1.salvareMemento());
		d1.setDenumire("doc3");
		System.out.println(d1.toString());
		
		managerDocumente.adaugaMemento(d1.salvareMemento());
		d1.setDenumire("doc4");
		System.out.println(d1.toString());
		
		managerDocumente.adaugaMemento(d1.salvareMemento());
		
		d1.undoToMemento(managerDocumente.getMemento(0));
		System.out.println("Prima versiune: " + d1.toString());
		
	}catch (Exception e)
		{
		e.printStackTrace();
		}
	}
}