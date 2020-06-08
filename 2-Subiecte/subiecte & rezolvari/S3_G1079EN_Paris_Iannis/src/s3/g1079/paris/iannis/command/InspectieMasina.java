package s3.g1079.paris.iannis.command;

import s3.g1079.paris.iannis.clase.InspectionScheduler;

public class InspectieMasina implements Inspection{
	//referinta la recevier
	//constructor
	Receiver r;
	
	
	public InspectieMasina(Receiver r) {
		super();
		this.r = r;
	}


	@Override
	public void detaliiInspectie() {
		// TODO Auto-generated method stub
		//refertina.afisare
		r.rezolvaInsectiaMasinii();
	}

	
}
