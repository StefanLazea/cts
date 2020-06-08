package S4.G1079.Paraschivescu.Cristian.composite;

public class testComposite {

	public static void main(String[] args) {
		Engineer e1 = new Engineer("MainEngineer");
		
		Engineer e2 = new Engineer("Ion");
		Engineer e3 = new Engineer("Mihai");
		Engineer e4 = new Engineer("Dorel");
		e1.addNode(e2);
		e1.addNode(e3);
		e1.addNode(e4);
		
		e2.addNode(new Mechanics("Mecanic1"));
		e2.addNode(new Mechanics("Mecanic2"));
		
		
		System.out.println(e1.getInfo());
	}

}
