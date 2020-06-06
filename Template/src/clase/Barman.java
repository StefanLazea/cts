package clase;

public class Barman extends TemplateRestaurant {

	@Override
	public void curataMasa(int codMasa) {
		System.out.println("picol, te rog, curata masa " + codMasa);
	}

	@Override
	public void aseazaServetele(int codMasa) {
		System.out.println("barmanul aseaza servetele");
	}

	@Override
	public void asezareTacamuri(int codMasa) {
		System.out.println("picol, te rog, aseaza tacamurile masa " + codMasa);
	}

	@Override
	public void invitaPersoanaLaMasa(int codMasa) {
		System.out.println("Barman a invitat persoanele la masa " + codMasa);
	}

}
