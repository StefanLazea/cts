package e.strategy.program;

import e.strategy.Spectator;
import e.strategy.TribunaVip;

public class Program {
	public static void main(String[] args) {
		Spectator s = new Spectator("Ionica");
		s.setModVerificare(new TribunaVip());
		s.verificareMeci();
	}
}
