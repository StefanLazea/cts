package composite.program;

import composite.clase.ISectiuneAsezare;
import composite.clase.LocFrunza;
import composite.clase.SectiuneComposite;

public class Program {

	public static void main(String[] args) {
		ISectiuneAsezare tribuna = new SectiuneComposite("Tribuna");
		ISectiuneAsezare peluza = new SectiuneComposite("Peluza");
		
		ISectiuneAsezare tribunaSud = new SectiuneComposite("Tribuna Sud");
		ISectiuneAsezare tribunaNord = new SectiuneComposite("Tribuna Nord");
		ISectiuneAsezare peluzaSud = new SectiuneComposite("Peluza Sud");
		ISectiuneAsezare peluzaNord = new SectiuneComposite("Peluza Nord");

		LocFrunza loc = new LocFrunza("Loc ts1");
		LocFrunza loc2 = new LocFrunza("Loc tn1");
		LocFrunza loc3 = new LocFrunza("Loc tn1");
		
		tribuna.adaugaOptiune(tribunaSud);
		tribunaNord.adaugaOptiune(loc);
		tribuna.adaugaOptiune(tribunaNord);
		tribunaNord.adaugaOptiune(loc2);
		tribunaNord.adaugaOptiune(loc3);
		tribuna.descriere("");
		tribunaNord.descriere("");
		peluza.adaugaOptiune(peluzaSud);
		peluza.adaugaOptiune(peluzaNord);
		peluza.descriere("");
		
	}

}
