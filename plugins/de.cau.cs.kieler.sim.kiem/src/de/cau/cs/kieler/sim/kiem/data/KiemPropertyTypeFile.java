package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class KiemPropertyTypeFile extends KiemPropertyType
									implements IKiemPropertyType {
	
	private static final long serialVersionUID = 7428611730135550207L;


	private static final Image PROPERTY_FILE = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/propertyFileIcon.png").createImage();

	
	private static final String[] DEFAULT_FILTER_NAMES = {"All Files (*.*)"};
	private static final String[] DEFAULT_FILTER_EXTS = {"*.*"};
	private String[] filterNames;
	private String[] filterExts;
	
	public KiemPropertyTypeFile() {
		super();
		this.filterNames = DEFAULT_FILTER_NAMES;
		this.filterExts = DEFAULT_FILTER_EXTS;
	}

	@Override
	public Object getValue(KiemProperty property) {
		return property.value;
	}

	@Override
	public void setValue(KiemProperty property, Object value) {
		if (value != null)
			property.setValue((String)value);
	}

	@Override
	public Image provideIcon() {
		return PROPERTY_FILE;
	}
	
	
	@Override 
	public CellEditor provideCellEditor(Composite parent) {
		return new CustomDialogCellEditor(parent);
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
			return null;
		}
	}
}
