package builder.program;

import builder.clase.Rezervare;
import builder.clase.RezervareBuilder;

public class Program {
	public static void main(String[] args) {
		Rezervare rez = new RezervareBuilder()
				.setMuzicaAmbientala(true)
				.setGenMuzica("rock")
				.setBauturaRacoritoare(true)
				.build();
		
		System.out.println(rez.toString());
		
	}
}
