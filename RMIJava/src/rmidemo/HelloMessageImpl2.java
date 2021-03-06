package rmidemo;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloMessageImpl2 extends UnicastRemoteObject implements IHelloMessage , Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected HelloMessageImpl2() throws RemoteException {
		super();
	}

	@Override
	public String hello(String name) throws RemoteException {
		System.out.println("Server Message "+ name);
		return "Hello How are you doing "+ name +" !!!. Good morning...";
	}
}
