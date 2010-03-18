package de.cau.cs.kieler.synccharts.textual.validation;

import org.eclipse.xtext.validation.Check;

import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

public class KitsJavaValidator extends AbstractKitsJavaValidator {

	@Check
	//to test if/when this check is activated
	public void checkEmitOnlyOutput(Emission emission) {
		if (!(emission.getSignal().isIsOutput())) {
			warning("Only output signals can be emitted!",
					SyncchartsPackage.EMISSION__SIGNAL);

		}
	}

}
