package s07.grupa1072.tudorache.andreea.dp2.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerDocumente {

	private List<MementoDocument> listaDocumente = new ArrayList<>();
	
	public void adaugaMemento(MementoDocument memento)
	{
		listaDocumente.add(memento);
	}
	
	public MementoDocument getMemento(int index)
	{
		return listaDocumente.get(index);
	}
	
	public MementoDocument getFirstMemento() throws Exception
	{
		if(listaDocumente.size() != 0)
		{
			MementoDocument memento = listaDocumente.get(0);
			listaDocumente.remove(0);
			return memento;
		}
		else
		{
			throw new Exception ("Nu exista versiuni salvate");
		}
	}
}