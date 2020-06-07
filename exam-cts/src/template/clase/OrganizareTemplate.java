package template.clase;

public abstract class OrganizareTemplate {
	public abstract void asezareCoada();
	public abstract void prezentareBilet();
	public abstract void controlCorporal();
	public abstract void intrareStadion();
	public abstract void ocupareLoc();
	
	public final void asezarePersoana() {
		asezareCoada();
		prezentareBilet();
		controlCorporal();
		intrareStadion();
		ocupareLoc();		
	}
}
