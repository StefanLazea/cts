package cts.examen.s2.unittesting;

public class IncomingPatient {
	String name;
	boolean isUnconscious;
	float bodyTemp;

	public IncomingPatient(String name, boolean isUnconscious, float bodyTemp) throws ExceptieGenerala {
		super();
		this.isUnconscious = isUnconscious;
		if (bodyTemp > 32 && bodyTemp < 40 && name.length() >= 5) {
			this.bodyTemp = bodyTemp;
			this.name = name;
		} else {
			throw new ExceptieGenerala();
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isUnconscious() {
		return isUnconscious;
	}

	public void setUnconscious(boolean isUnconscious) {
		this.isUnconscious = isUnconscious;
	}

	public float getBodyTemp() {
		return this.bodyTemp;
	}

	public void setBodyTemp(float bodyTemp) throws ExceptieGenerala {
		if (bodyTemp > 32 && bodyTemp < 40)
			this.bodyTemp = bodyTemp;
		else
			throw new ExceptieGenerala();
	}

	public float minDrugPrice(float[] prices) throws ExceptieGenerala {
		float min = 1000;
		if (prices != null) {
			for (float price : prices)
				if (min > price)
					min = price;
			return min;
		} else {
			throw new ExceptieGenerala();
		}

	}

}
