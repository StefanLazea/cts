package composite.clase;

public interface ICompositeCategory {
	public void addMechanic(ICompositeCategory mechanic);
	public ICompositeCategory getMechanic(int index);
	public void deleteMechanic(ICompositeCategory mechanic);
	public void description(String delimiter);
}
