package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSpital {
	private List<Memento> mementouri;

	public ManagerSpital() {
		this.mementouri = new ArrayList<Memento>();
	}
	
	public void adaugareMemento(Memento memento) {
		mementouri.add(memento);
	}
	
	public Memento extragereMemento(int index) {
		return mementouri.get(index);
	}
	
}
