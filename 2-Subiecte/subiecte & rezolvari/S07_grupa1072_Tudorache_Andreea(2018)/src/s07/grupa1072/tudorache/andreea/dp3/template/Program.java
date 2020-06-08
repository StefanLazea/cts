package s07.grupa1072.tudorache.andreea.dp3.template;

public class Program {

	public static void main(String[] args) {
		System.out.println("primul document..");
		Document d = new Document("titlu", "poc", "text text text", 50);
		
		ManagerSalvare managerSalvare = new ManagerSalvareDocument();
		
		System.out.println("al doilea document..");
		Document d2 = new Document("titlu2222", "poc", "text text text", 50);
		ManagerSalvare managerSalvare2 = new ManagerSalvareDocument();
		
	}

}
