/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.custom;

import java.util.List;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * This class represents node figures that are aware of changes made to
 * their corresponding model element.
 * @author schm
 *
 */
public class AttributeAwareShape extends Shape implements Adapter {

	// This list contains all possible figures and when they are to be displayed	
	protected List<ConditionalFigure> conditionalFigureList;
	// This figure's corresponding model element
	protected EObject modelElement;
	// The default figure that is to be displayed when no conditionalFigure's 
	// conditions are all fulfilled
	protected Shape defaultFigure;
	// The figure that will be drawn when the paint method is called
	protected Shape currentFigure;
	protected AbstractLayout layout;
	
	/**
	 * The constructor.
	 */
	public AttributeAwareShape() {
		super();
	}
	
	/**
	 * Sets the layout of the figure.
	 * @deprecated Do not use this.
	 * @param l The layout.
	 */
	public void setLayout(AbstractLayout l) {
		layout = l;
	}
	
	/**
	 * Returns the model element the figure has to watch.
	 * @return The model element to be watched.
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
	 * Set the figure that is to be drawn if no condition id fulfilled.
	 * @param f The figure to be drawn if no condition is fulfilled.
	 */
	public void setDefaultFigure(Shape f) {
		defaultFigure = f;
	}
	
	/**
	 * Paints the figure.
	 */
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
	
	/* (non-Javadoc)
	* @see org.eclipse.draw2d.Figure#setForegroundColor(org.eclipse.swt.graphics.Color)
	*/
	@Override
	public void setForegroundColor(Color fg) {
	    super.setForegroundColor(fg);
	    currentFigure.setForegroundColor(fg);
	}

	/* (non-Javadoc)
	* @see org.eclipse.draw2d.Figure#setBackgroundColor(org.eclipse.swt.graphics.Color)
	*/
	@Override
	public void setBackgroundColor(Color bg) {
	    super.setBackgroundColor(bg);
	    currentFigure.setBackgroundColor(bg);
	}
	
	/* (non-Javadoc)
	* @see org.eclipse.draw2d.Figure#setVisible(boolean)
	*/
	@Override
	public void setVisible(boolean visible) {
	    super.setVisible(visible);
	    //currentFigure.setVisible(visible);
	}
	
	/**
	 * Returns the current figure that is to be drawn.
	 * @return The current figure that is to be drawn.
	 */
	public Figure getCurrentFigure() {
		return currentFigure;
	}
	
	/**
	 * Sets the figure that is currently to be drawn.
	 * @param f The figure that is currently to be drawn.
	 */
	public void setCurrentFigure(Shape f) {
		currentFigure = f;
	}
	
	/**
	 * Add a conditionalFigure to the figure.
	 * @param cf The new ConditionalFigure to add.
	 */
	public void addConditionalFigure(ConditionalFigure cf) {
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
	 * Adjust the appearance to the changes reported in the notification.
	 * @param notification The notification containing the changes made to the model element.
	 */
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
					setCurrentFigure((Shape)cf.getFigure());
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

	/**
	 * @deprecated Do not use this.
	 */
	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub
		
	}

    /* (non-Javadoc)
     * @see org.eclipse.draw2d.Shape#fillShape(org.eclipse.draw2d.Graphics)
     */
    @Override
    protected void fillShape(Graphics graphics) {
        
    }

    /* (non-Javadoc)
     * @see org.eclipse.draw2d.Shape#outlineShape(org.eclipse.draw2d.Graphics)
     */
    @Override
    protected void outlineShape(Graphics graphics) {
        /* do nothing. will be handled by current Figure */
    }
}
