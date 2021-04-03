package pojos;

import java.io.Serializable;

public abstract class Hardware implements Serializable{
	/**
	 * Versão serial da classe
	 */
	private static final long serialVersionUID = -983425940807148308L;
	
	protected String name, manufacturer;
	protected float averagePrice;
	
	public Hardware(String name, String manufacturer, float averagePrice) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.averagePrice = averagePrice;
	}
	
	@Override
	public String toString() {
		return "\nHardware { [name=" + name + ", manufacturer=" + manufacturer + ", averagePrice=" + averagePrice + "]\n\t";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * 
	 * @return Quem fabricou o hardware
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * 
	 * @param manufacturer Quem fabricou o hardware
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public float getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(float averagePrice) {
		this.averagePrice = averagePrice;
	}
	
}
