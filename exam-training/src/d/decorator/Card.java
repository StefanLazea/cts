package d.decorator;

public class Card implements ICard {

	@Override
	public void plataOnline() {
		System.out.println("Plata online");
	}

	@Override
	public void plataNormala() {
		System.out.println("Plata normala");
	}

}
