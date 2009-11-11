/**
 * 
 */
package de.cau.cs.kieler.synccharts.dsl.kits.serialization;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;

import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Variable;

/**
 * @author oba
 * 
 */
public class KitsTransientValueService implements ITransientValueService {
	private static SyncchartsPackage syncPack = SyncchartsPackage.eINSTANCE;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isMixedList
	 * (org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
	 */
	public boolean isMixedList(EObject owner, EStructuralFeature feature) {
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

		if ((owner instanceof State && ((feature.equals(syncPack
				.getState_ParentRegion()))
				|| (feature.equals(syncPack.getState_SuspensionTrigger())) || (feature
				.equals(syncPack.getState_Type()))))
				|| (owner instanceof Region && (feature.equals(syncPack
						.getRegion_ParentState())))
				|| (owner instanceof Expression && ((feature.equals(syncPack
						.getExpression_ParentAction()))
						|| (feature.equals(syncPack
								.getExpression_ParentAssignment()))
						|| (feature.equals(syncPack
								.getExpression_ParentEmisson())) || (feature
						.equals(syncPack.getExpression_ParentExpression()))))
				|| (owner instanceof Effect && (feature.equals(syncPack
						.getEffect_ParentEAction())))
				|| (owner instanceof Signal && ((feature.equals(syncPack
						.getSignal_ParentRegion())) || (feature.equals(syncPack
						.getSignal_ParentState()))))
				|| (owner instanceof Variable && (feature.equals(syncPack
						.getVariable_ParentRegion())))
				/**
				 * It is important that you mark features that are not set as
				 * transient. See
				 * {@link org.eclipse.xtext.parsetree.reconstr.impl. DefaultTransientValueService}
				 */
				|| (!(owner.eIsSet(feature)))) {
			// System.out.println("=============================================");
			// System.out.println("======== NOT SERIALIZED =======");
			// System.out.println("owner: " + owner.toString());
			// System.out.println("feature " + feature.toString());
			// System.out.println("=============================================");
			return true;
		}
		return false;
	}
}
