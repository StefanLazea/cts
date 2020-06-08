package decorator;

public class Program {

	public static void main(String[] args) {
		BiletcuGhid biletGhid = new BiletcuGhid(10);
		System.out.println(biletGhid.getPret());

		BiletCuValabilitate abonament = new BiletCuValabilitate(20, biletGhid, 3);
		System.out.println(abonament.getPret());
	}

}
