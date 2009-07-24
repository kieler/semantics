package de.cau.cs.kieler.sim.kiem.data;

/**
 * The Class KiemPropertyError defines an error that can be thrown
 * by DataComponents if the properties are not correct set. This is 
 * checked prior to initialization and will prevent execution.
 */
public class KiemPropertyException extends Exception {

	private static final long serialVersionUID = -1023528743545009469L;

	public KiemPropertyException(String message) {
		super(message);
	}
}
