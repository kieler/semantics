package de.cau.cs.kieler.synccharts.text.kits;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.core.expressions.Variable;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;

public class CustomTransientValueService extends DefaultTransientValueService {

	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		if (owner instanceof State && feature == SyncchartsPackage.eINSTANCE.getState_ParentRegion())
			return true;
		if (owner instanceof State && feature == SyncchartsPackage.eINSTANCE.getScope_Id())
			return true;
		if (owner instanceof State && feature == SyncchartsPackage.eINSTANCE.getState_IncomingTransitions())
			return true;
		if (owner instanceof Region && feature == SyncchartsPackage.eINSTANCE.getRegion_ParentState())
			return true;
		if (owner instanceof Region && feature == SyncchartsPackage.eINSTANCE.getScope_Id())
			return true;
		if (owner instanceof Transition && feature == SyncchartsPackage.eINSTANCE.getTransition_SourceState())
			return true;
		if (owner instanceof Transition && feature == SyncchartsPackage.eINSTANCE.getAction_Label())
			return true;
		if (owner instanceof Variable && feature == ExpressionsPackage.eINSTANCE.getVariable_Value())
			return true;
//		if (owner instanceof SignalReference && feature.getFeatureID() == SyncchartsPackage.SIGNAL_REFERENCE__PARENT_ACTION)
//			return true;
//		if (owner instanceof SignalReference && feature.getFeatureID() == SyncchartsPackage.SIGNAL_REFERENCE__PARENT_ASSIGNMENT)
//			return true;
//		if (owner instanceof SignalReference && feature.getFeatureID() == SyncchartsPackage.SIGNAL_REFERENCE__PARENT_EMISSON)
//			return true;
//		if (owner instanceof SignalReference && feature.getFeatureID() == SyncchartsPackage.SIGNAL_REFERENCE__PARENT_EXPRESSION)
//			return true;
//		if (owner instanceof SignalReference && feature.getFeatureID() == SyncchartsPackage.SIGNAL_REFERENCE__SIGNAL)
//			return false;
//		if (owner instanceof Emission && feature.getFeatureID() == SyncchartsPackage.EMISSION__PARENT_EACTION)
//		    return true;
//		if (owner instanceof Emission && feature.getFeatureID() == SyncchartsPackage.EMISSION__SIGNAL)
//			return false;
		return feature.isTransient() || !owner.eIsSet(feature);
	}
	
}
