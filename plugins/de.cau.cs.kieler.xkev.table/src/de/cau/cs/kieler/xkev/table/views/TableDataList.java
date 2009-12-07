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

package de.cau.cs.kieler.xkev.table.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Display;

/**
 * The class TableDataList implements a list of TableData elements
 * that are the input of the DataTableViewer. This list is modified
 * by the producer and observer DataComponent.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class TableDataList {
	
	/** The list of TableData entries. */
	private List<TableData> tableDataList;
	
	/** The one and only static instance of this class. */
	private static TableDataList instance;
	
	/** The parent viewer to trigger refreshes. */
	private DataTableViewer viewer;
	
	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new TableDataList.
	 * 
	 * @param viewer the parent tree table viewer for refreshes
	 */
	public TableDataList(DataTableViewer viewer) {
		this.viewer = viewer;
		tableDataList = new ArrayList<TableData>();
		instance = this;
		fillListWithValues();
	}
	
	private void fillListWithValues() {
		instance.add(new TableData(instance,"cRed","#FF0000"));
		instance.add(new TableData(instance,"cYellow","#FFFF00"));
		instance.add(new TableData(instance,"cGreen","#00FF00"));
//		instance.add(new TableData(instance,"Gruenphase_Auto","10"));
		instance.add(new TableData(instance,"Gruenphase_Person","5"));
		instance.add(new TableData(instance,"Ampelknopf","true"));
		instance.add(new TableData(instance,"pRed","on"));
		instance.add(new TableData(instance,"pGreen","off"));
		//for (int i=0; i<instance.size(); i++) instance.get(i).setModified(true);
	}
	
	
	//-------------------------------------------------------------------------

	/**
	 * Returns the index of an TableData entry.
	 * 
	 * @param tableData the TableData entry
	 * 
	 * @return the index
	 */
	public int indexOf(TableData tableData) {
		return tableDataList.indexOf(tableData);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Resets the modified flag of an entry to false.
	 */
	public void resetModified() {
		for (int c = 0; c < tableDataList.size(); c++) {
			tableDataList.get(c).setModified(false);
		}
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Updates the view of the parent tree table viewer asynchronously.
	 */
	public void updateViewAsync() {
		//asynchronously update the table
		Display.getDefault().asyncExec(
				  new Runnable(){
					public void run() {
						viewer.refresh();
					}
		});
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Adds a TableData entry to the list.
	 * 
	 * @param tableData the TableData entry
	 */
	public void add(TableData tableData) {
		if (contains(tableData.getKey()))
			remove(tableData.getKey());
		tableDataList.add(tableData);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets a TableData entry with a specific key as an identifier.
	 * 
	 * @param key the identifier key
	 * 
	 * @return the TableData entry
	 */
	public TableData get(String key) {
		for (int c = 0; c < tableDataList.size(); c++) {
			if (tableDataList.get(c).getKey().equals(key))
				return tableDataList.get(c);
		}
		return null;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets a TableData entry with a specific index as an identifier.
	 * 
	 * @param index the identifier index
	 * 
	 * @return the TableData entry
	 */
	public TableData get(int index) {
		return tableDataList.get(index);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Checks whether the list contains a TableData entry with the 
	 * specific key.
	 * 
	 * @param key the identifier key
	 * 
	 * @return true, if list contains that TableData entry
	 */
	public boolean contains(String key) {
		return (get(key) != null);
	}

	//-------------------------------------------------------------------------

	/**
	 * Checks whether the list contains a duplicate TableData entry with
	 * the same key as the provided one.
	 * 
	 * @param key the identifier key
	 * @param tableData the TableData entry
	 * 
	 * @return true, if list contains another TableData entry
	 */
	public boolean containsOther(String key, 
								 TableData tableData) {
		for (int c = 0; c < tableDataList.size(); c++) {
			if ((tableDataList.get(c).getKey().equals(key))
				&&(tableData != tableDataList.get(c)))
				return true;
		}
		return false;
	}

	//-------------------------------------------------------------------------

	/**
	 * Removes the TableData entry with the specific key from list.
	 * 
	 * @param key the identifier key
	 */
	public void remove(String key) {
		for (int c = 0; c < tableDataList.size(); c++) {
			if (tableDataList.get(c).getKey().equals(key)) {
				tableDataList.remove(c);
			}
		}
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the single instance of this TableDataList class.
	 * 
	 * @return single instance of TableDataList
	 */
	public static synchronized TableDataList getInstance() {
		if (instance != null) {
			return instance;
		}
		return null;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the size of this list.
	 * 
	 * @return the size
	 */
	public int size() {
		return tableDataList.size();
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the list of TableData entries as an array of TableData entries.
	 * 
	 * @return the TableData[] array
	 */
	public TableData[] getArray() {
		TableData array[] = new TableData[this.size()];
		for (int c = 0; c < this.size(); c++) {
			array[c] = this.get(c);
		}
		return array;
	}
	
}
