package clase;

public class DecoratorCard extends DecoratorCardAbstract{

	public DecoratorCard(ICard cardAbstract) {
		super(cardAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plataContactless() {
		// TODO Auto-generated method stub
		System.out.println("S-a efectuat plata contactles");
	}

}
