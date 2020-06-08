package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class AutoMechanicsEngineer implements ICompositeCategory {
	private String jobTitle;
	private List<ICompositeCategory> mechanics;

	public AutoMechanicsEngineer(String jobTitle) {
		super();
		this.jobTitle = jobTitle;
		this.mechanics = new ArrayList<ICompositeCategory>();
	}

	@Override
	public void addMechanic(ICompositeCategory mechanic) {
		this.mechanics.add(mechanic);
	}

	@Override
	public ICompositeCategory getMechanic(int index) {
		return this.mechanics.get(index);
	}

	@Override
	public void deleteMechanic(ICompositeCategory mechanic) {
		this.mechanics.remove(mechanic);
	}

	@Override
	public void description(String delimiter) {
		System.out.println(delimiter + "Engineer " + this.jobTitle);
		for (ICompositeCategory category : this.mechanics) {
			category.description(delimiter + " ");
		}
	}

}
