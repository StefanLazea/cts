package c.template;

public abstract class FarmacieTemplate {

	public abstract void primireReteta();

	public abstract void aducereMedicamente();

	public abstract void incasareBani();

	public abstract void emitereBon();

	public final void achizitieReteta() {
		primireReteta();
		aducereMedicamente();
		incasareBani();
		emitereBon();
	}

}
