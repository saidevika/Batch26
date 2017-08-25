package rmidemo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainApp {

	public static void main(String[] args) throws Exception {
		Registry registry = LocateRegistry.getRegistry("localhost",4567);
		IHelloMessage ihm = (IHelloMessage)registry.lookup("HelloMessage");
		String message = ihm.hello("Ramesh");
		System.out.println(message);
		
		
		IHelloMessage ihm2 = new HelloMessageImpl();
		message = ihm2.hello("Ramesh");
		System.out.println(message);
		
	}
}
