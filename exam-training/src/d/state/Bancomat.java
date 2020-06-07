package d.state;

public class Bancomat {
	private String nume;
	private double sumaBani;
	private Stare stare;

	public Bancomat(String nume, double sumaBani) {
		super();
		this.nume = nume;
		this.sumaBani = sumaBani;
		this.stare = new StareNuAreCard();
	}

	public void setStare(Stare stare) {
		this.stare = stare;
	}

	public void verificaSold() {
		if (this.sumaBani <= 0) {
			this.stare = new StareNuAreBani();
		}else {
			System.out.println("Bancomatul are fonduri");
		}
	}

	public void introducerePin() {
		if (!(stare instanceof StareArePinIntrodus) && !(stare instanceof StareNuAreBani)) {
			this.setStare(new StareArePinIntrodus());
			System.out.println("A fost introdus PIN-ul");
		} else {
			System.out.println("Nu se poate introduce PIN-ul");
		}
	}

	public void retragere(double suma) {
		if (this.sumaBani > 0 && this.stare instanceof StareArePinIntrodus) {
			this.sumaBani -= suma;
			this.stare = new StareNuAreBani();
		} else {
			System.out.println("Nu se pot retrage bani");
		}

	}

}
