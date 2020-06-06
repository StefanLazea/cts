package factory.simple.clase;

public class JucatorFactory {
	public IJucator antreneaza(TipJucator jucator) {
		switch (jucator) {
		case Atacant:
			return new Atacant();
		case Fundas:
			return new Fundas();
		case Portar:
			return new Portar();
		default:
			return null;
		}
	}
}
