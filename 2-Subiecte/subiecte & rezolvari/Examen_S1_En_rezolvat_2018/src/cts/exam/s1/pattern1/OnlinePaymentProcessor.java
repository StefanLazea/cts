package cts.exam.s1.pattern1;

import java.util.ArrayList;

public abstract class OnlinePaymentProcessor {
	String processorName;
	//1
	ArrayList<OnlinePaymentInterface> plati = new ArrayList<OnlinePaymentInterface>();
	
	
	public OnlinePaymentProcessor(String processorName){
		this.processorName = processorName;
	}
	
	public abstract void processPayment(String clientName, String eventName, double amount);
	
	//2
	public abstract void trimitePlati();
}
