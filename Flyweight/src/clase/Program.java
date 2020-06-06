package clase;

public class Program {
	private static void achizitieReteta() {
		IClient client = FabricaDeClienti.getClient(1, "Ion");
		Reteta reteta = new Reteta(1, 300, 5);
		client.printareReteta(reteta);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reteta reteta1 = new Reteta(1, 200, 3);

		IClient client1 = FabricaDeClienti.getClient(1, "Ion");
		client1.printareReteta(reteta1);

		Reteta reteta2 = new Reteta(2, 210, 3);
		IClient client2 = FabricaDeClienti.getClient(2, "Andrei");
		client2.printareReteta(reteta2);

		Reteta reteta3 = new Reteta(3, 312, 12);
		IClient client3 = FabricaDeClienti.getClient(1, "Ion");
		
		achizitieReteta();
		client3.printareReteta(reteta3);
		System.out.println(FabricaDeClienti.getNumarClienti());
	}

}
