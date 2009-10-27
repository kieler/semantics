/*
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
 */

package de.cau.cs.kieler.sim.kiem.ui;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;

/**
 * The Class DropDownAction. This is a helper class that simplifies the
 * creation of drop down actions, by adding simple Actions. A 
 * DropDownAction always has a default Action which it refers to in the
 * standard behavior. It will always be displayed first in the list.
 * The list can not only contain Actions but also Separators for example.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class DropDownAction extends Action implements IMenuCreator {
	
	/** The menu of the DropDownAction. */
	private Menu fMenu;
	
	/** The default Action which implements the default behavior. */
	private Action defaultAction;
	
	/** The item list that contains Actions and IContributionItems */
	private List<Object> itemList;
	
	//-------------------------------------------------------------------------	
	
	/**
	 * Instantiates a new drop down action. This always has a default
	 * Action that is the first action in the drop down menu. The 
	 * DropDownAction inherits the icon, action, text, enableness
	 * and the visibility from this default Action.
	 * 
	 * @param defaultAction the default Action
	 */
	public DropDownAction(Action defaultAction) {
		this.defaultAction = defaultAction;
		itemList = new LinkedList<Object>();
		//default action always the first one
		this.add(defaultAction);
		//add a listener to react to changes of the defaultAction
		IPropertyChangeListener pcl =
			new PropertyChangeListener();
		defaultAction.addPropertyChangeListener(pcl);
		setMenuCreator(this);
		//trigger setting text & images of the default action
		pcl.propertyChange(null);
	}

	//-------------------------------------------------------------------------	

	/**
	 * Adds an Action item to menu of the DropDownAction.
	 * 
	 * @param parent the parent
	 * @param action the action
	 */
	protected void addActionToMenu(Menu parent, Action action) {
		ActionContributionItem item = new ActionContributionItem(action);
		item.fill(parent, -1);
	}

	//-------------------------------------------------------------------------	

	/**
	 * Adds an IContributionItem item to menu of the DropDownAction.
	 * 
	 * @param parent the parent
	 * @param citem the citem
	 */
	protected void addContributionItemToMenu(Menu parent, 
										IContributionItem citem) {
		//ActionContributionItem item = new ActionContributionItem(citem);
		citem.fill(parent, -1);
	}
	
	//-------------------------------------------------------------------------	

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	public void run() {
		this.defaultAction.run();
	}
	
	//-------------------------------------------------------------------------	
	
	/**
	 * Adds an Action to the DropDownAction.
	 * 
	 * @param action the Action to add
	 */
	public void add(Action action) {
		itemList.add(action);
	}

	//-------------------------------------------------------------------------	

	/**
	 * Adds a ContributionItem (e.g., a Separator) to the DropDownAction.
	 * 
	 * @param contributionItem the IContributionItem to add
	 */
	public void add(IContributionItem contributionItem) {
		itemList.add(contributionItem);
	}

	//-------------------------------------------------------------------------	

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.IMenuCreator#dispose()
	 */
	public void dispose() {
		if (fMenu != null)  {
			fMenu.dispose();
			fMenu= null;
		}
	}

	//-------------------------------------------------------------------------	

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.IMenuCreator#getMenu(org.eclipse.swt.widgets.Menu)
	 */
	public Menu getMenu(Menu parent) {
		return null;
	}

	//-------------------------------------------------------------------------	

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.IMenuCreator#getMenu(org.eclipse.swt.widgets.Control)
	 */
	public Menu getMenu(Control parent) {
		if (fMenu != null)
			fMenu.dispose();
		
		fMenu= new Menu(parent);
		for (int c = 0; c < this.itemList.size(); c++) {
			Object item  = itemList.get(c);
			if (item instanceof Action) {
				addActionToMenu(fMenu, (Action)itemList.get(c));
			}
			else if (item instanceof IContributionItem) {
				addContributionItemToMenu(fMenu, 
						(IContributionItem)itemList.get(c));
			}
			
		}

		return fMenu;
	}

	//-------------------------------------------------------------------------	

	/**
	 * Clear the DropDownAction.
	 */
	void clear() {
		dispose();
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * The listener interface for receiving propertyChange events.
	 * The class that is interested in processing a propertyChange
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addPropertyChangeListener<code> method. When
	 * the propertyChange event occurs, that object's appropriate
	 * method is invoked.
	 * 
	 * @see PropertyChangeEvent
	 */
	class PropertyChangeListener implements IPropertyChangeListener {
		public void propertyChange(
				org.eclipse.jface.util.PropertyChangeEvent event) {
			//set the enableness like the one of the default action
			setEnabled(defaultAction.isEnabled());
			//set the checked state like the one of the default action
			setChecked(defaultAction.isChecked());
			//set the text like the one of the default action
			setText(defaultAction.getText());
			//set the image like the one of the default action
			setImageDescriptor(defaultAction.getImageDescriptor());
			//set the disabled image like the one of the default action
			setDisabledImageDescriptor(
						defaultAction.getDisabledImageDescriptor());
			//set the hint like the one of the default action
			setToolTipText(defaultAction.getToolTipText());
		}
	}

}
