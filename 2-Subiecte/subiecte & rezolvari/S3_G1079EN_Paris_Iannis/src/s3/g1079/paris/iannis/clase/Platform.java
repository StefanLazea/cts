package s3.g1079.paris.iannis.clase;
import java.util.ArrayList;

import s3.g1079.paris.iannis.junit.DurationException;

public class Platform {

	private int platformNo;
	private int daySinceLastInspection;
	private ArrayList<Integer> piecesCost;

	public Platform(int platformNo, int noDays) throws DurationException {
		this.platformNo = platformNo;
		this.daySinceLastInspection = noDays;
		piecesCost = new ArrayList<>();
	}
	
	public ArrayList<Integer> getPiecesCost() {
		return piecesCost;
	}

	public void setPiecesCost(ArrayList<Integer> piecesCost) {
		this.piecesCost = piecesCost;
	}
	
	public int getNoDays() {
		return this.daySinceLastInspection;
	}
	
	public void setNoDays(int noDays) throws DurationException {
		if(noDays < 0 || noDays > 1000) {
			throw new DurationException();
		}
		this.daySinceLastInspection = noDays;
	}

	public boolean isInspectionNecessary() {
		if(this.daySinceLastInspection > 365) {
			return true;
		} else {
			return false;
		}
	}
	
	public int totalCost() {
		int total = 10;
		for(int cost : piecesCost)
			total += cost;
		return total;
	}
	

	public int getVehicleTransportCost(IVehicle vehicle) {
		if(vehicle.getWeight() > 2000)
			return 150;
		else
			return 90;
	}

}
