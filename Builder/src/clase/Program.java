package clase;

import builder2.RezervareBuilder2;

public class Program {

	public static void main(String[] args) {
		Rezervare rez = new Rezervare();
		rez.setMuzicaAmbientala(true);
		rez.setGenMuzica("rock");
		System.out.println(rez.toString());
		
		Rezervare rezUsingBuilder = new RezervareBuilder()
				.setMuzicaAmbientala(true)
				.setGenMuzica("clasica")
				.build();
		System.out.println(rezUsingBuilder.toString());
		
		Rezervare rezUsingBuilder2 = new RezervareBuilder()
				.setScauneErgonomice(false)
				.setMuzicaAmbientala(true)
				.setGenMuzica("de lif")
				.build();
		
		System.out.println(rezUsingBuilder2.toString());
		
		RezervareBuilder2 builderVersion2 = new RezervareBuilder2()
				.setMuzicaAmbientala(true)
				.setGenMuzica("rock")
				.setScauneErgonomice(true);
		
		Rezervare r = builderVersion2.build();
		Rezervare r2 = builderVersion2.build();
		
		System.out.println(r.toString());
		System.out.println(r2.toString());
	}

}
