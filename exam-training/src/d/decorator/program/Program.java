package d.decorator.program;

import d.decorator.Card;
import d.decorator.DecoratorAbstract;
import d.decorator.DecoratorConcret;
import d.decorator.ICard;

public class Program {
	public static void main(String[] args) {
		Card card = new Card();
		card.plataNormala();
		DecoratorAbstract cardUpdate = new DecoratorConcret(card);
		cardUpdate.plataContactLess();
	}
}
