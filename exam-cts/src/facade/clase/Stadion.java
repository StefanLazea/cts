package facade.clase;

import java.util.HashMap;
import java.util.Map;

public class Stadion {
	private Map<String, String> bilete;

	public Stadion() {
		super();
		this.bilete = new HashMap<String, String>();
	}

	public void initBilete() {
		this.bilete.put("A11", "Ion");
		this.bilete.put("A33", "George");
	}

	public boolean verificaBilet(Persoana p, String serie) {
		System.out.println(this.bilete.toString());
		for (Map.Entry<String, String> m : this.bilete.entrySet()) {
			if (m.getKey() == serie && m.getValue() == p.getNume()) {
				return true;
			}
		}
		return false;
	}
}
