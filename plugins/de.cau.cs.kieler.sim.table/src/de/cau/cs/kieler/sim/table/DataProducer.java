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

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.sim.table.views.DataTableView;

import java.util.Random;

public class DataProducer extends JSONStringDataComponent implements
		IJSONStringDataComponent {

	/**
	 * Instantiates a new data producer.
	 */
	public DataProducer() {
		// TODO Auto-generated constructor stub
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent#step(java.lang.String)
	 */
	public String step(String JSONString) {
		//try{Thread.sleep(new Random().nextInt(200));}catch(Exception e){}
		
		String returnString = "";
		
		TableDataList tableDataList = TableDataList.getInstance();
		for (int c = 0; c < tableDataList.size(); c++) {
			TableData tableData = tableDataList.get(c);
			if (tableData.isModified()) {
				if (tableData.isPresent()) {
					if (!returnString.equals(""))
						returnString += ",";
					String key = tableData.getKey();
					String value = tableData.getValue();
					if (value.equals("")) value = "\"\"";
					returnString += "\""+key+"\":"+value+"";
				}
				//we have sent all modified values => reset
				synchronized(tableData) {
					tableData.setModified(false);
				}
			}
		}
		
		//update only if not currently edited
		if (!DataTableView.getInstance().isCurrentlyEdited())
			TableDataList.getInstance().updateView();
		
		returnString = "{" + returnString + "}";
		
//System.out.println(returnString);
		return returnString;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Raw Table Producer initialize");
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return false;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
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
