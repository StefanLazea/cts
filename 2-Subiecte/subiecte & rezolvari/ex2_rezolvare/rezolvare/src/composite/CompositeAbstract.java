package composite;

public abstract class CompositeAbstract {
	public void adaugaNod(CompositeAbstract nod) {
		throw new UnsupportedOperationException();
	}

	public void stergeNod(CompositeAbstract nod) {
		throw new UnsupportedOperationException();
	}

	public CompositeAbstract getNod(int index) {
		throw new UnsupportedOperationException();
	}

	public abstract void descriere();
}
