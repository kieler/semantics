package de.cau.cs.kieler.sim.table.views;


import java.util.Arrays;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;

import de.cau.cs.kieler.sim.table.TableData;
import de.cau.cs.kieler.sim.table.TableDataContentProvider;
import de.cau.cs.kieler.sim.table.TableDataEditing;
import de.cau.cs.kieler.sim.table.TableDataLabelProvider;
import de.cau.cs.kieler.sim.table.TableDataList;


public class DataTableView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "de.cau.cs.kieler.sim.table.views.KiemTable";

	private TableViewer viewer;
	private Action doubleClickAction;
	private TableDataList tableDataList;
	private Table table;

	/**
	 * The constructor.
	 */
	public DataTableView() {
	}

	/**
	 * Return the ExampleTaskList
	 */
	public TableDataList getTableDataList() {
		return tableDataList;	
	}
	
	public void refreshTable() {
		viewer.refresh();
	}

	/**
	 * Return the parent composite
	 */
	//public Control getControl() {
	//	return table.getParent();
	//}
	
	public String[] getColumnNames() {
		String[] columnNames = {"Present","Key","Value"};
		return columnNames;
	}
	public java.util.List getColumnNamesList() {
		return Arrays.asList(getColumnNames());
	}
	
		
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		createViewer(parent);
		viewer.setInput(TableDataList.getInstance());
		hookDoubleClickAction();
	}

	private void createViewer(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION);
		createColumns(viewer);
		viewer.setContentProvider(new TableDataContentProvider());
		viewer.setLabelProvider(new TableDataLabelProvider());
	}

	// This will create the columns for the table
	private void createColumns(TableViewer viewer) {
		String[] titles = { "P", "Key", "Value" };
		String[] toolTip = { "Present", "Key", "Value" };
		int[] bounds = { 22, 120, 120 };

		for (int i = 0; i < titles.length; i++) {
			TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
			column.getColumn().setText(titles[i]);
			column.getColumn().setWidth(bounds[i]);
			column.getColumn().setToolTipText(toolTip[i]);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(true);
			column.setEditingSupport(new TableDataEditing(viewer, i));
		}
		Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
	}

	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
	}


	private void makeActions() {
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"KIEM Table Data Consumer",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}