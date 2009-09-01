/**
 * 
 */
package de.cau.cs.kieler.synccharts.dsl.rtsys.serialization;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * @author oba
 * 
 */
public class RetypingSyncchartsTransientValueService implements
		ITransientValueService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isMixedList
	 * (org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	public boolean isMixedList(EObject owner, EStructuralFeature feature) {
		if ((owner instanceof State && (
				   feature.equals(SyncchartsPackage.eINSTANCE.getState_ParentRegion()))))
			return true;
		else
			return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isTransient
	 * (org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature,
	 * int)
	 */
	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature,
			int index) {
		// TODO Auto-generated method stub
		return false;
	}

}
