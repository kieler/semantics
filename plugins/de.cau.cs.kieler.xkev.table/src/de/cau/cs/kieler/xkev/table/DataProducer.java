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

package de.cau.cs.kieler.xkev.table;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeWorkspaceFile;
import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.xkev.table.views.DataTableView;
import de.cau.cs.kieler.xkev.table.views.TableData;
import de.cau.cs.kieler.xkev.table.views.TableDataList;

/**
 * The class DataProducer implements the producer DataComponent which
 * should be scheduled before any observer DataComponents. In its
 * {@link #step(String)} method it produces data according to the
 * variables and signals that where modified by the user in the
 * table's ViewPart.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class DataProducer extends JSONStringDataComponent implements
		IJSONStringDataComponent {

	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new producer DataComponent.
	 */
	public DataProducer() {
	
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent#step(java.lang.String)
	 */
	public String step(String JSONString) {
		String returnString = "";
		
		TableDataList tableDataList = TableDataList.getInstance();
		if (tableDataList == null) return "{}";
		for (int c = 0; c < tableDataList.size(); c++) {
			TableData tableData = tableDataList.get(c);
			if (tableData.isModified()) {
				if (!returnString.equals("")) returnString += ",";
				String key = tableData.getKey();
				String value = tableData.getValue();
				if (!value.equals("")) returnString += "\""+key+"\":\""+value+"\"";

				//we have sent all modified values => reset
				synchronized(tableData) {
					tableData.setModified(false);
				}
			} else {
				if (!returnString.equals("")) returnString += ",";
                                String key = tableData.getKey();
                                if (key.equals("Gruenphase_Person")) returnString += "\""+key+"\":\"5\"";
                                else returnString += "\""+key+"\":\"\"";
			}
		}
		
		//update only if not currently edited
		if (!DataTableView.getInstance().isCurrentlyEditing())
			TableDataList.getInstance().updateViewAsync();
		
		returnString = "{" + returnString + "}";
		//System.out.println(returnString);
		return returnString;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() {
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		return false;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() {
		//clear table

		
//		TableDataList tableDataList = TableDataList.getInstance();
//		for (int c = tableDataList.size()-1; c >= 0 ; c--) {
//				TableData tableData = tableDataList.get(c);
//				TableDataList.getInstance().remove(tableData.getKey());
//		}
//		TableDataList.getInstance().updateViewAsync();
	}
	
}
