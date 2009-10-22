package de.cau.cs.kieler.synccharts.dsl;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;

@Deprecated
public class CreateStateWithId {

	public final static void createNewState(String id) {
		SyncchartsFactory factory = SyncchartsFactory.eINSTANCE;
		State myState = factory.createState();
		myState.setId(id);
		System.out.println("moin, ich bin's dolly");
	}

}
