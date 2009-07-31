/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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

package de.cau.cs.kieler.sim.table;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Display;

import de.cau.cs.kieler.sim.kiem.views.KiemView;
import de.cau.cs.kieler.sim.table.views.DataTableView;

public class TableDataList {
	
	private List<TableData> tableDataList;
	private static TableDataList content;
	private DataTableViewer viewer;

	public TableDataList(DataTableViewer viewer) {
		this.viewer = viewer;
		tableDataList = new ArrayList<TableData>();
		content = this;
	}
	
	public int indexOf(TableData tableData) {
		return tableDataList.indexOf(tableData);
	}
	
	public void resetModified() {
		for (int c = 0; c < tableDataList.size(); c++) {
			tableDataList.get(c).setModified(false);
		}
	}
	

	public void updateViewAsync() {
		//asynchronously update the table
		Display.getDefault().asyncExec(
				  new Runnable(){
					public void run() {
						viewer.refresh();
					}
		});
	}
	
	public void add(TableData tableData) {
		if (contains(tableData.getKey()))
			remove(tableData.getKey());
		tableDataList.add(tableData);
	}
	public TableData get(String key) {
		for (int c = 0; c < tableDataList.size(); c++) {
			if (tableDataList.get(c).getKey().equals(key))
				return tableDataList.get(c);
		}
		return null;
	}
	public TableData get(int i) {
		return tableDataList.get(i);
	}
	public boolean contains(String key) {
		return (get(key) != null);
	}

	public boolean containsOther(String key, 
								 TableData tableData) {
		for (int c = 0; c < tableDataList.size(); c++) {
			if ((tableDataList.get(c).getKey().equals(key))
				&&(tableData != tableDataList.get(c)))
				return true;
		}
		return false;
	}

	public void remove(String key) {
		for (int c = 0; c < tableDataList.size(); c++) {
			if (tableDataList.get(c).getKey().equals(key)) {
				tableDataList.remove(c);
			}
		}
	}
	
	public static synchronized TableDataList getInstance() {
		if (content != null) {
			return content;
		}
		return null;
	}
	
	public int size() {
		return tableDataList.size();
	}
	
	public TableData[] getArray() {
		TableData array[] = new TableData[this.size()];
		for (int c = 0; c < this.size(); c++) {
			array[c] = this.get(c);
		}
		return array;
	}
	
	
	
}
