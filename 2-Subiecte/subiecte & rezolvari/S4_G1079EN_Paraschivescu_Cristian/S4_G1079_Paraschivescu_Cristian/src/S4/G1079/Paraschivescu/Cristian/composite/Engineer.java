package S4.G1079.Paraschivescu.Cristian.composite;

import java.util.ArrayList;

public class Engineer extends ANod {
	private String engName;
	
	

	public Engineer(String engName) {
		super();
		this.engName = engName;
	}

	private ArrayList<ANod> structure = new ArrayList<>();
	
	@Override
	public void addNode(ANod nod) {
		structure.add(nod);
	}

	@Override
	public void removeNode(ANod nod) {
		structure.remove(nod);
	}

	@Override
	public ANod getNode(int index) {
		return structure.get(index);
	}

	@Override
	public String getInfo() {
		String info = this.engName + "\n";
		for(ANod nod: structure) {
			if(nod instanceof Mechanics) {
				info += " ";
			}
			info += " " + nod.getInfo() + "\n";
		}
		return info;
	}
	

}
