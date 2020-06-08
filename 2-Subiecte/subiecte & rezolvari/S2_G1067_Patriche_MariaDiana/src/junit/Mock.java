package junit;

import java.util.ArrayList;

public class Mock implements ILogAcces {
	boolean salvareDate;


	public boolean isSalvareDate() {
		return salvareDate;
	}


	public void setSalvareDate(boolean salvareDate) {
		this.salvareDate = salvareDate;
	}


	@Override
	public boolean salvareDate(ArrayList<Integer> valori) {		
		return true;
	}
	
	
}
