package S4.G1079.Paraschivescu.Cristian.prototype;

import java.util.HashMap;

public class Customer {
	private static HashMap<String, ACustomer> prototipuri = new HashMap<>();
	
	static {
		Customers c1 = new Customers();
		LoyalClients c2 = new LoyalClients();
		VIPClients c3 = new VIPClients();
		prototipuri.put("customer", c1);
		prototipuri.put("loyal", c2);
		prototipuri.put("vip", c3);
	}
	
	public static ACustomer getPrototype(String type) {
		ACustomer obj = null;
		ACustomer protCustomer = prototipuri.get(type);
		if(protCustomer != null) {
			obj = (ACustomer)protCustomer.clone();
		}
		return obj;
	}
}
