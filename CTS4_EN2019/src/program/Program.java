package program;

import composite.clase.AutoMechanicsEngineer;
import composite.clase.ICompositeCategory;
import factory.clase.FactoryCustomer;
import factory.clase.FactoryLoyalCustomer;
import factory.clase.FactoryVIPClient;
import factory.clase.ICustomer;
import factory.clase.IFactory;
import observer.clase.ServiceAuto;

public class Program {
	public static void afisare(IFactory factory) {
		ICustomer customer = factory.createObject();
		customer.printCustomer();
	}
	public static void main(String[] args) {
		afisare(new FactoryCustomer());
		afisare(new FactoryLoyalCustomer());
		afisare(new FactoryVIPClient());
		
		
		//observer
		ICustomer customer = new FactoryCustomer().createObject();
		ICustomer customer2 = new FactoryLoyalCustomer().createObject();
		ICustomer customer3 = new FactoryVIPClient().createObject();

		ServiceAuto notifyer = new ServiceAuto("Mihai Bravu");
		notifyer.addObserver(customer);
		notifyer.addObserver(customer2);
		notifyer.addObserver(customer3);
		
		notifyer.notifyForMajorProblem();
		
		//composit
		ICompositeCategory engineer = new AutoMechanicsEngineer("Auto Mechanic Engineer");
		ICompositeCategory engineer2 = new AutoMechanicsEngineer("Auto Mechanic Engineer 2");

		ICompositeCategory mechanic = new AutoMechanicsEngineer("Auto Mechanic");
		ICompositeCategory mechanic2 = new AutoMechanicsEngineer("Auto Mechanic");
		ICompositeCategory mechanic3 = new AutoMechanicsEngineer("Auto Mechanic");
		
		engineer.addMechanic(mechanic);
		engineer.addMechanic(mechanic2);
		engineer.addMechanic(engineer2);
		engineer2.addMechanic(mechanic3);
		
		engineer.description("");		
	}
}
