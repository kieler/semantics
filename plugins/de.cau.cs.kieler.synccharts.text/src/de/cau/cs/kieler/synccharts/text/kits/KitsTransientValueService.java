package de.cau.cs.kieler.synccharts.text.kits;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

public class KitsTransientValueService extends DefaultTransientValueService {

	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		if (feature == SyncchartsPackage.eINSTANCE.getState_ParentRegion() 
			|| feature == SyncchartsPackage.eINSTANCE.getScope_Id()
			|| feature == SyncchartsPackage.eINSTANCE.getScope_InterfaceDeclaration()
			|| feature == SyncchartsPackage.eINSTANCE.getState_IncomingTransitions()
			|| feature == SyncchartsPackage.eINSTANCE.getRegion_ParentState()
//			|| feature == SyncchartsPackage.eINSTANCE.getScope_Id()
			|| feature == SyncchartsPackage.eINSTANCE.getTransition_SourceState()
			|| feature == SyncchartsPackage.eINSTANCE.getAction_Label()) {
			return true;
		}
		
		if (feature == SyncchartsPackage.eINSTANCE.getState_Type()) {
			boolean b =  owner.eGet(feature).equals(StateType.NORMAL);				
			return b;
		}
		return feature.isTransient() || !owner.eIsSet(feature);
	}
	
}
