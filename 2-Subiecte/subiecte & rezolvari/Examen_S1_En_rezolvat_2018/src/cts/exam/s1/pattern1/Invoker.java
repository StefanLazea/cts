package cts.exam.s1.pattern1;

public class Invoker extends OnlinePaymentProcessor {
	Receiver r;

	public Invoker(String processorName,Receiver r) {
		super(processorName);
		this.r=r;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void processPayment(String clientName, String eventName, double amount) {
		OnlinePaymentInterface e = null;
		switch (eventName) {
		case "paypal":
			e = new PAYPAL(clientName, eventName, amount,r);
			break;
		case "visa":
			e = new VISA(clientName, eventName, amount,r);
			break;
		case "master":
			e = new MASTERCARD(clientName, eventName, amount,r);
			break;
		}
		this.plati.add(e);
	}



	@Override
	public void trimitePlati() {
		// TODO Auto-generated method stub
		System.out.println("Se trimit platile!");
		for (OnlinePaymentInterface e : plati) {
			e.onlinePay();
		}
	}

}
