package S4.G1079.Paraschivescu.Cristian.surse;

import java.util.ArrayList;

import S4.G1079.Paraschivescu.Cristian.testing.DurationException;

public class Platform {

	private int platformNo;
	private int daySinceLastInspection;
	private ArrayList<Integer> piecesCost;

	public Platform(int platformNo, int noDays) throws DurationException {
		this.platformNo = platformNo;
		this.daySinceLastInspection = noDays;
		this.piecesCost = new ArrayList<>();
	}
	
	public ArrayList<Integer> getPiecesCost() {
		return piecesCost;
	}

	public void setPiecesCost(ArrayList<Integer> piecesCost) {
		this.piecesCost = piecesCost;
	}

	public void setNoDays(int noDays) throws DurationException {
		if(noDays < 0  || noDays > 365) {
			throw new DurationException();
		}
		this.daySinceLastInspection = noDays;
	}

	public boolean isInspectionNecessary() {
		if(this.daySinceLastInspection > 365 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getDaySinceLastInspection() {
		return daySinceLastInspection;
	}

	public int totalCost() {
		int total = 10;
		for(int cost : piecesCost)
			total += cost;
		return total;
	}
	

	public int getVehicleTransportCost(IVehicle vehicle) throws Exception {
		if(vehicle.getWeight() > 2000) {
			throw new Exception();
		}
		if(vehicle.getWeight() > 1000)
			return 150;
		else
			return 90;
	}

}
