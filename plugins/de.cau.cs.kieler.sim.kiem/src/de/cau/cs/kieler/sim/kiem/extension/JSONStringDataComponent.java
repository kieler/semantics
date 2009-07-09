package de.cau.cs.kieler.sim.kiem.extension;

public abstract class JSONStringDataComponent 
							extends DataComponent 
							implements IJSONStringDataComponent {
	
	//constructor
	public JSONStringDataComponent() {
		super();
		this.setJSON(false);
	}
	
	//if this DataComponent implements a consumer, 
	//provide some key's of interest 
	public String[] getFilterKeys() {
		return null;
	}
	
	//if this DataComponent implements a consumer, 
	//it only wants delta values since tick number (default 0 = all)
	public int getDelta() {
		return 0;
	}
	
}
