package pojos;

import java.io.Serializable;



public class VideoCard extends Hardware implements Serializable {

	/**
	 * Versão serial da classe
	 */
	private static final long serialVersionUID = -5991927222711955547L;
	
	private float memory, clock, interfaceWidth;
	private String construtor;
	
	public VideoCard(String name, String manufacturer, float averagePrice, float memory, float clock,
			float interfaceWidth, String construtor) {
		super(name, manufacturer, averagePrice);
		this.memory = memory;
		this.clock = clock;
		this.interfaceWidth = interfaceWidth;
		this.construtor = construtor;
	}

	/**
	 * 
	 * @return Quantidade de memória em GB
	 */
	public float getMemory() {
		return memory;
	}

	/**
	 * 
	 * @param memory em GB
	 */
	public void setMemory(float memory) {
		this.memory = memory;
	}

	/**
	 * 
	 * @return o clock (boost clock) em MHz 
	 */
	public float getClock() {
		return clock;
	}

	/**
	 * 
	 * @param clock em MHz
	 */
	public void setClock(float clock) {
		this.clock = clock;
	}

	public float getInterfaceWidth() {
		return interfaceWidth;
	}

	public void setInterfaceWidth(float gbps) {
		this.interfaceWidth = gbps;
	}

	/**
	 * 
	 * @return Nome de quem fez a construção da placa
	 */
	public String getConstrutor() {
		return construtor;
	}

	/**
	 * 
	 * @param construtor Quem fez a construção da placa
	 */
	public void setConstrutor(String construtor) {
		this.construtor = construtor;
	}

	@Override
	public String toString() {
		return super.toString() + "VideoCard [memory=" + memory + ", clock=" + clock + ", interfaceWidth=" + interfaceWidth
				+ ", construtor=" + construtor + "]\n}";
	}
	
	
	
	
}
