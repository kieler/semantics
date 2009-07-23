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

/**
 * This class represents connections that are able to chnage their appearance
 * when properties their corresponding model element change.
 * 
 * @author schm
 *
 */

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
	
	/**
	 * The constructor.
	 */
	public AttributeAwareConnection() {
		super();
	}
	
	/**
	 * A method to set the layout of the figure.
	 * @param l
	 * @deprecated Do not use this.
	 */
	public void setLayout(AbstractLayout l) {
		layout = l;
	}
	
	/**
	 * Returns the modelElement the connection is supposed to react to.
	 * @return The model element
	 */
	public EObject getModelElement() {
		return modelElement;
	}
	
	/**
	 * This method tells a connection which edit part it has to watch.
	 * @param e The edit part to watch.
	 */
	// This method is used to establish a link between the figure and its EditPart
	public void setModelElementAndRegisterFromEditPart(EditPart e) {
		modelElement = ((View) (e.getModel())).getElement();
		((Notifier) modelElement).eAdapters().add(this);
	}
	
	/**
	 * Set the default look of the connection.
	 * @param look The look that is used if no condition is fulfilled.
	 */
	public void setDefaultLook(ConditionalConnectionLook look) {
		defaultLook = look;
	}
	
	/**
	 * Returns the default look.
	 * @return The look that is to be used if no condition is fulfilled.
	 */
	public ConditionalConnectionLook getDefaultLook() {
		return defaultLook;
	}
	
	/**
	 * Add a new conditionalConnectionLook to the connection.
	 * @param cf the conditionalConnectionLook to add.
	 */
	public void addConditionalFigure(ConditionalConnectionLook cf) {
		conditionalFigureList.add(cf);
	}
	
	/**
	 * @deprecated Do not use this.
	 */
	public Notifier getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @deprecated Do not use this.
	 */
	public boolean isAdapterForType(Object type) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Adjust the look of the connection according to the changes
	 * recorded in the notification.
	 * @param notification The notification that contains the changes to the model element.
	 */
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

	/**
	 * @deprecated Do not use this.
	 */
	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Set the current look of the connection.
	 * @param look The current look.
	 */
	protected void setLook(ConditionalConnectionLook look) {
		this.setSourceDecoration(look.getSourceDeco());
		this.setTargetDecoration(look.getTargetDeco());
	}

}
