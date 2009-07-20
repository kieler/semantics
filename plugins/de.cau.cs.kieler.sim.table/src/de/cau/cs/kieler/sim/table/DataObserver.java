package de.cau.cs.kieler.sim.table;

import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.JSONArray;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.sim.table.views.DataTableView;

public class DataObserver extends JSONStringDataComponent implements
		IJSONStringDataComponent {

	public DataObserver() {
		// TODO Auto-generated constructor stub
	}

	public String step(String JSONString) {
		//set all entries to absent per default
		//boolean modified = false;
		for (int c = 0; c < TableDataList.getInstance().size(); c++) {
			TableData tableData = TableDataList.getInstance().get(c);
			if (tableData.isPresent()&&(!tableData.isModified())) {
				//modified = true;
				tableData.setPresent(false);
			}
		}
		
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
					if (obj instanceof JSONArray) {
						value = ((JSONArray)obj).toString();
					}
					else {
						value = (String)obj;
					}
					//add to table or update table
					if (TableDataList.getInstance().contains(key)) {
						//update
						TableData data = TableDataList.getInstance().get(key);
						data.setValue(value);
						data.setPresent(true);
						//modified = true;
					}
					else {
						//add
						TableDataList.getInstance().add(new TableData(TableDataList.getInstance(),
													true, 
													key,
													value));
						//modified = true;
					}
				}
				//if (modified)
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		//update only if not currently edited
		if (!DataTableView.getInstance().isCurrentlyEdited())
			TableDataList.getInstance().updateView();
		
		//Slow down so that user can eye-catch all changes!
		try{Thread.sleep(250);}catch(Exception e){}
		//try{Thread.sleep(new Random().nextInt(200));}catch(Exception e){}
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
}
