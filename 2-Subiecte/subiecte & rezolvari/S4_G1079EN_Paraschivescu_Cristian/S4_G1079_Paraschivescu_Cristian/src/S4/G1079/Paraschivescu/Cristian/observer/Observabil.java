package S4.G1079.Paraschivescu.Cristian.observer;

import java.util.ArrayList;

public abstract class Observabil {
	private ArrayList<IObserver> list = new ArrayList<>();
	
	public void addObserver(IObserver obs) {
		list.add(obs);
	}
	
	public void removeObserver(IObserver obs) {
		list.remove(obs);
	}
	
	public void notifyAllObs(String message) {
		if(list != null) {
			for(IObserver obs: list) {
				obs.act(message);
			}
		}
	}
}
