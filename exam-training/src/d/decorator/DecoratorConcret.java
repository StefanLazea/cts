package d.decorator;

public class DecoratorConcret extends DecoratorAbstract {

	public DecoratorConcret(ICard card) {
		super(card);
	}

	@Override
	public void plataContactLess() {
		System.out.println("Plata contactless");
	}
}
