package de.cau.cs.kieler.synccharts.text.kits.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.reconstr.impl.ValueSerializer;

public class KitsValueSerializer extends ValueSerializer {

	/**
	 * Customized Computation of serialized ouput fragments.
	 * In particular this is to suppress the explicit '1' of the action's delay attribute. 
	 */
	public String serializeAssignedValue(EObject context, RuleCall ruleCall, Object value, AbstractNode node) {
		return super.serializeAssignedValue(context, ruleCall, value, node);
	}

	public String serializeUnassignedValue(EObject context, RuleCall ruleCall, AbstractNode node) {
		
		return super.serializeUnassignedValue(context, ruleCall, node);
	}
	
	public boolean isValid(EObject context, RuleCall ruleCall, Object value, IErrorAcceptor errorAcceptor) {
		return super.isValid(context, ruleCall, value, errorAcceptor);
	}

	
	
}
