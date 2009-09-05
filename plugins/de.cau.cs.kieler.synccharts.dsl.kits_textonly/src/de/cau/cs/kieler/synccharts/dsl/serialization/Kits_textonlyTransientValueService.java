/**
 * 
 */
package de.cau.cs.kieler.synccharts.dsl.serialization;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * @author oba
 * 
 */
public class Kits_textonlyTransientValueService implements
		ITransientValueService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isMixedList
	 * (org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
	 */
	public boolean isMixedList(EObject owner, EStructuralFeature feature) {
		// TODO Auto-generated method stub
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
	public boolean isTransient(EObject owner, EStructuralFeature feature,
			int index) {

		if ((owner instanceof State && (feature
				.equals(SyncchartsPackage.eINSTANCE.getName()))))
			return true;
		else
			return false;
	}

}
