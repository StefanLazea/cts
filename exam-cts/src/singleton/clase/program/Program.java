package singleton.clase.program;

import singleton.clase.MagazinOnline;

public class Program {
	public static void main(String[] args) {
		MagazinOnline magazin = MagazinOnline.getInstance("eMag", 2, 234);
		System.out.println(magazin.toString());
		MagazinOnline magazin2 = MagazinOnline.getInstance("evoMag", 5, 2345);
		magazin2.adaugaProduse();

		System.out.println(magazin2.toString());
				
	}
}
