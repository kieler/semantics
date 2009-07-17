package de.cau.cs.kieler.synccharts.custom;

import java.util.List;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

public class AttributeAwareConnection extends PolylineConnectionEx implements Adapter {

	// The look of a figure contains only its decorations, but can easily
	// be extended to also contain line color etc.
	// This list contains all possible looks and when they are to be displayed
	protected List<ConditionalConnectionLook> conditionalFigureList;
	
	// The model element that corresponds to this figure
	protected EObject modelElement;
	protected AbstractLayout layout;
	// The default look that is to be displayed when no conditionalFigure's 
	// conditions are all fulfilled
	protected ConditionalConnectionLook defaultLook;
	
	
	public AttributeAwareConnection() {
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
	
	public void setDefaultLook(ConditionalConnectionLook look) {
		defaultLook = look;
	}
	
	public ConditionalConnectionLook getDefaultLook() {
		return defaultLook;
	}
	
	public void addConditionalFigure(ConditionalConnectionLook cf) {
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

	// If the model element's properties have changed,  adjust figure's look
	public void notifyChanged(Notification notification) {
		for (ConditionalConnectionLook cf : conditionalFigureList) {
			boolean fulfilled = true;
			for (Condition c : cf.getConditions()) {
				if (!(c.isValid(modelElement))) {
					fulfilled = false;
					break;
				}
			}
			if (fulfilled) {
				setLook(cf);
				break;
			} 
			else {
				setLook(defaultLook);
			}
		}
		this.repaint();
	}

	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub
		
	}
	
	protected void setLook(ConditionalConnectionLook look) {
		this.setSourceDecoration(look.getSourceDeco());
		this.setTargetDecoration(look.getTargetDeco());
	}

}
