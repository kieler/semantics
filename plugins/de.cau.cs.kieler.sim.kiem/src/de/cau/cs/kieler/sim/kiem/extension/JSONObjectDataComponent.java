package de.cau.cs.kieler.sim.kiem.extension;

public abstract class JSONObjectDataComponent 
							extends DataComponent 
							implements IJSONObjectDataComponent {
	
	//constructor
	public JSONObjectDataComponent() {
		super();
		this.setJSON(true);
	}
	

}
