package b.builder.program;

import b.builder.BuilderRezervare;
import b.builder.Rezervare;

public class Program {

	public static void main(String[] args) {
		BuilderRezervare rez = new BuilderRezervare();
		Rezervare r = rez.setAsezareLaGeam(true).setGenMuzica("manele").setMuzicaAmbientala(true).build();
		System.out.println(r.toString());
	}

}
