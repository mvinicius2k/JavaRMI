package pojos;

import java.io.Serializable;

public class Cpu extends Hardware implements Serializable {

	/**
	 * Versão serial da classe
	 */
	private static final long serialVersionUID = 3922890400229019395L;

	private float clock, cacheMememory;
	private int cores, threads;
	
	
	
	public Cpu(String name, String manufacturer, float averagePrice, float clock, float cacheMememory, int cores,
			int threads) {
		super(name, manufacturer, averagePrice);
		this.clock = clock;
		this.cacheMememory = cacheMememory;
		this.cores = cores;
		this.threads = threads;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + "Cpu [clock=" + clock + ", cacheMememory=" + cacheMememory + ", cores=" + cores + ", threads=" + threads
				+ "]\n}";
	}



	/**
	 * 
	 * @return MHz
	 */
	public float getClock() {
		return clock;
	}
	
	/**
	 * 
	 * @param clock MHz
	 */
	public void setClock(float clock) {
		this.clock = clock;
	}
	
	/**
	 * 
	 * @return Quantidade de memória cache, em MB
	 */
	public float getCacheMememory() {
		return cacheMememory;
	}
	
	/**
	 * 
	 * @param cacheMememory MB
	 */
	public void setCacheMememory(float cacheMememory) {
		this.cacheMememory = cacheMememory;
	}
	
	public int getCores() {
		return cores;
	}
	
	public void setCores(int cores) {
		this.cores = cores;
	}
	
	public int getThreads() {
		return threads;
	}
	
	public void setThreads(int threads) {
		this.threads = threads;
	}
	
	
	
}
