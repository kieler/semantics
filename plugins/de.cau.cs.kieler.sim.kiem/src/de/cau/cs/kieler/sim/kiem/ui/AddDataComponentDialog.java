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

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;

public class AddDataComponentDialog extends Dialog {

	AddDataComponentDialog dialog;
	
	public AddDataComponentDialog(Shell parent) {
		super(parent);
		dialog = this;
	}
	
	Table table;
	List<DataComponent> selectedList;
	List<DataComponent> componentList;
	List<DataComponentEx> dataComponentExList;
	
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Add Data Component(s)");
	}
	
    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);
        
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        composite.setLayout(gridLayout);
        gridLayout.marginHeight = 15;
        gridLayout.marginWidth = 15;
        
        table = new Table(composite, SWT.BORDER | SWT.MULTI);
        table.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateSelectedList();
			}
        });
        table.addMouseListener(new MouseListener() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				updateSelectedList();
				dialog.close();
			}
			public void mouseDown(MouseEvent e) {
			}
			@Override
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

    @Override
    protected Point getInitialSize() {
        return new Point(400, 300);
    }

    public void setComponentList(List<DataComponent> dataComponents) {
    	this.componentList = dataComponents;
    }
    public void setComponentExList(List<DataComponentEx> dataComponentExList) {
    	this.dataComponentExList = dataComponentExList;
    }
    
    private void updateTable() {
    	for (int c = 0; c < componentList.size(); c++) {
    		DataComponent component = componentList.get(c);
        	TableItem item = new TableItem(table, SWT.NULL);
        	String type = "Initializer";
        	if (component.isObserver() && component.isProducer())
        		type = "Observer/Producer";
        	else if (component.isObserver())
        		type = "Observer";
        	else if (component.isProducer())
        		type = "Producer";
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
    
    public List<DataComponent> getSelectedComponents() {
    	return selectedList;
    }
    
    
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
    
    public boolean checkMultipleInstanceOk(DataComponent component) {
    	//nothing to check = no multiple instances possible if empty list
    	if (dataComponentExList == null) return true; 
    	//now check for the same component
    	for (int c = 0; c < dataComponentExList.size(); c++) {
    		DataComponentEx dataComponentEx = dataComponentExList.get(c);
    		if (!dataComponentEx.getDataComponent().isMultiInstantiable()) {
    			//now we have a NOT multiple instantiable component in the list
    			//check if this is our component, if yes return false!
    			if (component.equals(dataComponentEx.getDataComponent()))
    				return false;
    		}
    	}
    	return true;
    }

    //---------------------------------------------------------------------------	
    
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
	
	//---------------------------------------------------------------------------	
	


}
