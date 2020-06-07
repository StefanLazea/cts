package template.clase;

public class Persoana extends OrganizareTemplate {

	@Override
	public void asezareCoada() {
		System.out.println("Persoana s-a asezat la coada");
	}

	@Override
	public void prezentareBilet() {
		System.out.println("Persoana a prezentat biletul");

	}

	@Override
	public void controlCorporal() {
		System.out.println("Persoana a fost supusa controlului corporal");
	}

	@Override
	public void intrareStadion() {
		System.out.println("Persoana a intrat in stadion");
	}

	@Override
	public void ocupareLoc() {
		System.out.println("Persoana s-a asezat pe locul lui");
	}

}
