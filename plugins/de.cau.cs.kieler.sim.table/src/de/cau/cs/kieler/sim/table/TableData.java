package de.cau.cs.kieler.sim.table;

public class TableData {

	private TableDataList tableDataList;
	
	private boolean present;
	private String  key;
	private String 	value;
	private boolean modified;
	
	public TableDataList getParentTableDataList() {
		return tableDataList;
	}
	
	public TableData(TableDataList parentTableDataList) {
		this.tableDataList = parentTableDataList;
		this.present = true;
		this.key = "";
		this.value = "";
		this.modified = false;
	}
	public TableData(TableDataList parentTableDataList, 
					 String key) {
		this.tableDataList = parentTableDataList;
		this.present = true;
		this.key = key;
		this.value = "";
	}
	public TableData(TableDataList parentTableDataList, 
			         String key, 
			         String value) {
		this.tableDataList = parentTableDataList;
		this.present = true;
		this.key = key;
		this.value = value;
	}
	public TableData(TableDataList parentTableDataList, 
					 boolean present, 
					 String key, 
					 String value) {
		this.tableDataList = parentTableDataList;
		this.present = present;
		this.key = key;
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	public String getKey() {
		return this.key;
	}
	public boolean isPresent() {
		return this.present;
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
	
	public void setModified(boolean modified) {
		this.modified = modified;
	}
	public boolean isModified() {
		return this.modified;
	}
	
}
