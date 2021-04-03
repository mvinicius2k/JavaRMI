package main.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Bind {
	
	private String nickServer;
	private int port;
	private Registry registry;
	
	public Bind(String nickServer, int port) throws RemoteException {
		super();
		this.nickServer = nickServer;
		this.port = port;
		
		//Resolve o registro
		try {
			this.registry = LocateRegistry.createRegistry(port);

		} catch (RemoteException e) {
			this.registry = LocateRegistry.getRegistry(port);
			
		}
	}

	public String getNickServer() {
		return nickServer;
	}
	
	public int getPort() {
		return this.port;
	}

	/**
	 * Inicia o servidor
	 */
	public void go() {
		
		
		
		try {
			RemoteHeader header = new RemoteHeader();
			
			
			
			registry.rebind(nickServer, header);
			System.out.println("Servidor em execução");
			
			
			
			header.getHardwareList().addAll(Mocker.getHardwareList());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
}
