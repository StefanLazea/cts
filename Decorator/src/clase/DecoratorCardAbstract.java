package clase;

public abstract class DecoratorCardAbstract implements ICard {
	private ICard cardAbstract;

	public DecoratorCardAbstract(ICard cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}

	@Override
	public void plataOnline() {
		this.cardAbstract.plataOnline();
	}

	@Override
	public void plataNormala() {
		this.cardAbstract.plataNormala();
	}

	public abstract void plataContactless();
}
