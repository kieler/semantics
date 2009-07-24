/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.sim.table.views;


import java.util.Arrays;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;

import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.table.DataTableViewer;
import de.cau.cs.kieler.sim.table.TableData;
import de.cau.cs.kieler.sim.table.TableDataContentProvider;
import de.cau.cs.kieler.sim.table.TableDataEditing;
import de.cau.cs.kieler.sim.table.TableDataLabelProvider;
import de.cau.cs.kieler.sim.table.TableDataList;
import de.cau.cs.kieler.sim.table.TablePlugin;


public class DataTableView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "de.cau.cs.kieler.sim.table.views.KiemTable";

	private static DataTableView dataTableView;
	private DataTableViewer viewer;
	private Action doubleClickAction;
	private TableDataList tableDataList;
	private Table table;
	private boolean selected;
	
	private Action actionNew; 		//new
	private Action actionDelete;	//delete
	private Action actionPermanent;	//permanent
	/**
	 * The constructor.
	 */
	public DataTableView() {
		dataTableView = this;
	}
	
	public static DataTableView getInstance() {
		return dataTableView;
	}
	public TableDataList getTableDataList() {
		return tableDataList;
	}
	public void refreshViewer() {
		viewer.refresh();
		return;
	}
	public boolean isCurrentlyEdited() {
		return (viewer.isCellEditorActive()
				|| (this.selected)
				|| viewer.isBusy());
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		createViewer(parent);
		viewer.setInput(new TableDataList(viewer));
		hookSideEffectActions();
		hookContextMenu();
		contributeToActionBars();
		updateEnabled();			
	}

	private void createViewer(Composite parent) {
		viewer = new DataTableViewer(parent,SWT.HIDE_SELECTION |
				SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION);
		createColumns(viewer);
		viewer.setContentProvider(new TableDataContentProvider());
		viewer.setLabelProvider(new TableDataLabelProvider());
		viewer.getControl().addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
				//if user pressed delete
				if (e.keyCode == 127) {
					getActionDelete().run();
				}
			}
			public void keyReleased(KeyEvent e) {
			}
		});
	}

	// This will create the columns for the table
	private void createColumns(DataTableViewer viewer) {
		String[] titles = { "", "P", "Key", "Value" };
		String[] toolTip = { "", "Present", "Key", "Value" };
		int[] bounds = { 0, 22, 120, 120 };
		
		for (int i = 0; i < titles.length; i++) {
			TreeViewerColumn column = new TreeViewerColumn(viewer, SWT.NONE);
			column.getColumn().setText(titles[i]);
			column.getColumn().setWidth(bounds[i]);
			column.getColumn().setToolTipText(toolTip[i]);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(true);
			if (i == 0)
				column.getColumn().setResizable(false);
			else
				column.setEditingSupport(new TableDataEditing(viewer, i));
		}
		Tree tree = viewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
	}

	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				buildContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	
	private void buildContextMenu(IMenuManager manager) {
		manager.add(getActionAdd());
		manager.add(getActionDelete());
		manager.add(new Separator());
		manager.add(getActionPermanent());
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager manager1 = bars.getToolBarManager();
		manager1.add(getActionAdd());
		manager1.add(getActionDelete());
		manager1.add(new Separator());
		manager1.add(getActionPermanent());
	}
	
	private Action getActionAdd() {
		if (actionNew != null) return actionNew;
		actionNew = new Action() {
			public void run() {
				TableData newElement = new TableData(TableDataList.getInstance(),false,"","");
				TableDataList.getInstance().add(newElement);
				viewer.refresh();
				viewer.setSelection((new StructuredSelection(newElement)));
				updateEnabled();
			}
		};
		actionNew.setText("Add Entry");
		actionNew.setToolTipText("Add Entry");
		actionNew.setImageDescriptor(TablePlugin.getImageDescriptor("icons/add.png"));
		return actionNew;
	}
	
	private Action getActionDelete() {
		if (actionDelete != null) return actionDelete;
		actionDelete = new Action() {
			public void run() {
				IStructuredSelection selection =
					(org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection();
				for (int c = 0; c < selection.size(); c++) {
					TableData tableData = (TableData)
													selection.toArray()[c];
					if (TableDataList.getInstance().contains(tableData.getKey())) {
						TableDataList.getInstance().remove(tableData.getKey());
					}
				}
				viewer.refresh();
				updateEnabled();			
			}
		};
		actionDelete.setText("Delete Entry");
		actionDelete.setToolTipText("Delete Entry");
		actionDelete.setImageDescriptor(TablePlugin.getImageDescriptor("icons/delete.png"));
		return actionDelete;
	}

	private Action getActionPermanent() {
		if (actionPermanent != null) return actionPermanent;
		actionPermanent = new Action() {
			public void run() {
				IStructuredSelection selection =
					(org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection();
				//toggle w.r.t first selected value
				boolean permanentValue = !((TableData)((IStructuredSelection)selection)
										 	.getFirstElement()).isPermanent();
				for (int c = 0; c < selection.size(); c++) {
					TableData tableData = (TableData)
													selection.toArray()[c];
					tableData.setPermanent(permanentValue);
				}
				viewer.setSelection(null);
				viewer.refresh();
				updateEnabled();			
			}
		};
		actionPermanent.setText("Permanent");
		actionPermanent.setToolTipText("Permanent");
		actionPermanent.setImageDescriptor(TablePlugin.getImageDescriptor("icons/permanentIcon.png"));
		return actionPermanent;
	}
	

	private void hookSideEffectActions() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = viewer.getSelection();
				if (selection != null) {
					Object obj = ((IStructuredSelection)selection).getFirstElement();
					if (obj != null) {
						//toggle permanent
						TableData tableData = (TableData)obj;
						tableData.setPermanent(!tableData.isPermanent());
						viewer.setSelection(null);
						viewer.refresh();
						updateEnabled();			
					}
				}
			}
		});
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				updateEnabled();
			}
		});
	}
	
	  //---------------------------------------------------------------------------	
	
	private void updateEnabled() {
		Object obj = ((org.eclipse.jface.viewers.StructuredSelection)viewer.getSelection()).getFirstElement();
		if (obj == null) {
			//no object selected
			getActionDelete().setEnabled(false);
			getActionPermanent().setEnabled(false);
			selected = false;
		}
		else {
			//object selected
			getActionDelete().setEnabled(true);
			getActionPermanent().setEnabled(true);
			if (((TableData)obj).isPermanent()) {
				actionPermanent.setText("Volatile");
				actionPermanent.setToolTipText("Volatile");
				actionPermanent.setImageDescriptor(TablePlugin.getImageDescriptor("icons/volatileIcon.png"));
			}
			else {
				actionPermanent.setText("Permanent");
				actionPermanent.setToolTipText("Permanent");
				actionPermanent.setImageDescriptor(TablePlugin.getImageDescriptor("icons/permanentIcon.png"));
			}
			selected = true;
		}
		
	}
	
  //---------------------------------------------------------------------------	
	
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