package de.cau.cs.kieler.synccharts.text.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parsetree.reconstr.impl.ValueSerializer;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * Class is currently NOT used.
 * 
 * @author chsch
 *
 */
public class ActionsValueSerializer extends ValueSerializer {

	/**
	 * Customized Computation of serialized output fragments.
	 * In particular this is to suppress the explicit '1' of the action's delay attribute.
	 * 
	 * Method is currently not used, behavior will be realized by the transient value service.
	 */
	public String serializeAssignedValue(EObject context, RuleCall ruleCall, Object value, INode node) {
		if (SyncchartsPackage.eINSTANCE.getAction().isInstance(context)
				&& XtextPackage.eINSTANCE.getAssignment().isInstance(ruleCall.eContainer())) {
				Assignment assigment = (Assignment) ruleCall.eContainer();
			
				if (SyncchartsPackage.eINSTANCE.getAction_Delay().getName().equals(assigment.getFeature())
						&& value.equals(1)) {
					return null;
				}
		}
		return super.serializeAssignedValue(context, ruleCall, value, node);
	}

	public String serializeUnassignedValue(EObject context, RuleCall ruleCall, INode node) {
		return super.serializeUnassignedValue(context, ruleCall, node);
	}
	
	public boolean isValid(EObject context, RuleCall ruleCall, Object value, IErrorAcceptor errorAcceptor) {
		return super.isValid(context, ruleCall, value, errorAcceptor);
	}

	
	
}
