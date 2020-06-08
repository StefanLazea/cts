package junit.mock;

import java.util.ArrayList;

import junit.interfete.ILogAcces;

public class Mock implements ILogAcces {

	private boolean suntSalvateDatele;
	
	public void setSalvareDate(boolean suntSalvate) {
		this.suntSalvateDatele=suntSalvate;
	}
	@Override
	public boolean salvareDate(ArrayList<Integer> valori) {
		// TODO Auto-generated method stub
		return this.suntSalvateDatele;
	}

}
