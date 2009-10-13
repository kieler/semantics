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
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.ui;

import java.util.LinkedList;
import java.util.List;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;

/**
 * The Class AddDataComponentDialog.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class AddDataComponentDialog extends Dialog {

	/** The basic dialog SWT component. */
	AddDataComponentDialog dialog;
	
	/** The temporary table that allows the user to select DataComponents. */
	Table table;
	
	/** The list that holds the currently selected DataComponents. */
	List<DataComponent> selectedList;
	
	/** The component list should hold all available default DataComponents
	 * and is used to update the table. */
	List<DataComponent> componentList;
	
	/** The DataComponentExList. It is used to check for multiple instances.
	 * It should hold all DataComponentEx's that are in the original list
	 * of the KiemView to check if another instance of a DataComponent
	 * can safely be added. */
	List<DataComponentEx> dataComponentExList;
	
	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a dialog.
	 * 
	 * @param parent the SWT parent of this dialog
	 */
	public AddDataComponentDialog(Shell parent) {
		super(parent);
		dialog = this;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		//set the title of this dialog
		newShell.setText(Messages.AddDataComponentTitle);
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);
        
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        composite.setLayout(gridLayout);
        gridLayout.marginHeight = 15;
        gridLayout.marginWidth = 15;
        
        table = new Table(composite, SWT.BORDER | SWT.MULTI);
        table.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
			}
			public void widgetSelected(SelectionEvent e) {
				updateSelectedList();
			}
        });
        table.addMouseListener(new MouseListener() {
			public void mouseDoubleClick(MouseEvent e) {
				updateSelectedList();
				dialog.close();
			}
			public void mouseDown(MouseEvent e) {
			}
			public void mouseUp(MouseEvent e) {
			}
        });
        updateTable();

        GridData gridData = new GridData();
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalAlignment = GridData.FILL;
        gridData.verticalAlignment = GridData.FILL;
        table.setLayoutData(gridData);

    	refreshEnabledDisabledTextColors();
        return composite;
    }

	//-------------------------------------------------------------------------

    /* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#getInitialSize()
	 */
	@Override
    protected Point getInitialSize() {
		//set the dimensions of the dialog
        return new Point(400, 300);
    }

    //-------------------------------------------------------------------------

    /**
     * Sets the component list. The component list should hold all available
 	 * default DataComponents and is used to update the table.
 	 * This should be provided by the calling instance.
     * 
     * @param dataComponents the new component list
     */
    public void setComponentList(List<DataComponent> dataComponents) {
    	this.componentList = dataComponents;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Sets the DataComponentEsList. It is used to check for multiple 
     * instances. It should hold all DataComponentEx's that are in the original
     * list of the KiemView to check if another instance of a DataComponent
	 * can safely be added. <BR>
 	 * This should be provided by the calling instance.
     * 
     * @param dataComponentExList the new component list
     */
    public void setComponentExList(List<DataComponentEx> dataComponentExList) {
    	this.dataComponentExList = dataComponentExList;
    }
    
	//-------------------------------------------------------------------------

    /**
	 * Updates the temporary table from which the user can select (multiple)
	 * DataComponents that he/she wishes to add to its list.
	 * The type of the DataComponent is shown in brackets, and the icon is
	 * also personalized for each type of DataComponent.
	 */
	private void updateTable() {
    	for (int c = 0; c < componentList.size(); c++) {
    		DataComponent component = componentList.get(c);
        	TableItem item = new TableItem(table, SWT.NULL);
        	String type = Messages.InitializationDataComponent;
        	if (component.isObserver() && component.isProducer())
        		type = Messages.ObserverProducerDataComponent;
        	else if (component.isObserver())
        		type = Messages.ObserverDataComponent;
        	else if (component.isProducer())
        		type = Messages.ProducerDataComponent;
        	item.setText(component.getName()+ " (" + type+")");
        	item.setData(component);
        	if (component.isObserver() && component.isProducer())
        		item.setImage(KiemIcons.PRODUCEROBSERVER_ENABLED);
        	else if (component.isObserver())
        		item.setImage(KiemIcons.OBSERVER_ENABLED);
        	else if (component.isProducer())
        		item.setImage(KiemIcons.PRODUCER_ENABLED);
        	else 
        		item.setImage(KiemIcons.INITCOMPONENT_ENABLED);
    	}
    }
    
	//-------------------------------------------------------------------------

    /**
	 * Gets the selected components. This is normally called after the user has
	 * selected and chosen DataComponents and already closed the dialog. 
	 * 
	 * @return the selected DataComponents for which DataComponentExs has to be
	 * 		   created by the calling instance
	 */
	public List<DataComponent> getSelectedComponents() {
    	return selectedList;
    }
    
	//-------------------------------------------------------------------------

    /**
	 * Updates the selected list. This is done immediately when the user
	 * selects DataComponents in the list. The selected list can be obtained
	 * by calling {@link #getSelectedComponents()}.
	 */
	private void updateSelectedList() {	
    	selectedList =
    		new LinkedList<DataComponent>();
    	TableItem[] selection = table.getSelection();
    	for (int c = 0; c < selection.length; c++) {
    		DataComponent dataComponent = (DataComponent)selection[c].getData();
    		//only add if multiple instances are ok
    		//or if there are no instances yet!
			if (checkMultipleInstanceOk(dataComponent)) {
	    		selectedList.add(dataComponent);
			}
    	}
    	if (selection.length < 1)
    		selectedList = null;
    }

    //---------------------------------------------------------------------------
    
    /**
     * Check if multiple instances of a DataComponent are okay and if not
     * check if there already is another instance in the original 
     * DataComponentExList. If the latter is the case then return false. 
     * In any other case it is okay to add another instance of this 
     * DataComponent so this method returns true.
     * 
     * @param component the DataComponent that we want to check on
     * 
     * @return true, if another instance of this DataComponent is allowed
     */
    public boolean checkMultipleInstanceOk(DataComponent component) {
    	//nothing to check = no multiple instances possible if empty list
    	if (dataComponentExList == null) return true; 
    	//now check for the same component
    	for (int c = 0; c < dataComponentExList.size(); c++) {
    		DataComponentEx dataComponentEx = dataComponentExList.get(c);
    		if (!dataComponentEx.getDataComponent().isMultiInstantiable()) {
    			//now we have a NOT multiple instantiable component in the list
    			//check if this is our component, if yes return false!
    			if (component.getClass().getName().equals(
    				(dataComponentEx.getDataComponent()).getClass().getName())) {
    				//class equal
    				if (component.getName().equals(
    					dataComponentEx.getDataComponent().getName())) {
    					//name equal
    					return false;
    				}
    			}
    		}
    	}
    	return true;
    }

    //---------------------------------------------------------------------------	
    
	/**
     * Refreshes the enabled/disabled text colors of the DataComponent selection
     * list. In case a DataComponent is <B>NOT</B> multiple instantiable and there
     * already is one instance in the original DataComponentExList (of the
     * KiemView) then we indicate this by a grayed colorDisabled.
     */
    public void refreshEnabledDisabledTextColors() {
		//change the text color (black or gray)
		Color colorEnabled  = new Color(null, new RGB(0,0,0));
		Color colorDisabled = new Color(null, new RGB(150,150,150));

		for (int c = 0; c < table.getItemCount(); c++) {
			DataComponent dataComponent = 
							(DataComponent)table.getItem(c).getData(); 
			//select color
			Color currentColor = colorDisabled;
			if (checkMultipleInstanceOk(dataComponent)) {
				currentColor = colorEnabled;
			}
			else { 
				currentColor = colorDisabled;
			}
			//update text colors
			table.getItem(c).setForeground(currentColor);
		}
	}
	
}
