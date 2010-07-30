package de.cau.cs.kieler.synccharts.text.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.reconstr.impl.ValueSerializer;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

public class ActionsValueSerializer extends ValueSerializer {

	/**
	 * Customized Computation of serialized ouput fragments.
	 * In particular this is to suppress the explicit '1' of the action's delay attribute. 
	 */
	public String serializeAssignedValue(EObject context, RuleCall ruleCall, Object value, AbstractNode node) {
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

	public String serializeUnassignedValue(EObject context, RuleCall ruleCall, AbstractNode node) {
		return super.serializeUnassignedValue(context, ruleCall, node);
	}
	
	public boolean isValid(EObject context, RuleCall ruleCall, Object value, IErrorAcceptor errorAcceptor) {
		return super.isValid(context, ruleCall, value, errorAcceptor);
	}

	
	
}
