package a.memento.program;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import a.memento.ManagerSpital;
import a.memento.Pacient;

public class Program {

	public static void main(String[] args) {
		Pacient pacient = new Pacient("Ionel", "analize bune");
		ManagerSpital istoric = new ManagerSpital();
		istoric.adaugareMemento(pacient.salvareMemento());
		pacient.setRezultatAnalize("analize proaste");
		System.out.println(pacient.toString());
		pacient.undoToMemento(istoric.getLastMePacient());
		System.out.println(pacient.toString());

	}

}
