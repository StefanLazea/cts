package clase;

public class Ospatar extends TemplateRestaurant {

	@Override
	public void curataMasa(int codMasa) {
		System.out.println("se curata masa cu codul " + codMasa);
	}

	@Override
	public void aseazaServetele(int codMasa) {
		System.out.println("sunt asezate servetele pe masa codul " + codMasa);
	}

	@Override
	public void asezareTacamuri(int codMasa) {
		System.out.println("sunt asezate tacamuri pe masa codul " + codMasa);
	}

	@Override
	public void invitaPersoanaLaMasa(int codMasa) {
		System.out.println("Este invitata persoana la masa " + codMasa);
	}

}
