package S4.G1079.Paraschivescu.Cristian.prototype;

public class testPrototype {

	public static void main(String[] args) {
		ACustomer c1 = new Customer().getPrototype("vip");
		ACustomer c2 = new Customer().getPrototype("vip");
		ACustomer c3 = new Customer().getPrototype("loyal");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		if(c1.getName() == c2.getName()) {
			System.out.println("La fel");
		}
	}

}
