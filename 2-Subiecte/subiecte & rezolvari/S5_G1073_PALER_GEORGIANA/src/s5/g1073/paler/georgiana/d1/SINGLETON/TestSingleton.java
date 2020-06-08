package s5.g1073.paler.georgiana.d1.SINGLETON;

import sources.Produs;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		CosCumparaturi cos = CosCumparaturi.getInstanta();
		cos.setUser("Gigel");
		System.out.println(cos);
		
		Produs pr1;
		try {
			pr1 = new Produs("Minge", 20, 200);
			Produs pr2 = new Produs("Prajitor", 10, 100);
			Produs pr3 = new Produs("Catelus", 15, 200);
			
			cos.adaugaProdus(pr1);
			cos.adaugaProdus(pr2);
			cos.adaugaProdus(pr3);
			
			System.out.println(cos);
			
			
			CosCumparaturi cos2 = CosCumparaturi.getInstanta();
			System.out.println(cos2);
			
			
			CosCumparaturi cos3 = CosCumparaturi.getInstanta();
			System.out.println(cos3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
