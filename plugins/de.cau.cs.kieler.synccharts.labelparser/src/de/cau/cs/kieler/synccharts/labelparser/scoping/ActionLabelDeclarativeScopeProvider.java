package de.cau.cs.kieler.synccharts.labelparser.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.SignalReference;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.ValuedObject;

public class ActionLabelDeclarativeScopeProvider extends
		AbstractDeclarativeScopeProvider {

	public static EObject parent;

	IScope scope_Signal(SignalReference sigRef, EReference ref) {
		//EObject parent = getParentContainer(sigRef);
		// FIXME: getting the parent from a static variable is pretty evil
		return new ValuedObjectScope(parent);
	}
	
	IScope scope_Emission(SignalReference sigRef, EReference ref) {
		//EObject parent = getParentContainer(sigRef);
		// FIXME: getting the parent from a static variable is pretty evil
		return new ValuedObjectScope(parent);
	}
	
	IScope scope_Assignment(SignalReference sigRef, EReference ref) {
		//EObject parent = getParentContainer(sigRef);
		// FIXME: getting the parent from a static variable is pretty evil
		return new ValuedObjectScope(parent);
	}
	

	/**
	 * Search for the parent state or region of the action. FIXME: Unfortunately
	 * this does not work for Xtext generated Actions, as they are not contained
	 * in the SyncCharts model during their parsing and linking phase.
	 * @param expression
	 * @return
	 */
	private static EObject getParentContainer(final Expression expression) {
		if (expression.getParentExpression() != null) {
			// recuresive call if we have a complex expression
			return getParentContainer(expression.getParentExpression());
		}
		Action parentAction = expression.getParentAction();
		if (parentAction == null && expression.getParentAssignment() != null) {
			parentAction = expression.getParentAssignment().getParentEAction();
		}
		if (parentAction == null && expression.getParentEmisson() != null) {
			parentAction = expression.getParentEmisson().getParentEAction();
		}
		if (parentAction != null) {
			State containerState = (State) parentAction.eContainer();

			if (containerState == null && parentAction instanceof Transition) {
				containerState = ((Transition)parentAction).getSourceState();
			}
			if (containerState == null) {
				containerState = parentAction.getParentStateEntryAction();
			}
			if (containerState == null) {
				containerState = parentAction.getParentStateExitAction();
			}
			if (containerState == null) {
				containerState = parentAction.getParentStateInnerAction();
			}
			if (containerState == null) {
				containerState = parentAction.getParentStateSuspension();
			}

			if (containerState != null) {
				if (parentAction instanceof Transition) {
					// a transition is owned by its source state so the right
					// scope is the source's parent region
					return containerState.getParentRegion();
				}
				// any other action is owned by the state which is the right
				// scope
				return containerState;
			}
		}
		// this should never happen as every expression is contained somewhere
		return null;
	}

}
