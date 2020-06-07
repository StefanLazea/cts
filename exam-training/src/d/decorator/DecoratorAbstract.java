package d.decorator;

public abstract class DecoratorAbstract implements ICard {
	private ICard card;

	public DecoratorAbstract(ICard card) {
		super();
		this.card = card;
	}

	@Override
	public void plataOnline() {
		this.card.plataOnline();
	}

	@Override
	public void plataNormala() {
		this.card.plataNormala();
	}

	public abstract void plataContactLess();
}
