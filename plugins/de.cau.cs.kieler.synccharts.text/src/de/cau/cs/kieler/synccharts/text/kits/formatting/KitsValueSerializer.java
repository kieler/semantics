package de.cau.cs.kieler.synccharts.text.kits.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.reconstr.impl.ValueSerializer;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

public class KitsValueSerializer extends ValueSerializer {

	public String serializeAssignedValue(EObject context, RuleCall ruleCall, Object value, AbstractNode node) {
		return super.serializeAssignedValue(context, ruleCall, value, node);
	}
	
	/**
	 * Customized Computation of serialized output fragments.
	 * In particular, this serializes the keyword state, no matter it was mentioned in the source.
	 */
	public String serializeUnassignedValue(EObject context, RuleCall ruleCall, AbstractNode node) {
		if (SyncchartsPackage.eINSTANCE.getState().isInstance(context)) {
			return new String("state");
		}
		return super.serializeUnassignedValue(context, ruleCall, node);
	}
	
	public boolean isValid(EObject context, RuleCall ruleCall, Object value, IErrorAcceptor errorAcceptor) {
		return super.isValid(context, ruleCall, value, errorAcceptor);
	}

	
	
}
