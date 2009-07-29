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

import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.JSONArray;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.sim.table.views.DataTableView;

public class DataObserver extends JSONStringDataComponent implements
		IJSONStringDataComponent {

	List<TableData> tableDataTmp;
	
	/**
	 * This method is called when information about an Data
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 */
	public DataObserver() {
	}

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent#step(java.lang.String)
	 */
	public String step(String JSONString) {
		System.out.println("TABLE: "+JSONString);

		tableDataTmp = new LinkedList<TableData>();
		
		// TODO Auto-generated method stub
//System.out.println("    CONSUMER START");
//System.out.println("RECEIVED: "+JSONString);
		
		try {
			JSONObject allData = new JSONObject(JSONString);
			String[] fieldNames = JSONObject.getNames(allData);
			if (fieldNames != null) {
				for (int c = 0; c < fieldNames.length; c++) {
					//extract key, value from JSONObject
					Object obj = allData.get(fieldNames[c]);
					String key = fieldNames[c];
					String value;
					boolean isPresent = false; //default
					boolean isSignal = false;
					if (obj instanceof JSONObject) {
						//can be a signal
						isPresent = JSONSignalValues.isPresent((JSONObject)obj);
						//extract signal value if any
						if (JSONSignalValues.isSignalValue((JSONObject)obj)) {
							isSignal = true;
							obj = JSONSignalValues.getSignalValue((JSONObject)obj);
						}
					}
					
					if (obj == null) {
						value = "";
					}
					else if (obj instanceof Double) {
						value = ((Double)obj)+"";
					}
					else if (obj instanceof Integer) {
						value = ((Integer)obj)+"";
					}
					else if (obj instanceof Boolean) {
						value = ((Boolean)obj).toString();
					}
					else if (obj instanceof JSONObject) {
						value = ((JSONObject)obj).toString();
					}
					else if (obj instanceof JSONArray) {
						value = ((JSONArray)obj).toString();
					}
					else {
						value = "\""+(String)obj+"\"";
					}
					//add to table or update table
					if (TableDataList.getInstance().contains(key)) {
						//update
						TableData tableData = TableDataList.getInstance().get(key);
						synchronized(tableData) {
							tableData.setSignal(isSignal);
							tableData.setValue(value);
							tableData.setPresent(isPresent);
							tableData.setModified(false);
						}
						tableDataTmp.add(tableData);
					}
					else {
						//add
						TableData tableData = new TableData(TableDataList.getInstance(),
								isPresent, 
								isSignal,
								key,
								value);
						tableDataTmp.add(tableData);
						TableDataList.getInstance().add(tableData);
					}
				}
				
				if (this.isHistoryStep()) {
					//set all NOT updated entries to absent per default
					for (int c = 0; c < TableDataList.getInstance().size(); c++) {
						TableData tableData = TableDataList.getInstance().get(c);
						if (tableData.isPresent()&&(!tableData.isModified())) {
							if(!tableDataTmp.contains(tableData)) {
								tableData.setPresent(false);
							}
						}
						tableData.setModified(false);
					}
				}
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		//update only if not currently edited
		if (!DataTableView.getInstance().isCurrentlyEdited())
			TableDataList.getInstance().updateView();
		
		//Slow down so that user can eye-catch all changes!
		try{Thread.sleep(80);}catch(Exception e){}
//System.out.println("    CONSUMER DONE");
		return null;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Raw Table Consumer initialize");
		//make an entry of all global interface variables/signals
		String[] variables = this.getInterfaceVariables();
		for (int c = 0; c < variables.length; c++) {
			String key = variables[c];
			String value = "";
			//add to list
			TableDataList.getInstance().add(new TableData(TableDataList.getInstance(),
										false, 
										key,
										value));
		}
		//update the table
		TableDataList.getInstance().updateView();
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return false;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isDeltaObserver()
	 */
	public boolean isDeltaObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isDeltaObserver()
	 */
	public boolean isHistoryObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() {
		// TODO Auto-generated method stub
		
	}
}
