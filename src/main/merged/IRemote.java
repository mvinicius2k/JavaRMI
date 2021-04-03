package main.merged;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import pojos.Hardware;

public interface IRemote extends Remote{
	
	public String getToString() throws RemoteException;
	public List<Hardware> getOrderByPrice() throws RemoteException;
	public List<Hardware> getWithName(String name) throws RemoteException;
	public List<Hardware> getListSsd() throws RemoteException;
}
