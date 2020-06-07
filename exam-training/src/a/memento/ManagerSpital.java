package a.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerSpital {
	private List<MementoPacient> mementouri;

	public ManagerSpital() {
		this.mementouri = new ArrayList<MementoPacient>();
	}

	public void adaugareMemento(MementoPacient memento) {
		mementouri.add(memento);
	}

	public MementoPacient getMemento(int index) {
		return mementouri.get(index);
	}

	public MementoPacient getLastMePacient() {
		MementoPacient mem = mementouri.get(this.mementouri.size() - 1);
		mementouri.remove(mem);
		return mem;
	}

}
