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

package de.cau.cs.kieler.sim.table;

import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.JSONArray;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.sim.table.views.DataTableView;

public class DataObserver extends JSONStringDataComponent implements
		IJSONStringDataComponent {

	List<TableData> tableDataTmp;
	
	public DataObserver() {
	}

	public String step(String JSONString) {
		System.out.println(JSONString);

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
					if (obj instanceof JSONObject) {
						value = ((JSONObject)obj).toString();
					}
					else if (obj instanceof JSONArray) {
						value = ((JSONArray)obj).toString();
					}
					else {
						value = "\""+(String)obj+"\"";
						if (((String)obj).length() == 0)
							value = "";
					}
					//add to table or update table
					if (TableDataList.getInstance().contains(key)) {
						//update
						TableData data = TableDataList.getInstance().get(key);
						data.setValue(value);
						data.setPresent(true);
						tableDataTmp.add(data);
					}
					else {
						//add
						TableData data = new TableData(TableDataList.getInstance(),
								true, 
								key,
								value);
						tableDataTmp.add(data);
						TableDataList.getInstance().add(data);
					}
				}
				
				//set all NOT updated entries to absent per default
				for (int c = 0; c < TableDataList.getInstance().size(); c++) {
					TableData tableData = TableDataList.getInstance().get(c);
					if (tableData.isPresent()&&(!tableData.isModified())) {
						if(!tableDataTmp.contains(tableData)) {
							tableData.setPresent(false);
						}
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
		try{Thread.sleep(250);}catch(Exception e){}
//System.out.println("    CONSUMER DONE");
		return null;
	}

	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Raw Table Consumer initialize");
		//make an entry of all global interface variables/signals
		String[] variables = this.getGlobalInterfaceVariables();
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

	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isProducer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDeltaObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	public void wrapup() {
		// TODO Auto-generated method stub
		
	}
}
