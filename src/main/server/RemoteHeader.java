package main.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import main.merged.IRemote;
import pojos.Hardware;
import pojos.Ssd;

/**
 * Classe para dar corpo ao serviço fornecido pelo servidor
 * 
 *
 */
public class RemoteHeader extends UnicastRemoteObject implements IRemote {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5766721680184629783L;
	
	
	private List<Hardware> hardwareList;
	
	
	
	protected RemoteHeader() throws RemoteException {
		super();
		this.hardwareList = new ArrayList<Hardware>();
		
		
	}
	
	private String getTimeNowStr() {
		LocalDateTime local = LocalDateTime.now();
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		return local.format(format);
	}
	

	/**
	 * Retorna uma string da lista
	 */
	@Override
	public String getToString() throws RemoteException{
		
		System.out.println("Metodo getToString chamado às " + getTimeNowStr());
		
		return this.hardwareList.toString();
		
		
	}
	
	/**
	 * Ordena a lista pelo preço (maior) e a imprime 
	 */
	@Override
	public List<Hardware> getOrderByPrice() throws RemoteException {
		
		System.out.println("Metodo getOrderByPrice chamado em " + getTimeNowStr());
		
		ArrayList<Hardware> list = new ArrayList<>();
		list.addAll(hardwareList);
		
		
		
		list.sort(Comparator.comparing(Hardware::getAveragePrice).reversed());
		return list;
		
	}
	
	


	
	public List<Hardware> getHardwareList() {
		
		return hardwareList;
	}

	/**
	 * Imprime hardwares que tenham um {@link name}
	 */
	@Override
	public List<Hardware> getWithName(String name) throws RemoteException {
		System.out.println("Metodo getWithName chamado às " + getTimeNowStr());
		List<Hardware> list = new ArrayList<>();
				
		list.addAll(hardwareList);
		
		list.removeIf(s -> !s.getName().contains(name));
		
		return list;
		
	}

	/**
	 * Retorna uma lista de hardware que são SSD's
	 */
	@Override
	public List<Hardware> getListSsd() throws RemoteException {
		System.out.println("Metodo getListSsd chamado às " + getTimeNowStr());
		List<Hardware> list = new ArrayList<>();
				
		list.addAll(hardwareList);
		
		list.removeIf(s -> !(s instanceof Ssd));
		
		return list;
	}

	
	
}
