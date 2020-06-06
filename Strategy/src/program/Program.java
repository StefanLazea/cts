package program;

import clase.Cash;
import clase.Pacient;

public class Program {

	public static void main(String[] args) {
		Pacient p = new Pacient("Johnny");
		p.platesteSpitalizare(1020);
		p.setModPlata(new Cash());
		p.platesteSpitalizare(100);

	}

}
