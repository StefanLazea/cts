package clase;

public class Card implements ICard {

	@Override
	public void plataOnline() {
		System.out.println("A fost efectuata o plata online");
	}

	@Override
	public void plataNormala() {
		System.out.println("A fost efectuata o plata normala");
	}

}
