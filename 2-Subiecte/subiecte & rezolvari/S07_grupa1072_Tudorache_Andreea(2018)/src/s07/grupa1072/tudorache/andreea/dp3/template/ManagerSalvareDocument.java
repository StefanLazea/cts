package s07.grupa1072.tudorache.andreea.dp3.template;

public class ManagerSalvareDocument extends ManagerSalvare{

	public boolean verificaDimensiunea (double dim)
	{
		if(dim>3000)
			return false;
		return true;
	}
	
	public void copiazaPeDisc()
	{
		System.out.println("Se copiaza pe disc ");
	}
	
	public void returneazaMesaj(boolean statusDim)
	{
		if(statusDim == true)
		{
			System.out.println("Succes");
		}
		else
			System.out.println("Error");
	}

	
}