package pojos;

import java.io.Serializable;

public class Ssd extends Hardware implements Serializable {

	
	private static final long serialVersionUID = 803247144408646991L;
	
	private float capacity, writeSpeed, readSpeed;
	private long life;
	private boolean m2;
	
	
	
	public Ssd(String name, String manufacturer, float averagePrice, float capacity, float writeSpeed, float readSpeed,
			long life, boolean m2) {
		super(name, manufacturer, averagePrice);
		this.capacity = capacity;
		this.writeSpeed = writeSpeed;
		this.readSpeed = readSpeed;
		this.life = life;
		this.m2 = m2;
	}
	
	/**
	 * 
	 * @return GB
	 */
	public float getCapacity() {
		return capacity;
	}
	
	/**
	 * 
	 * @param capacity GB
	 */
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	/**
	 * 
	 * @return MB/s
	 */
	public float getWriteSpeed() {
		return writeSpeed;
	}
	/**
	 * 
	 * @param writeSpeed MB/s
	 */
	public void setWriteSpeed(float writeSpeed) {
		this.writeSpeed = writeSpeed;
	}
	/**
	 * 
	 * @return MB/s
	 */
	public float getReadSpeed() {
		return readSpeed;
	}
	/**
	 * 
	 * @param readSpeed MB/s
	 */
	public void setReadSpeed(float readSpeed) {
		this.readSpeed = readSpeed;
	}
	
	/**
	 * 
	 * @return quantidade de ciclos
	 */
	public long getLife() {
		return life;
	}
	/**
	 * 
	 * @param life quantidade de ciclos
	 */
	public void setLife(long life) {
		this.life = life;
	}
	
	public boolean isM2() {
		return m2;
	}
	public void setM2(boolean m2) {
		this.m2 = m2;
	}

	@Override
	public String toString() {
		return super.toString() + "Ssd [capacity=" + capacity + ", writeSpeed=" + writeSpeed + ", readSpeed=" + readSpeed + ", life="
				+ life + ", m2=" + m2 + "]\n}";
	}
	
	
	
	

}
