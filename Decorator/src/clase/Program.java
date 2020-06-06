package clase;

public class Program {

	public static void main(String[] args) {
		Card card = new Card();
		card.plataNormala();
		card.plataOnline();
		
//		DecoratorCard cardUpdated = new DecoratorCard(card);
		DecoratorCardAbstract cardUpdated = new DecoratorCard(card);
		cardUpdated.plataNormala();
		cardUpdated.plataOnline();
		cardUpdated.plataContactless();
	}

}
