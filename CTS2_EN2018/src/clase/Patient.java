package clase;

public class Patient {
	private String name;
	private boolean temperature;
	private boolean bleeding;
	private boolean unconscious;

	public Patient(String name, boolean temperature, boolean bleeding, boolean unconscious) {
		super();
		this.name = name;
		this.temperature = temperature;
		this.bleeding = bleeding;
		this.unconscious = unconscious;
	}

	public String getName() {
		return name;
	}

	public boolean isTemperature() {
		return temperature;
	}

	public boolean isBleeding() {
		return bleeding;
	}

	public boolean isUnconscious() {
		return unconscious;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTemperature(boolean temperature) {
		this.temperature = temperature;
	}

	public void setBleeding(boolean bleeding) {
		this.bleeding = bleeding;
	}

	public void setUnconscious(boolean unconscious) {
		this.unconscious = unconscious;
	}

	
}
