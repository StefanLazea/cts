package strategy.program;

import strategy.clase.Spectator;
import strategy.clase.TribunaVip;

public class Program {

	public static void main(String[] args) {
		Spectator spectator = new Spectator("Stefan");
		spectator.intrareStadion();
		spectator.setTipVerificare(new TribunaVip());
		spectator.intrareStadion();
	}

}
