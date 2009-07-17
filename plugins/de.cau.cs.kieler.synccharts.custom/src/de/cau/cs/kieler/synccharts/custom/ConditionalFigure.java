package de.cau.cs.kieler.synccharts.custom;

import java.util.List;

import org.eclipse.draw2d.Figure;

// A ConditionalFigure contains a figure and a list of conditions that
// indicate when the figure is to be drawn
public class ConditionalFigure {
	private List<Condition> conditions;
	private Figure figure;
	
	public ConditionalFigure (List<Condition> c, Figure f) {
		conditions = c;
		figure = f;
	}
	
	public List<Condition> getConditions() {
		return conditions;
	}
	
	public Figure getFigure() {
		return figure;
	}
}
