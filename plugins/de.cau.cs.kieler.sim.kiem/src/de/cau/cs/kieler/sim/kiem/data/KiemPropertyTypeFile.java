package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class KiemPropertyTypeFile extends KiemPropertyType
									implements IKiemPropertyType {
	
	private static final Image PROPERTY_FILE = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/propertyFileIcon.png").createImage();

	
	private static final String[] DEFAULT_FILTER_NAMES = {"All Files (*.*)"};
	private static final String[] FILTER_EXTS = {"*.*"};
	private String[] filterNames;
	private String[] filterExts;
	
	public KiemPropertyTypeFile() {
		super();
		this.filterNames = DEFAULT_FILTER_NAMES;
	}

	@Override
	public Object getValue(Object element) {
		KiemProperty property = (KiemProperty)element;
		return property.value;
	}

	@Override
	public void setValue(Object element, Object value) {
		KiemProperty property = (KiemProperty)element;
		if (value != null)
			property.setValue((String)value);
	}

	@Override
	public Image getIcon() {
		// TODO Auto-generated method stub
		return PROPERTY_FILE;
	}
	
	
	@Override 
	public void setCellEditor(Composite parent) {
		cellEditor = new CustomDialogCellEditor(parent);
	}
	

	public void setFilterNames(String[] filterNames) {
		this.filterNames = filterNames;
	}
	public String[] getFilterNames() {
		return this.filterNames;
	}
	
	public void setFilterExts(String[] filterExts) {
		this.filterExts = filterExts;
	}
	public String[] getFilterExts() {
		return this.filterExts;
	}
	
	//--------------------
	
	public class CustomDialogCellEditor extends DialogCellEditor {
		
	    public CustomDialogCellEditor(Composite parent) {
	        super(parent);
	    }


		@Override
		protected Object openDialogBox(Control cellEditorWindow) {
				
			FileDialog dlg = new FileDialog(cellEditorWindow.getShell(), SWT.SINGLE);
			dlg.setOverwrite(true);
			String fn = dlg.open();
			if (fn != null) {
				return dlg.getFilterPath().toString()+
				System.getProperty("file.separator") + 
				dlg.getFileName().toString();
			}
			/*
			* Here you can instantiate any built-in or custom Dialog you want
			*/
			//InputDialog dialog = new InputDialog(null, "New Value", "Enter a new value", getValue().toString(), null);

			/*
			* Only if the user clicks OK in your dialog do you return the new value otherwise return the original value
			*/
			//return (InputDialog.OK == dialog.open()) ? dialog.getValue(): getValue();
			//}
			return null;
		}
	}
}
