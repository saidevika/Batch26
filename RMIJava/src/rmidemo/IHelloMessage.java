package rmidemo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloMessage extends Remote {
	public String hello(String name) throws RemoteException;
	public String getEmployeeName(int empId) throws RemoteException;
}