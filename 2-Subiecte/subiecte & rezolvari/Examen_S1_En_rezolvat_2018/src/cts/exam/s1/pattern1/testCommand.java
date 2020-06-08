package cts.exam.s1.pattern1;

public class testCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver r = new Receiver("BNR");
		Invoker invoker = new Invoker("Dorel",r);
		invoker.processPayment("Client1", "paypal", 20);
		invoker.processPayment("Client2", "visa", 20);
		invoker.processPayment("Client3", "master", 20);
		
		invoker.trimitePlati();
	}

}
