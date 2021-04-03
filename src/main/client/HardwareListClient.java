package main.client;

import java.rmi.Naming;
import java.util.ArrayList;

import main.merged.IRemote;
import main.server.Server;
import pojos.Hardware;

public class HardwareListClient {

	public static void main(String[] args) {
		//if(System.getSecurityManager() == null)
		//	System.setSecurityManager(new RMISecurityManager());
		IRemote remoteRef = null;
		
		try {
			
			remoteRef = (IRemote) Naming.lookup("//localhost:" + Server.port + "/" + Server.nickServer);
			String str = "";
			ArrayList<Hardware> array;
				
			str = remoteRef.getToString();
			
			System.out.println("Imprimindo Método 1 -> toString");
			System.out.println(str);
			
			array = (ArrayList<Hardware>) remoteRef.getOrderByPrice();
			
			System.out.println("\nImprimindo Método 2 -> Lista ordenada pelo preço");
			System.out.println(array.toString());
			
			array = (ArrayList<Hardware>) remoteRef.getWithName("GTX");
			
			System.out.println("\nImprimindo Método 3 -> Lista de hardwares que contenham 'GTX'");
			System.out.println(array.toString());
			
			array = (ArrayList<Hardware>) remoteRef.getListSsd();
			
			
			System.out.println("\nImprimindo Método 4 -> Lista de ssds do servidor ["+array.size()+" itens]");
			System.out.println(array.toString());
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
