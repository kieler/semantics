package de.cau.cs.kieler.synccharts.custom;

import java.util.List;

import org.eclipse.draw2d.RotatableDecoration;

/**
 * This class represents ConnectionLooks that are valid under certain conditions.
 * It consists of a list of conditions and the decorations that are to be drawn if the
 * conditions are fulfilled.
 * @author schm
 *
 */
// A ConditionalConnectionLook contains decorations and conditions which
// indicate when the decorations are to be used
public class ConditionalConnectionLook {

	private List<Condition> conditions;
	private RotatableDecoration sourceDeco;
	private RotatableDecoration targetDeco;
		
	/**
	 * The Constructor.
	 * @param c List of conditions.
	 * @param sD Source decoration.
	 * @param tD Target decoration.
	 */
	public ConditionalConnectionLook (List<Condition> c, RotatableDecoration sD, RotatableDecoration tD) {
		conditions = c;
		sourceDeco = sD;
		targetDeco = tD;
	}
	
	/**
	 * Return the conditions.
	 * @return List of conditions.
	 */
	public List<Condition> getConditions() {
		return conditions;
	}
	
	/**
	 * Return the source decoration.
	 * @return Source decoration.
	 */
	public RotatableDecoration getSourceDeco() {
		return sourceDeco;
	}
	
	/**
	 * Return the target decoration.
	 * @return Target decoration.
	 */
	public RotatableDecoration getTargetDeco() {
		return targetDeco;
	}
	
}
