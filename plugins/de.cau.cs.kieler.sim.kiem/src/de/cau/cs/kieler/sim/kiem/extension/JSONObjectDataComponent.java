package de.cau.cs.kieler.sim.kiem.extension;

public abstract class JSONObjectDataComponent 
							extends DataComponent 
							implements IJSONObjectDataComponent {
	
	//constructor
	public JSONObjectDataComponent() {
		super();
		this.setJSON(true);
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
