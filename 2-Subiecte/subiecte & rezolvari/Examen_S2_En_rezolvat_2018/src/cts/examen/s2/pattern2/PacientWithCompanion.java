package cts.examen.s2.pattern2;

public class PacientWithCompanion extends Decorator{

	public PacientWithCompanion(Pacient pacient,String companion) {
		super(pacient);
		this.companionPersonName = companion;
	}
	
	

}
