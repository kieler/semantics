package de.cau.cs.kieler.synccharts.dsl.validation;

import org.eclipse.xtext.validation.Check;

import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

public class KitsJavaValidator extends AbstractKitsJavaValidator {

	@Check
	public void checkEmitOnlyOutput(Emission emission) {
		if (!(emission.getSignal().isIsOutput())) {
			warning("Only output signals can be emitted!",
					SyncchartsPackage.EMISSION__SIGNAL);

		}
	}

}
