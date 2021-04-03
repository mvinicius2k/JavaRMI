package main.server;
import java.rmi.RemoteException;

public class Server {
	
	public static final String nickServer = "MeuServidor";
	public static final int port = 1237;

	
	public static void main(String[] args) {
		//System.setSecurityManager(new RMISecurityManager());
		
		Bind bind;
		try {
			bind = new Bind(nickServer, port);
			bind.go();
		} catch (RemoteException e) {
			System.out.println("Porta " + port + " já em uso");
		}
		 
		
		

		

	}
	
	

}
