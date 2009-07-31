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

public class TableData {

	private TableDataList tableDataList;
	
	private boolean signal;
	private boolean present;
	private String  key;
	private String 	value;
	private boolean modified;
	private boolean permanent;
	
	public TableDataList getParentTableDataList() {
		return tableDataList;
	}
	
	public TableData(TableDataList parentTableDataList) {
		this.tableDataList = parentTableDataList;
		this.present = false;
		this.signal = false;
		this.key = "";
		this.value = "";
		this.modified = false;
		this.permanent = false;
	}
	public TableData(TableDataList parentTableDataList, 
					 String key) {
		this.tableDataList = parentTableDataList;
		this.present = false;
		this.signal = false;
		this.key = key;
		this.value = "";
		this.permanent = false;
	}
	public TableData(TableDataList parentTableDataList, 
			         String key, 
			         String value) {
		this.tableDataList = parentTableDataList;
		this.present = false;
		this.signal = false;
		this.key = key;
		this.value = value;
		this.permanent = false;
	}
	public TableData(TableDataList parentTableDataList, 
					 boolean present, 
					 String key, 
					 String value) {
		this.tableDataList = parentTableDataList;
		this.present = present;
		this.key = key;
		this.value = value;
		this.permanent = false;
	}

	public TableData(TableDataList parentTableDataList, 
			 boolean present, 
			 boolean signal,
			 String key, 
			 String value) {
		this.tableDataList = parentTableDataList;
		this.present = present;
		this.signal = signal;
		this.key = key;
		this.value = value;
		this.permanent = false;
	}
	
	public String getValue() {
		return this.value;
	}
	public String getKey() {
		return this.key;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public void setKey(String key) throws Exception {
		//only set the key if unique
		if (this.tableDataList.containsOther(key, this))
			throw new Exception("The key '"+key+"' already exists!");
		this.key = key;
	}
	public void setPresent(boolean present) {
		this.present = present;
	}
	public boolean isPresent() {
		//return present flag if signal AND present 
		return (this.signal && this.present);
	}

	public void setSignal(boolean signal) {
		this.signal = signal;
	}
	public boolean isSignal() {
		//return signal 
		return this.signal;
	}
	
	public void setModified(boolean modified) {
		this.modified = modified;
	}
	public boolean isModified() {
		//return modified flag if modified OR permanent 
		return (this.modified || this.permanent);
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public boolean isPermanent() {
		return this.permanent;
	}
	
}
