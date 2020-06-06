package mementoabstract;

import clase.Memento;

public interface ISpital {
	public Memento salveazaMemento();
	public void restaurareDinMemento(Memento backup);
}
