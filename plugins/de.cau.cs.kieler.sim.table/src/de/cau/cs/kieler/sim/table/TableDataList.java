package de.cau.cs.kieler.sim.table;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.TableViewer;

public class TableDataList {
	
	private List<TableData> tableDataList;
	private static TableDataList content;

	public TableDataList() {
		tableDataList = new ArrayList<TableData>();
		this.add(new TableData("A","0"));
		this.add(new TableData("B","0"));
		this.add(new TableData("R","0"));
		this.add(new TableData("O","0"));
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
		content = new TableDataList();
		return content;
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
