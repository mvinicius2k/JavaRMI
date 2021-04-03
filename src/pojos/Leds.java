package pojos;

import java.io.Serializable;

/**
 * 
 * Essa classe é uma brincadeira, um meme com a moda de
 * encher os computadores com LEDs super brilhosos, algumas vezes até
 * aumentando significamente o preço final do PC.
 *
 */
public class Leds extends Hardware implements Serializable {

	
	private static final long serialVersionUID = -17705253442759628L;
	
	private int count, countOfStates;
	
	private float performanceIncrease;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCountOfStates() {
		return countOfStates;
	}
	public void setCountOfStates(int countOfStates) {
		this.countOfStates = countOfStates;
	}
	public float getPerformanceIncrease() {
		return performanceIncrease;
	}
	public void setPerformanceIncrease(float performanceIncrease) {
		this.performanceIncrease = performanceIncrease;
	}
	
	
	
	/**
	 * @param name
	 * @param manufacturer
	 * @param averagePrice
	 * @param count
	 * @param countOfStates
	 * @param performanceIncrease
	 */
	public Leds(String name, String manufacturer, float averagePrice, int count, int countOfStates,
			float performanceIncrease) {
		super(name, manufacturer, averagePrice);
		this.count = count;
		this.countOfStates = countOfStates;
		this.performanceIncrease = performanceIncrease;
	}
	@Override
	public String toString() {
		return super.toString() + "Leds [count=" + count + ", countOfStates=" + countOfStates + ", performanceIncrease="
				+ performanceIncrease + "]\n}";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
