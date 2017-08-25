package rmidemo;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloMessageServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		IHelloMessage ihmObject = new HelloMessageImpl();
		
		System.out.println("Binding my Implementation.....");
		Registry registry = LocateRegistry.createRegistry(4567);
		registry.rebind("HelloMessage", ihmObject);
		System.out.println("Binding is finished...");
		
		System.out.println("HelloMessage Server is up and running......");

	}

}
