package de.cau.cs.kieler.synccharts.custom;

import java.util.List;

import org.eclipse.draw2d.RotatableDecoration;

// A ConditionalConnectionLook contains decorations and conditions which
// indicate when the decorations are to be used
public class ConditionalConnectionLook {

	private List<Condition> conditions;
	private RotatableDecoration sourceDeco;
	private RotatableDecoration targetDeco;
		
	public ConditionalConnectionLook (List<Condition> c, RotatableDecoration sD, RotatableDecoration tD) {
		conditions = c;
		sourceDeco = sD;
		targetDeco = tD;
	}
	
	public List<Condition> getConditions() {
		return conditions;
	}
	
	public RotatableDecoration getSourceDeco() {
		return sourceDeco;
	}
	
	public RotatableDecoration getTargetDeco() {
		return targetDeco;
	}
	
}
