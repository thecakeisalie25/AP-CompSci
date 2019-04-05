package ch09.ex07;

/**
 * Electronic
 */
public abstract class Electronic {

    private int voltage;
    public Electronic(int voltage) {
        this.setVoltage(voltage);
    }
	/**
	 * @return the voltage
	 */
	public int getVoltage() {
		return voltage;
	}
	/**
	 * @param voltage the voltage to set
	 */
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
    
}