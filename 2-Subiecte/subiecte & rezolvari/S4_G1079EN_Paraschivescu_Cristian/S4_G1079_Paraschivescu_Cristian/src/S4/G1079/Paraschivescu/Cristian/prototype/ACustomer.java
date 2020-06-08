package S4.G1079.Paraschivescu.Cristian.prototype;

public abstract class ACustomer implements Cloneable {
	protected String name;
	protected String type;
	
	
	@Override
	protected Object clone() {
		
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ACustomer [name=" + name + ", type=" + type + "]";
	}
	
}
