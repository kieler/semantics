package de.cau.cs.kieler.synccharts.custom;

import java.util.List;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

public class AttributeAwareFigure extends Figure implements Adapter {

	// This list contains all possible figures and when they are to be displayed	
	protected List<ConditionalFigure> conditionalFigureList;
	// This figure's corresponding model element
	protected EObject modelElement;
	// The default figure that is to be displayed when no conditionalFigure's 
	// conditions are all fulfilled
	protected Figure defaultFigure;
	// The figure that will be drawn when the paint method is called
	protected Figure currentFigure;
	protected AbstractLayout layout;
	
	public AttributeAwareFigure() {
		super();
	}
	
	public void setLayout(AbstractLayout l) {
		layout = l;
	}
	
	public EObject getModelElement() {
		return modelElement;
	}
	
	// This method is used to establish a link between the figure and its EditPart
	public void setModelElementAndRegisterFromEditPart(EditPart e) {
		modelElement = ((View) (e.getModel())).getElement();
		((Notifier) modelElement).eAdapters().add(this);
	}
	
	public void setDefaultFigure(Figure f) {
		defaultFigure = f;
	}
	
	// Instead of painting the figure itself, its currentFigure is painted
	// after its bounds have been adjusted
	@Override
	public void paint(Graphics g){
		super.paint(g);
		Rectangle newBounds = new Rectangle();
		newBounds.x = this.getBounds().x + 1;
		newBounds.y = this.getBounds().y + 1;
		newBounds.width = this.getBounds().width - 1;
		newBounds.height = this.getBounds().height - 1;
		currentFigure.setBounds(newBounds);
		currentFigure.paint(g);
	}
	
	public Figure getCurrentFigure() {
		return currentFigure;
	}
	
	public void setCurrentFigure(Figure f) {
		currentFigure = f;
	}
	
	public void addConditionalFigure(ConditionalFigure cf) {
		conditionalFigureList.add(cf);
	}
	
	public Notifier getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isAdapterForType(Object type) {
		// TODO Auto-generated method stub
		return false;
	}

	// If the model element's properties have changed, adjust currentFigure
	public void notifyChanged(Notification notification) {
		try {	
			for (ConditionalFigure cf : conditionalFigureList) {
				boolean fulfilled = true;
				for (Condition c : cf.getConditions()) {
					if (!(c.isValid(modelElement))) {
						fulfilled = false;
						break;
					}
				}
				if (fulfilled) {
					setCurrentFigure(cf.getFigure());
					break;
				} 
				else {
					setCurrentFigure(defaultFigure);
				}
			}
		}
		catch (Exception e) {
			
		}
		this.repaint();
	}

	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub
		
	}
}
