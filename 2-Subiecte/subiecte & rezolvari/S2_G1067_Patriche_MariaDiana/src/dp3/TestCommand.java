package dp3;

import java.util.ArrayList;

public class TestCommand {

	public static void main(String[] args) {
		
		Executant executant = new Executant();
		executant.setNumeExecutant("Popescu");
		
		Client client = new Client(executant);
		System.out.println(client.toString());
		
		ArrayList<IBariera> bariere = new ArrayList<>();
		bariere.add(new BarieraAutomata(20, "rosu", "Park lake"));
		bariere.add(new BarieraAutomata(12, "verde", "Mall baneasa"));
		bariere.add(new BarieraAutomata(25, "galben", "Plaza"));
		for(IBariera bariera : bariere)
		{
			//client.adaugaComanda(bariera);
			System.out.println(bariera.toString());
		}
			
		
		client.trimiteComenzi();
		
	}

}
