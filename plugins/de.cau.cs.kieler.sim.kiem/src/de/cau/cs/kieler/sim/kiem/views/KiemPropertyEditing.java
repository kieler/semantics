package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;

public class KiemPropertyEditing extends EditingSupport {
	private int columnIndex;
	private KiemView parent;
	private Composite tree;
	
	public KiemPropertyEditing(KiemView parent, 
						  ColumnViewer viewer, 
						  int columnIndex) {
		super(viewer);
		
		// Create the correct editor based on the column index
		switch (columnIndex) {
		case 1:
			this.tree = ((TreeViewer)viewer).getTree();
			stringEditor = new TextCellEditor(tree);
			intEditor = new TextCellEditor(tree);
			boolEditor = new ComboBoxCellEditor(tree, BOOL_ITEMS);
			fileEditor = new TextCellEditor(tree);
			modelEditor = new TextCellEditor(tree);
			
			//editor = new CheckboxCellEditor(null, SWT.CHECK | SWT.READ_ONLY);
			break;
		//case 1:
			//editor = new TextCellEditor(((TableViewer) viewer).getTable());
		//	break;
		default:
			throw new RuntimeException("Editing not supported");
		}
		this.columnIndex = columnIndex;
		this.parent = parent;
	}

	@Override
	protected boolean canEdit(Object element) {
		//do not allow to modify enabled/disabled status during execution
		if (parent.KIEM.execution != null) 
			return false;
		return true;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		KiemProperty property = (KiemProperty)element;
		switch (property.getType()) {
			case KSTRING : { 
				return stringEditor;
			}
			case KINT : { 
				return intEditor;
			}
			case KBOOL : { 
				return boolEditor;
			}
			case KFILE : { 
				return fileEditor;
			}
			case KMODEL : { 
				return modelEditor;
			}
		}
		return null;
	}

	@Override
	protected Object getValue(Object element) {
		KiemProperty property = (KiemProperty)element;

		switch (this.columnIndex) {
		case 1:
			switch (property.getType()) {
			case KSTRING : { 
				return property.getValue();
			}
			case KINT : { 
				return property.getValue();
			}
			case KBOOL : {
				if (property.getValue().equals("true")) return 1;
				else return 0;
			}
			case KFILE : { 
				return  property.getValue();
			}
			case KMODEL : { 
				return  property.getValue();
			}
		}
		default:
			break;
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		KiemProperty property = (KiemProperty)element;

		switch (this.columnIndex) {
		case 1:
			switch (property.getType()) {
			case KSTRING : { 
				property.setValue((String)value);
				break;
			}
			case KINT : { 
				try {
					property.setValue(""+Integer.valueOf((String)value));
				}catch(Exception e) {
				}
				break;
			}
			case KBOOL : {
				if ((Integer) value == 0) {
					property.setValue("false");
				}
				else {
					property.setValue("true");
				}
				break;
			}
			case KFILE : { 
				property.setValue((String)value);
				break;
			}
			case KMODEL : { 
				property.setValue((String)value);
				break;
			}
			}
			break;
		default:
			break;
		}
		getViewer().update(element, null);
	}

}
