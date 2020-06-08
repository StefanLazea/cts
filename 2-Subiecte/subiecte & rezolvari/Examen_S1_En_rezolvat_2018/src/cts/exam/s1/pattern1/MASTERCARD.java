package cts.exam.s1.pattern1;

public class MASTERCARD implements OnlinePaymentInterface{
	String clientName;
	String eventName;
	double amount;
	Receiver inovker;
	
	public MASTERCARD(String clientName, String eventName, double amount,Receiver receiver) {
		super();
		this.clientName = clientName;
		this.eventName = eventName;
		this.amount = amount;
		this.inovker = receiver;
	}



	@Override
	public void onlinePay() {
		// TODO Auto-generated method stub
		System.out.println("Clientul " +this.clientName + "suma " + this.amount +" event" + this.eventName);
		this.inovker.platitMasterCard();
	}
	
	
}
