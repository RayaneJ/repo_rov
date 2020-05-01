

public class Rover {

	private int x;

	private int y;

	private char ccpoint;

	public Rover(int x, int y, char ccpoint) {
		this.x = x;
		this.y = y;
		this.ccpoint = ccpoint;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the ccpoint
	 */
	public char getCcpoint() {
		return ccpoint;
	}

	/**
	 * @param ccpoint the ccpoint to set
	 */
	public void setCcpoint(char ccpoint) {
		this.ccpoint = ccpoint;
	}

	@Override
	public String toString() {
		return x + " " + y + " " + ccpoint;
	}

}
